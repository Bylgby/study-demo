package com.martinyuyy.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * created date 2020/8/12 9:49
 * <p>
 * 创建NIO服务端的步骤
 * 1. 打开ServerSocketChannel，监听客户端连接
 * 2. 绑定监听端口，设置连接为非阻塞模式
 * 3. 创建Reactor线程，创建多路复用器并启动线程
 * 4. 将ServerSocketChannel注册到Reactor线程中的Selector上，监听ACCEPT事件
 * 5. Selector轮询准备就绪的key
 * 6. Selector监听到新的客户端接入，处理新的接入请求，完成TCP三次握手，建立物理链路
 * 7. 设置客户端链路为非阻塞模式
 * 8. 将新接入的客户端连接注册到Reactor线程的Selector上，监听读操作，读取客户端发送的网络消息
 * 9. 异步读取客户端消息到缓冲区
 * 10.对Buffer编解码，处理半包消息，将解码成功的消息封装成Task
 * 11.将应答消息编码为Buffer，调用SocketChannel的write将消息异步发送给客户端
 *
 * @author maxiaowei
 */
public class NIOServer {

    private static Selector selector;

    public static void main(String[] args) {
        init();
        listen();
    }

    private static void init() {
        ServerSocketChannel serverSocketChannel = null;

        try {
            selector = Selector.open();
            serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.socket().bind(new InetSocketAddress(9000));
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("NioServer 启动完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void listen() {
        // 轮询
        while (true) {
            try {
                // 轮询查看有链接的channel
                selector.select();
                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey key = iterator.next();
                    iterator.remove();
                    handleRequest(key);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void handleRequest(SelectionKey key) throws IOException {
        SocketChannel channel = null;
        try {
            // 是否是请求连接
            if ( key.isAcceptable() ) {
                ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
                channel = serverSocketChannel.accept();
                channel.configureBlocking(false);
                System.out.println("接收到新的 channel!");
                channel.register(selector, SelectionKey.OP_READ);
            }

            if ( key.isReadable() ) {
                channel = (SocketChannel) key.channel();
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                int count = channel.read(buffer);
                if ( count > 0 ) {
                    System.out.println("服务端接收到请求：" + new String(buffer.array(), 0, count));
                    channel.register(selector, SelectionKey.OP_WRITE);
                }
            }

            if ( key.isWritable() ) {
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                buffer.put("收到".getBytes());
                buffer.flip();
                channel = (SocketChannel) key.channel();
                channel.write(buffer);
                channel.register(selector, SelectionKey.OP_READ);
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

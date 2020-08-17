package com.martinyuyy.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * NIO 实例
 * <br>
 * created date 2019/12/29 14:35
 *
 * @author maxiaowei
 */

public class NIODemo {

    public static void main(String[] args) throws Exception {
        ServerSocketChannel server = ServerSocketChannel.open().bind(new InetSocketAddress(8881));
        server.configureBlocking(false);
        Selector selector = Selector.open();
        server.register(selector, SelectionKey.OP_ACCEPT);
        for (; ; ) {
            selector.select();
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = keys.iterator();
            while (iterator.hasNext()) {
                SelectionKey next = iterator.next();
                if (next.isAcceptable()) {
                    acceptHandle(next, selector);
                }
                if (next.isReadable()) {
                    doRead(next, selector);
                }
                iterator.remove();
            }
            Thread.sleep(2000);
        }
    }

    public static void doRead(SelectionKey key, Selector selector) throws IOException {
        SocketChannel socketChannel = (SocketChannel) key.channel();
        ByteBuffer buffer = (ByteBuffer) key.attachment();
        buffer.clear();
        int read = socketChannel.read(buffer);
        int msg = buffer.getInt(0);
        System.out.println("服务器收到客户端" + socketChannel.getLocalAddress() + "  " + msg);
        buffer.rewind();
        buffer.putInt(msg + 1);
        buffer.flip();
        socketChannel.write(buffer);
        //buffer.clear();
    }

    public static void acceptHandle(SelectionKey key, Selector selector) throws IOException {
        ServerSocketChannel serverShannel = (ServerSocketChannel) key.channel();
        SocketChannel channel = serverShannel.accept();
        channel.configureBlocking(false);
        channel.register(selector, SelectionKey.OP_READ, ByteBuffer.allocate(1024));
    }
}

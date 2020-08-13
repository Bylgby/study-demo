package com.martinyuyy.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * created date 2020/8/12 10:19
 *
 * @author maxiaowei
 */
public class NIOClient {

    public static void main(String[] args) {
        new Thread(new Worker()).start();
    }

    static class Worker implements Runnable {


        @Override
        public void run() {
            SocketChannel channel = null;
            Selector selector = null;

            try {
                channel = SocketChannel.open();
                channel.configureBlocking(false);
                selector = Selector.open();
                channel.register(selector, SelectionKey.OP_CONNECT);
                channel.connect(new InetSocketAddress(9000));
                while (true) {
                    selector.select();
                    Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                    while (iterator.hasNext()) {
                        SelectionKey key = iterator.next();
                        iterator.remove();
                        if ( key.isConnectable() ) {
                            System.out.println("请求连接");
                            channel = (SocketChannel) key.channel();
                            if ( channel.isConnectionPending() ) {
                                channel.finishConnect();
                                ByteBuffer buffer = ByteBuffer.allocate(1024);
                                buffer.put("你好".getBytes());
                                buffer.flip();
                                channel.write(buffer);
                            }

                            channel.register(selector, SelectionKey.OP_READ);
                        }
                        if ( key.isReadable() ) {
                            channel = (SocketChannel) key.channel();
                            ByteBuffer buffer = ByteBuffer.allocate(1024);
                            int len = channel.read(buffer);
                            if ( len > 0 ) {
                                System.out.println("[" + Thread.currentThread().getName() + "]收到响应：" + new String(buffer.array(), 0, len));
                                Thread.sleep(5000);
                                channel.register(selector, SelectionKey.OP_WRITE);
                            }
                        }
                        if ( key.isWritable() ) {
                            ByteBuffer buffer = ByteBuffer.allocate(1024);
                            buffer.put("你好".getBytes());
                            buffer.flip();

                            channel = (SocketChannel) key.channel();
                            channel.write(buffer);
                            channel.register(selector, SelectionKey.OP_READ);
                        }
                    }
                }

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            } finally {
                if ( channel != null ) {
                    try {
                        channel.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if ( selector != null ) {
                    try {
                        selector.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

package com.martinyuyy.algorithm.queue;

/**
 * created date 2020/1/26 12:55
 *
 * @author maxiaowei
 */
public interface Queue<E> {

    void enqueue(E e);

    E dequeue();

    E getFront();

    int getSize();

    boolean isEmpty();

}

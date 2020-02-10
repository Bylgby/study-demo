package com.martinyuyy.algorithm.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * created date 2020/1/26 12:56
 *
 * @author maxiaowei
 */
public class ArrayQueue<E> implements Queue<E> {

    List<E> array;

    public ArrayQueue() {
        array = new ArrayList<>();
    }

    @Override
    public void enqueue(E e) {
        array.add(e);
    }

    @Override
    public E dequeue() {
        if (array.isEmpty()) {
            return null;
        }
        E e = array.get(0);
        array.remove(0);
        return e;
    }

    @Override
    public E getFront() {
        return array.get(0);
    }

    @Override
    public int getSize() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "array=" + array +
                '}';
    }

    public static void main(String[] args) {
        java.util.Queue queue = new ArrayBlockingQueue(10);
    }
}

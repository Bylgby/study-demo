package com.martinyuyy.algorithm.queue;

import java.util.Arrays;

/**
 * 循环队列
 * created date 2020/1/26 13:15
 *
 * @author maxiaowei
 */
public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    // 队尾的索引
    private int tail;
    // 队首的索引
    private int front;

    private int size;

    public LoopQueue(int capacity) {
        data = (E[])new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue() {
        this(10);
    }

    public int getCapacity() {
        return data.length -1;
    }

    @Override
    public void enqueue(E e) {
        if ((tail + 1) % data.length == front) {
            resize(getCapacity() * 2);
        }
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("");
        }
        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }
        return ret;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is Empty!");
        }
        return data[front];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    private void resize(int newcapacity){
        E[] newData = (E[]) new Object[newcapacity + 1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(front + i) % data.length];
        }
        data = newData;
        front =0;
        tail = size;

    }

    @Override
    public String toString() {
        return "LoopQueue{" +
                "data=" + Arrays.toString(data) +
                ", tail=" + tail +
                ", front=" + front +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Queue queue = new LoopQueue();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}

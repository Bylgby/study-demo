package com.martinyuyy.algorithm.stack;

import com.martinyuyy.algorithm.linkedlist.LinkedListDemo;


/**
 * 使用链表实现栈
 * created date 2020/2/1 12:15
 *
 * @author maxiaowei
 */
public class LinkedListStack<E> implements Stack<E>{

    private LinkedListDemo<E> list;

    public LinkedListStack(){
        list = new LinkedListDemo<>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top ");
        res.append(list);
        return res.toString();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
}

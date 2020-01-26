package com.martinyuyy.algorithm.stack;

/**
 *  栈 顶级接口
 * created date 2020/1/26 12:05
 *
 * @author maxiaowei
 */
public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();

}

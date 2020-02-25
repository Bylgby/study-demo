package com.martinyuyy.algorithm.set;

/**
 * created date 2020/2/25 10:26
 *
 * @author maxiaowei
 */
public interface Set<E> {


    void add(E e);

    void remove(E e);

    boolean contains(E e);

    int getSize();

    boolean isEmpty();
}

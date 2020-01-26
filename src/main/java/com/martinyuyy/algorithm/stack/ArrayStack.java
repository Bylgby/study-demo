package com.martinyuyy.algorithm.stack;

import com.martinyuyy.algorithm.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * created date 2020/1/26 12:06
 *
 * @author maxiaowei
 */
public class ArrayStack<E> implements Stack<E> {

    List<E> array;

    public ArrayStack(int capacity){
        array = new ArrayList<>(capacity);
    }

    public ArrayStack(){
        array = new ArrayList<>();
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
    public void push(E e) {
        array.add(e);
    }

    @Override
    public E pop() {
        E e = array.get(array.size() - 1);
        array.remove(array.get(array.size() - 1));
        return e;
    }

    @Override
    public E peek() {
        return array.get(0);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: [");
        res.append(Arrays.toString(array.toArray()));
        res.append("]");
        return res.toString();
    }
}

package com.martinyuyy.algorithm;

import java.util.Arrays;

/**
 *  自定义的数组Demo
 * created date 2020/1/21 15:47
 *
 * @author maxiaowei
 */
public class Array {

    private int[] data;

    private int index;


    public Array(int capacity){
        data = new int[capacity];
        index = 0;
    }

    public Array(){
        this(10);
    }

    public int getIndex(){
        return index;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return index == 0;
    }

    public void addLast(int num) {
        add(this.index, num);
    }

    public void add(int e, int index){
        if (this.index >= data.length) {
            throw new IllegalArgumentException("add failed! Array is full");
        }
        if (index < 0 || index > this.index) {
            throw new IllegalArgumentException("");
        }
        move(this.index - 1, index);
        data[index] = e;
        this.index ++;
    }

    private void move(int i, int index) {
        data[i + 1] = data[i];
        if (i == index) {
            return;
        }

        i--;
        move(i, index);
    }

    @Override
    public String toString() {
        return "Array{" +
                "data=" + Arrays.toString(data) +
                ", index=" + index +
                '}';
    }

    public static void main(String[] args) {
        Array array = new Array();
        array.addLast(1);
        array.addLast(2);
        array.addLast(3);
        array.addLast(4);
        System.out.println(array);
        array.add(11, 1);
        System.out.println(array);
    }
}

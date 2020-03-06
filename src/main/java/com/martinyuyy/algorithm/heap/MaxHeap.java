package com.martinyuyy.algorithm.heap;


import java.util.ArrayList;

/**
 * created date 2020/3/6 9:47
 * 最大堆
 * <p>
 * 1. 堆也是一种树形结构
 * 2. 对是一个完全二叉树
 * 3. 完全二叉树的定义： 将各个元素从根节点开始从左到右一次存放，即为一颗完全二叉树
 * 4. 最大堆的意思就是，每个节点的父节点都大于其任意子节点， 故而 root节点为最大的节点
 *
 * @author maxiaowei
 */
public class MaxHeap<E extends Comparable<E>> {


    private ArrayList<E> data;

    public MaxHeap(int capacity) {
        data = new ArrayList<>(capacity);
    }

    public MaxHeap() {
        data = new ArrayList<>();
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    // 返回完全二叉树中index下标的元素的父节点的索引
    private int parent(int index) {
        if ( index == 0 ) {
            throw new IllegalArgumentException("index-0 doesn`t have parent");
        }
        return (index - 1) / 2;
    }

    // 左孩子
    private int leftChild(int index) {
        return (index * 2) + 1;
    }

    // 右孩子
    private int rightChild(int index) {
        return (index * 2) + 2;
    }

    // 交换位置
    private void swap(int i, int j) {
        if ( i < 0 || i >= size() || j < 0 || j >= size() ) {
            throw new IllegalArgumentException("Index is Illegal.");
        }

        E t = data.get(i);
        data.set(i, data.get(j));
        data.set(j, t);
    }

    public void add(E e) {
        data.add(e);
        siftUp(data.size() - 1);
    }

    private void siftUp(int k) {
        while (k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0) {
            swap(k, parent(k));
            k = parent(k);
        }
    }

}

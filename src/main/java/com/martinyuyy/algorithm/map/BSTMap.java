package com.martinyuyy.algorithm.map;

/**
 * created date 2020/3/5 9:00
 *
 * @author maxiaowei
 */
public class BSTMap<K extends Comparable<K>, V> implements Map<K, V> {

    private class Node {
        public K key;
        public V value;
        public Node left, right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return key.toString() + ":" + value.toString();
        }
    }

    private Node root;

    private int size;

    public BSTMap() {
        root = null;
        size = 0;
    }

    @Override
    public void add(K key, V value) {
        add(root, key, value);
    }

    // 递归算法，在以node为根节点的树中添加元素,返回添加之后的根节点
    private Node add(Node node, K key, V value) {
        if ( node == null ) {
            size++;
            return new Node(key, value);
        }
        if ( key.compareTo(node.key) < 0 ) {
            node.left = add(node.left, key, value);
        } else if ( key.compareTo(node.key) > 0 ) {
            node.right = add(node.right, key, value);
        } else {
            node.value = value;
        }
        return node;
    }

    @Override
    public V get(K key) {
        Node node = getNode(root, key);

        return node == null ? null : node.value;
    }

    @Override
    public V remove(K key) {
        Node node = getNode(root, key);
        if ( node != null ) {

        }
        return null;
    }

    // 删除以node为根节点的树中key的节点，返回删除之后的根节点
    private Node remove(Node node, K key) {
        if ( node == null ) {
            return null;
        }
        if ( node.key.compareTo(key) < 0 ) {
            node.left = remove(node.left, key);
            return node;
        } else if ( node.key.compareTo(key) > 0 ) {
            node.right = remove(node.right, key);
            return node;
        } else {
            if ( node.left == null ) {
                Node cur = node.right;
                node.right = null;
                size--;
                return cur;
            } else if ( node.right == null ) {
                Node cur = node.left;
                node.left = null;
                size --;
                return cur;
            }
            // 后继， node节点的右子树中最小的节点
            Node successor = getMinNode(node.right);
            successor.right = removeMini(node.right);
            successor.left = node.left;

            node.left = node.right = null;
            return successor;
        }

    }


    // 寻找以node为根节点的最小节点
    private Node getMinNode(Node node) {
        if ( node.left == null ) {
            return node;
        }
        return getMinNode(node.left);
    }

    // 递归删除最小节点
    // 删除以node为跟节点的数中的最小节点
    // 返回删除之后的新的二分搜索树的根
    private Node removeMini(Node node) {
        if (node.left == null) {
            Node right = node.right;
            node.right = null;
            size--;
            return right;
        }
        node.left = removeMini(node.left);
        return node;
    }

    @Override
    public boolean contains(K key) {
        return getNode(root, key) != null;
    }

    // 返回key所在的节点， 每次都以node为根节点
    private Node getNode(Node node, K key) {
        if ( node == null ) {
            return null;
        }
        if ( node.key.compareTo(key) == 0 ) {
            return node;
        } else if ( node.key.compareTo(key) < 0 ) {
            return getNode(node.left, key);
        } else {
            return getNode(node.right, key);
        }

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void set(K key, V value) {
        Node node = getNode(root, key);
        if ( node == null ) {
            throw new IllegalArgumentException(key + "doesn`t exist!");
        } else {
            node.value = value;
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        System.out.println(System.nanoTime());
    }
}

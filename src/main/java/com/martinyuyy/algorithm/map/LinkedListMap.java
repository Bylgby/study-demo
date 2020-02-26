package com.martinyuyy.algorithm.map;

/**
 * created date 2020/2/26 10:21
 *
 * @author maxiaowei
 */
public class LinkedListMap<K, V> implements Map<K, V> {

    private class Node {
        public K key;
        public V value;
        public Node next;

        public Node(K key, V value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Node(K key) {
            this(key, null, null);
        }

        public Node() {
            this(null, null, null);
        }

        @Override
        public String toString() {
            return key.toString() + ":" + value.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedListMap() {
        dummyHead = new Node();
        size = 0;
    }

    private Node getNode(K key) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if ( cur.key.equals(key) ) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    @Override
    public void add(K key, V value) {
        Node node = getNode(key);
        if ( node == null ) {
            dummyHead.next = new Node(key, value, dummyHead.next);
            size++;
        } else {
            node.value = value;
        }

    }

    @Override
    public V get(K key) {
        Node node = getNode(key);
        return node == null ? null : node.value;
    }

    @Override
    public V remove(K key) {
        Node prev = dummyHead;
        while (prev.next != null){
            if (prev.next.key.equals(key)) {
                Node cur = prev.next;
                prev.next = prev.next.next;
                cur.next = null;
                size--;
                return cur.value;
            }
            prev = prev.next;
        }
        return null;
    }

    @Override
    public boolean contains(K key) {
        return getNode(key) != null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void set(K key, V value) {
        Node node = getNode(key);
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
}

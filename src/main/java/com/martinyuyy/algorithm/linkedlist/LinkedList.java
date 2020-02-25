package com.martinyuyy.algorithm.linkedlist;

/**
 * 链表的demo
 * 链表的数据存储在节点（Node）对象中，
 * class Node{
 *     E e; 数据内容
 *     Node next; 下一个节点的信息
 * }
 * 优点： 真正的动态，
 * 缺点：丧失了随机访问的能力
 * created date 2020/2/1 10:54
 *
 * @author maxiaowei
 */
public class LinkedList<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    // 虚拟头节点，是在索引为 0 的节点前面的一个虚拟节点，虚拟节点的存储信息为null，next为 Node（0）
    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    // 获取链表中的元素个数
    public int getSize() {
        return size;
    }

    // 返回链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 在链表中添加元素
    public void add(int index, E e) {
        if ( index < 0 || index > size ) {
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = new Node(e, prev.next);
        size++;
    }

    // 在链表中添加元素
    public void add(E e) {
        dummyHead.next = add(dummyHead.next, e);
    }

    // 递归给链表添加元素，并返回根节点
    private Node add(Node node, E e){
        if (node == null) {
            size++;
            return new Node(e);
        }
        node.next = add(node.next, e);
        return node;
    }

    // 在链表头添加元素
    public void addFirst(E e) {
        add(0, e);
    }

    // 在链表末尾添加元素
    public void addLast(E e) {
        add(size, e);
    }

    // 獲取index的节点数据
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Get failed. Illegal index.");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size);
    }

    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Set failed. Illegal index.");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    public boolean contains(E e) {
        Node cur = dummyHead.next;
        for (int i = 0; i < size; i++) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("Null");
        return res.toString();
    }

    // 删除节点
    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Delete failed. Illegal index.");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node delNode = prev.next;
        prev.next = delNode.next;
        delNode.next = null;
        size--;
        return delNode.e;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size);
    }

    public void removeElement(E e){
        Node prev = dummyHead;
        while (prev.next != null){
            Node cur = prev.next;
            if (cur.e.equals(e)) {
                prev.next = cur.next;
                cur.next = null;
                size--;
                break;
            }
            prev = prev.next;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.add(i);
            System.out.println(linkedList);
        }
        System.out.println(linkedList);
        linkedList.removeElement(0);
        System.out.println(linkedList);
        System.out.println(linkedList.getSize());
    }

}

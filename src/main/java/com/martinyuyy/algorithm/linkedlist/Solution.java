package com.martinyuyy.algorithm.linkedlist;

/**
 * 删除链表中所有值为 val 的元素
 *
 * created date 2020/2/2 12:03
 *
 * @author maxiaowei
 */
public class Solution {


    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int e){
            this.val = e;
        }

        public ListNode(int[] arr){
            if (arr != null && arr.length == 0) {
                throw new IllegalArgumentException("error");
            }
            this.val = arr[0];
            ListNode cur = this;
            for (int i = 1; i < arr.length; i++) {
                cur.next = new ListNode(arr[i]);
                cur = cur.next;
            }
        }

        @Override
        public String toString() {
            StringBuilder res = new StringBuilder();
            ListNode cur = this;
            while (cur != null) {
                res.append(cur.val + "->");
                cur = cur.next;
            }
            res.append("NULL");
            return res.toString();
        }
    }

    public static ListNode removeElements(ListNode head, int val){

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prevNode = dummyHead;
        while (prevNode.next != null) {
            if (prevNode.next.val == val) {
                ListNode delNode = prevNode.next;
                prevNode.next = delNode.next;
                delNode.next = null;
            } else {
                prevNode = prevNode.next;
            }
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 3};
        ListNode listNode = new ListNode(arr);
        System.out.println(listNode);
        removeElements(listNode, 3);
        System.out.println(listNode);
    }
}

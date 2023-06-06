package com.practice.leetcode.linkedlist;

public class ReverseLinkedList {

    class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {

        if (head == null) return null;
        if (head.next == null) return head;
        ListNode prev = null;
        ListNode next = head.next;

        while (next != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

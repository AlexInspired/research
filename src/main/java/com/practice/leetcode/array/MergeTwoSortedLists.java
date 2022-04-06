package com.practice.leetcode.array;

public class MergeTwoSortedLists {

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        ListNode result = null;
        if (list1.val <= list2.val) {
            result = list1;
            doHandle(list1, list2);
        } else {
            result = list2;
            doHandle(list2, list1);
        }
        return result;
    }

    private ListNode doHandle(ListNode list1, ListNode list2) {

        ListNode current1 = list1.next;
        ListNode current2 = list2;

        while (true) {
            if (current1 == null && current2 == null) return list1;
            if (current1 != null) {
                if (current1.val <= current2.val ) {
                    list1 = current1;
                    current1 = current1.next;
                } else {
                    list1.next = current2;
                    current2 = current2.next;
                }
            }
            //handle situation when one of current pointers becomes null
        }
    }


}

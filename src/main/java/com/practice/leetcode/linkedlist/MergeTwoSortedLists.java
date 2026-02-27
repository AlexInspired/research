package com.practice.leetcode.linkedlist;

public class MergeTwoSortedLists {


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        ListNode result = new ListNode(0);

        ListNode currentNode = result;
        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                currentNode.next = list1;

                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }

            currentNode = currentNode.next;

        }
        if (list2 != null) {
            currentNode.next = list2;
            list2 = list2.next;
        } else if (list1 != null) {
            currentNode.next = list1;
            list1 = list1.next;
        }
        return result.next;
    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {

        ListNode  currentNode = new ListNode();
        ListNode  result = currentNode;
        ListNode  p1 = list1;
        ListNode  p2 = list2;

        while(p1 != null || p2 != null) {
            if(p1 == null){
                currentNode.next = new ListNode(p2.val);
                currentNode = currentNode.next;
                p2 = p2.next;
            }
            else if(p2 == null){
                currentNode.next = new ListNode(p1.val);
                currentNode = currentNode.next;
                p1 = p1.next;
            }
            else if(p1.val < p2.val) {
                currentNode.next = new ListNode(p1.val);
                currentNode = currentNode.next;
                p1 = p1.next;
            }
            else {
                currentNode.next = new ListNode(p2.val);
                currentNode = currentNode.next;
                p2 = p2.next;
            }
        }
        return result.next;
    }
}



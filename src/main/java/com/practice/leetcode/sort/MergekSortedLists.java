package com.practice.leetcode.sort;

import java.util.PriorityQueue;

public class MergekSortedLists {
    public class ListNode {
        int val;
        MergekSortedLists.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, MergekSortedLists.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //    lists = [[1,4,5],[1,3,4],[2,6]]
    //    [1,1,2,3,4,4,5,6]
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < lists.length; i++) {
            putListTopHeap(lists[i], pq);
        }
        ListNode result = pollHeap(pq);
        return result;
    }

    void putListTopHeap(ListNode list, PriorityQueue<Integer> pq) {
        while (list != null) {
            pq.offer(list.val);
            list = list.next;
        }
    }

    ListNode pollHeap(PriorityQueue<Integer> pq) {
        ListNode prevNode = null;
        while (pq.size() > 0) {
            if (prevNode == null) {
                prevNode = new ListNode(pq.poll(), null);
                continue;
            }
            ListNode currentNode = new ListNode(pq.poll(), prevNode);
            prevNode = currentNode;
        }
        return prevNode;
    }
}

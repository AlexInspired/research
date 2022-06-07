package com.practice.leetcode.linkedlist;

public class RemoveNthNodeFromEndofList {
      public class ListNode {
          int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy, fast = dummy;
        int counter = 0;

        while(counter <= n){
            fast = fast.next;
            counter++;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next; // stopping at prev

        return dummy.next;

    }
}

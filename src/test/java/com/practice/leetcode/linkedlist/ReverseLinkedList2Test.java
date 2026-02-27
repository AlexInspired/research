package com.practice.leetcode.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedList2Test {

    @Test
    public void test() {
        ReverseLinkedList2 reverseLinkedList = new ReverseLinkedList2();

        ReverseLinkedList2.ListNode n5 = reverseLinkedList.new ListNode(5);
        ReverseLinkedList2.ListNode n4 = reverseLinkedList.new ListNode(4, n5);
        ReverseLinkedList2.ListNode n3 = reverseLinkedList.new ListNode(3, n4);
        ReverseLinkedList2.ListNode n2 = reverseLinkedList.new ListNode(2, n3);
        ReverseLinkedList2.ListNode n1 = reverseLinkedList.new ListNode(1, n2);

        reverseLinkedList.reverseBetween(n1, 2, 4);

        int i = 1;
    }

}
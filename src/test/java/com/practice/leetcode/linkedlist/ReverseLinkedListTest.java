package com.practice.leetcode.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseLinkedListTest {

    @Test
    public void test() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        ReverseLinkedList.ListNode n3 = reverseLinkedList.new ListNode(3);
        ReverseLinkedList.ListNode n2 = reverseLinkedList.new ListNode(2, n3);
        ReverseLinkedList.ListNode n1 = reverseLinkedList.new ListNode(1, n2);

        //then
        assertEquals(3,  reverseLinkedList.reverseList(n1).data);
    }
}
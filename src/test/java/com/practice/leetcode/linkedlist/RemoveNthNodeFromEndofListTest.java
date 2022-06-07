package com.practice.leetcode.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveNthNodeFromEndofListTest {

    @Test
    public void removeNthFromEnd() {
        //given
        RemoveNthNodeFromEndofList removeNthNodeFromEndofList = new RemoveNthNodeFromEndofList();
        RemoveNthNodeFromEndofList.ListNode n13 = removeNthNodeFromEndofList.new ListNode(4, null);
        RemoveNthNodeFromEndofList.ListNode n12 = removeNthNodeFromEndofList.new ListNode(2, n13);
        RemoveNthNodeFromEndofList.ListNode n11 = removeNthNodeFromEndofList.new ListNode(1, n12);

        //when
        RemoveNthNodeFromEndofList.ListNode head = removeNthNodeFromEndofList.removeNthFromEnd(n11, 2);

        //then
        assertEquals(4,  head.next.val);
    }
}
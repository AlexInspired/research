package com.practice.leetcode.sort;

import com.practice.leetcode.linkedlist.RemoveNthNodeFromEndofList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergekSortedListsTest {
    @Test
    public void removeNthFromEnd() {
        //given
        MergekSortedLists mergekSortedLists = new MergekSortedLists();
        MergekSortedLists.ListNode n13 = mergekSortedLists.new ListNode(5, null);
        MergekSortedLists.ListNode n12 = mergekSortedLists.new ListNode(4, n13);
        MergekSortedLists.ListNode n11 = mergekSortedLists.new ListNode(1, n12);

        MergekSortedLists.ListNode n23 = mergekSortedLists.new ListNode(4, null);
        MergekSortedLists.ListNode n22 = mergekSortedLists.new ListNode(3, n23);
        MergekSortedLists.ListNode n21 = mergekSortedLists.new ListNode(1, n22);

        MergekSortedLists.ListNode n32 = mergekSortedLists.new ListNode(6, null);
        MergekSortedLists.ListNode n31 = mergekSortedLists.new ListNode(2, n32);

        MergekSortedLists.ListNode[] lists = new MergekSortedLists.ListNode[]{n11, n21, n31};

        //when
        MergekSortedLists.ListNode head = mergekSortedLists.mergeKLists(lists);

        //then
        //assertEquals(4, head.next.val);
    }
}
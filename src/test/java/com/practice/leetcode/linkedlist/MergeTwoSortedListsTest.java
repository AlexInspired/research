package com.practice.leetcode.linkedlist;

import com.practice.leetcode.linkedlist.MergeTwoSortedLists;
import org.junit.Test;

public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoSortedListsTest() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        MergeTwoSortedLists.ListNode n13 = mergeTwoSortedLists.new ListNode(4, null);
        MergeTwoSortedLists.ListNode n12 = mergeTwoSortedLists.new ListNode(2, n13);
        MergeTwoSortedLists.ListNode n11 = mergeTwoSortedLists.new ListNode(1, n12);

        MergeTwoSortedLists.ListNode n23 = mergeTwoSortedLists.new ListNode(4, null);
        MergeTwoSortedLists.ListNode n22 = mergeTwoSortedLists.new ListNode(3, n23);
        MergeTwoSortedLists.ListNode n21 = mergeTwoSortedLists.new ListNode(1, n22);

        mergeTwoSortedLists.mergeTwoLists(n11, n21);
    }
}

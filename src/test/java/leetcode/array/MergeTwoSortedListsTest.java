package leetcode.array;

import com.practice.leetcode.array.MergeTwoSortedLists;
import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListsTest {

    @Test
    public void testTwoSum() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        MergeTwoSortedLists.ListNode n13 = mergeTwoSortedLists.new ListNode(10, null);
        MergeTwoSortedLists.ListNode n12 = mergeTwoSortedLists.new ListNode(8, n13);
        MergeTwoSortedLists.ListNode n11 = mergeTwoSortedLists.new ListNode(1, n12);

        MergeTwoSortedLists.ListNode n24 = mergeTwoSortedLists.new ListNode(9, null);
        MergeTwoSortedLists.ListNode n23 = mergeTwoSortedLists.new ListNode(8, n24);
        MergeTwoSortedLists.ListNode n22 = mergeTwoSortedLists.new ListNode(6, n23);
        MergeTwoSortedLists.ListNode n21 = mergeTwoSortedLists.new ListNode(5, n22);

        mergeTwoSortedLists.mergeTwoLists(n11, n21);
    }
}

package com.practice.leetcode.trees;

import org.junit.Test;

public class SortedArraytoBinarySearchTreeofMinimalHeightTest {
    @Test
    public void test() {
        // given
        int[] given = new int[]{1, 2, 3, 4, 5, 6};

        SortedArraytoBinarySearchTreeofMinimalHeight sortedArraytoBinarySearchTreeofMinimalHeight = new SortedArraytoBinarySearchTreeofMinimalHeight();

        // when
        TreeNode actualTree = sortedArraytoBinarySearchTreeofMinimalHeight.convert(given, 0, given.length - 1);

    }
}
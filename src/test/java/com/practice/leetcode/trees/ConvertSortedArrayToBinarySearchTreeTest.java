package com.practice.leetcode.trees;

import org.junit.Test;

public class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    public void test() {
        // given
        int[] givenNums = new int[]{-10, -3, 0, 5, 9};

        ConvertSortedArrayToBinarySearchTree binarySearchTree = new ConvertSortedArrayToBinarySearchTree();

        // when
        TreeNode result = binarySearchTree.sortedArrayToBST(givenNums);

    }
}
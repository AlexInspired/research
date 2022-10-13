package com.practice.leetcode.trees;

import org.junit.Test;

public class BinaryTreeCreateLinkedListsOfAllNodesAtEachDepthTest {

    @Test
    public void test() {
        // given
        TreeNode n6 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5, null, n6);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2, n3, n4);
        TreeNode givenTree = new TreeNode(1, n2, n5);

        SortedArraytoBinarySearchTreeofMinimalHeight sortedArraytoBinarySearchTreeofMinimalHeight = new SortedArraytoBinarySearchTreeofMinimalHeight();

        // when
        //  TreeNode actualTree = sortedArraytoBinarySearchTreeofMinimalHeight.proceed(given);

        //then
        // assert .flatten(root);

        int i = 1;
        i++;
    }
}
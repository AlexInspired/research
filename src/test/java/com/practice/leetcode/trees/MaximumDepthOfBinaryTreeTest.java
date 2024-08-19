package com.practice.leetcode.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void test1() {
        // given
        TreeNode n5 = new TreeNode(7, null, null);
        TreeNode n4 = new TreeNode(15, null, null);
        TreeNode n3 = new TreeNode(20, n4, n5);
        TreeNode n2 = new TreeNode(9, null, null);
        TreeNode givenTree = new TreeNode(3, n2, n3);

        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        int expected = 3;

        // when
        int result = maximumDepthOfBinaryTree.maxDepth(givenTree);

        //then
        assertEquals(expected, result);
    }

}
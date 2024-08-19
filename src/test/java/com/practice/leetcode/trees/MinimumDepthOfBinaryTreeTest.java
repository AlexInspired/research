package com.practice.leetcode.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumDepthOfBinaryTreeTest {

    //    [3,9,20,null,null,15,7]
    @Test
    public void test1() {
        // given
        TreeNode n5 = new TreeNode(7, null, null);
        TreeNode n4 = new TreeNode(15, null, null);
        TreeNode n3 = new TreeNode(20, n4, n5);
        TreeNode n2 = new TreeNode(9, null, null);
        TreeNode givenTree = new TreeNode(3, n2, n3);

        MinimumDepthOfBinaryTree minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();
        int expected = 2;

        // when
        int result = minimumDepthOfBinaryTree.minDepth(givenTree);

        //then
        assertEquals(expected, result);
    }
}
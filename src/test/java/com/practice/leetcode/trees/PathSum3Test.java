package com.practice.leetcode.trees;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PathSum3Test {
    @Test
    public void test1() {
        // given
        TreeNode n9 = new TreeNode(11);
        TreeNode n8 = new TreeNode(8);
        TreeNode n7 = new TreeNode(-2);
        TreeNode n6 = new TreeNode(3);
        TreeNode n5 = new TreeNode(2, null, n8);
        TreeNode n4 = new TreeNode(3, n6, n7);
        TreeNode n3 = new TreeNode(-3, null, n9);
        TreeNode n2 = new TreeNode(5, n4, n5);
        TreeNode givenTree = new TreeNode(10, n2, n3);

        PathSum3 pathSum3 = new PathSum3();
        int targetSum = 8;

        // when
        int result = pathSum3.pathSum(givenTree, targetSum);

        //then
        assertEquals(3, result);
    }

}
package com.practice.leetcode.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class PathSumTest {

    @Test
    public void test1() {
        // given
        TreeNode n9 = new TreeNode(1, null, null);
        TreeNode n8 = new TreeNode(4,null, n9);
        TreeNode n7 = new TreeNode(2, null, null);
        TreeNode n6 = new TreeNode(7, null, null);
        TreeNode n5 = new TreeNode(13, null, null);
        TreeNode n4 = new TreeNode(11, n6, n7);
        TreeNode n3 = new TreeNode(8, n5, n8);
        TreeNode n2 = new TreeNode(4, n4, null);
        TreeNode givenTree = new TreeNode(5, n2, n3);

        PathSum pathSum = new PathSum();
        int targetSum = 22;

        // when
        boolean result = pathSum.hasPathSum(givenTree, targetSum);

        //then
        assertTrue(result);
    }

    @Test
    public void test2() {
        // given
        TreeNode n3 = new TreeNode(3, null, null);
        TreeNode n2 = new TreeNode(2, null, null);
        TreeNode givenTree = new TreeNode(1, n2, n3);

        PathSum pathSum = new PathSum();
        int targetSum = 5;

        // when
        boolean result = pathSum.hasPathSum(givenTree, targetSum);

        //then
        assertFalse(result);
    }

    @Test
    public void test3() {
        // given
        TreeNode n2 = new TreeNode(2, null, null);
        TreeNode givenTree = new TreeNode(1, n2, null);

        PathSum pathSum = new PathSum();
        int targetSum = 1;

        // when
        boolean result = pathSum.hasPathSum(givenTree, targetSum);

        //then
        assertFalse(result);
    }
}
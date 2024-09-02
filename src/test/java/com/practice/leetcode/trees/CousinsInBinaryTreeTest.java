package com.practice.leetcode.trees;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CousinsInBinaryTreeTest {

    @Test
    public void test() {
        // given
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3, null, null);
        TreeNode n2 = new TreeNode(2, n4, null);
        TreeNode root = new TreeNode(1, n2, n3);

        CousinsInBinaryTree CousinsInBinaryTree = new CousinsInBinaryTree();

        int x = 4, y = 3;
        boolean actual = CousinsInBinaryTree.isCousins(root, x, y);

        Assert.assertFalse(actual);
    }

    @Test
    public void test1() {
        // given
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3, null, n5);
        TreeNode n2 = new TreeNode(2, null, n4);
        TreeNode root = new TreeNode(1, n2, n3);

        CousinsInBinaryTree CousinsInBinaryTree = new CousinsInBinaryTree();

        int x = 5, y = 4;
        boolean actual = CousinsInBinaryTree.isCousins(root, x, y);

        Assert.assertTrue(actual);
    }

    // 1,2,3,null,4

    @Test
    public void test2() {
        // given
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2, null, n4);
        TreeNode root = new TreeNode(1, n2, n3);

        CousinsInBinaryTree CousinsInBinaryTree = new CousinsInBinaryTree();

        int x = 2, y = 3;
        boolean actual = CousinsInBinaryTree.isCousins(root, x, y);

        Assert.assertFalse(actual);
    }
}
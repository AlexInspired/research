package com.practice.leetcode.trees;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class LongestZigZagPathInABinaryTreeTest {

//    @Ignore
//    @Test
//    public void test() {
//        // given
//        TreeNode n6 = new TreeNode(6, null, null);
//        TreeNode n5 = new TreeNode(5, null, null);
//        TreeNode n4 = new TreeNode(4, n6, null);
//        TreeNode n3 = new TreeNode(3, null, n5);
//        TreeNode n2 = new TreeNode(2, n3, n4);
//        TreeNode root = new TreeNode(1, null, n2);
//
//        LongestZigZagPathInABinaryTree longestZigZagPathInABinaryTree = new LongestZigZagPathInABinaryTree();
//
//        // when
//        int result = longestZigZagPathInABinaryTree.longestZigZag(root);
//
//        //then
//        Assert.assertEquals(3, result);
//    }

    @Test
    public void test2() {
        // given
        TreeNode n6 = new TreeNode(6, null, null);
        TreeNode n8 = new TreeNode(8, null, null);
        TreeNode n7 = new TreeNode(7, null, n8);
        TreeNode n5 = new TreeNode(5, null, n7);
        TreeNode n4 = new TreeNode(4, n5, n6);
        TreeNode n3 = new TreeNode(3, null, null);
        TreeNode n2 = new TreeNode(2, n3, n4);
        TreeNode root = new TreeNode(1, null, n2);

        LongestZigZagPathInABinaryTree longestZigZagPathInABinaryTree = new LongestZigZagPathInABinaryTree();

        // when
        int result = longestZigZagPathInABinaryTree.longestZigZag(root);

        //then
        Assert.assertEquals(3, result);
    }
}
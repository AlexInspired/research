package com.practice.leetcode.trees;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckCompletenessOfABinaryTreeTest {

    @Test
    public void test() {
        // given
        TreeNode n6 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3, n6, null);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode root = new TreeNode(1, n2, n3);

        CheckCompletenessOfABinaryTree checkCompletenessOfABinaryTree = new CheckCompletenessOfABinaryTree();

        boolean actual = checkCompletenessOfABinaryTree.isCompleteTree(root);

        Assert.assertTrue(actual);
    }

    @Test
    public void test1() {
        // given
        TreeNode n6 = new TreeNode(7);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3, null, n6);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode root = new TreeNode(1, n2, n3);

        CheckCompletenessOfABinaryTree checkCompletenessOfABinaryTree = new CheckCompletenessOfABinaryTree();

        boolean actual = checkCompletenessOfABinaryTree.isCompleteTree(root);

        Assert.assertFalse(actual);
    }

}
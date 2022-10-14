package com.practice.leetcode.trees;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidateBinarySearchTreeTest {
    @Test
    public void test2() {
        // given
        TreeNode n3 = new TreeNode(2);
        TreeNode n2 = new TreeNode(2);
        TreeNode givenTree = new TreeNode(2, n2, n3);

        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

        // when
        boolean result = validateBinarySearchTree.isValidBST(givenTree);

        //then
        assertEquals(false, result);
    }

    @Test
    public void test1() {
        // given
        TreeNode n5 = new TreeNode(6);
        TreeNode n4 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4, n4, n5);
        TreeNode n2 = new TreeNode(1);
        TreeNode givenTree = new TreeNode(5, n2, n3);

        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

        // when
        boolean result = validateBinarySearchTree.isValidBST(givenTree);

        //then
        assertEquals(false, result);
    }
}
package com.practice.leetcode.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBinaryTreeTest {

    @Test
    public void test4() {
        // given
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2, null, n3);
        TreeNode givenTree = new TreeNode(1, null, n2);

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

        // when
        boolean result = balancedBinaryTree.isBalanced(givenTree);

        //then
        assertEquals(false, result);
    }

    @Test
    public void test1() {
        // given
        TreeNode n7 = new TreeNode(4);
        TreeNode n6 = new TreeNode(4);
        TreeNode n5 = new TreeNode(3);
        TreeNode n4 = new TreeNode(3, n6,n7);
        TreeNode n3 = new TreeNode(2);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode givenTree = new TreeNode(1, n2, n3);

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

        // when
        boolean result = balancedBinaryTree.isBalanced(givenTree);

        //then
        assertEquals(false, result);
    }

    @Test
    public void test2() {
        // given
        TreeNode n7 = new TreeNode(7);
        TreeNode n6 = new TreeNode(6, n7, null);
        TreeNode n5 = new TreeNode(5, null, n6);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2, n3, n4);
        TreeNode givenTree = new TreeNode(1, n2, n5);

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

        // when
        boolean result = balancedBinaryTree.isBalanced(givenTree);

        //then
        assertEquals(false, result);
    }

    @Test
    public void test3() {
        // given
        TreeNode n8 = new TreeNode(8);
        TreeNode n7 = new TreeNode(7,null, n8);
        TreeNode n6 = new TreeNode(6, n7, null);
        TreeNode n5 = new TreeNode(5, null, n6);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2, n3, n4);
        TreeNode givenTree = new TreeNode(1, n2, n5);

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

        // when
        boolean result = balancedBinaryTree.isBalanced(givenTree);

        //then
        assertEquals(false, result);
    }

}
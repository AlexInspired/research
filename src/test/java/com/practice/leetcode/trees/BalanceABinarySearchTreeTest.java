package com.practice.leetcode.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalanceABinarySearchTreeTest {

    @Test
    public void test() {
        // given
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3, null, n4);
        TreeNode n2 = new TreeNode(2, null, n3);
        TreeNode givenTree = new TreeNode(1, null, n2);

        BalanceABinarySearchTree balanceABinarySearchTree = new BalanceABinarySearchTree();

        // when
        TreeNode result = balanceABinarySearchTree.balanceBST(givenTree);

    }

}
package com.practice.leetcode.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubtreeOfAnotherTreeTest {

    @Test
    public void test1() {
        // given
        TreeNode n5 = new TreeNode(2);
        TreeNode n4 = new TreeNode(1);
        TreeNode n3 = new TreeNode(5);
        TreeNode n2 = new TreeNode(4, n4, n5);
        TreeNode givenTree = new TreeNode(3, n2, n3);

        TreeNode n33 = new TreeNode(2);
        TreeNode n22 = new TreeNode(1);
        TreeNode givenSubTree = new TreeNode(4, n22, n33);

        SubtreeOfAnotherTree subtreeOfAnotherTree = new SubtreeOfAnotherTree();

        // when
        boolean result = subtreeOfAnotherTree.isSubtree(givenTree, givenSubTree);

        //then
        assertEquals(true, result);
    }

    @Test
    public void test2() {
        // given
        TreeNode n6 = new TreeNode(0);
        TreeNode n5 = new TreeNode(2,n6,null);
        TreeNode n4 = new TreeNode(1);
        TreeNode n3 = new TreeNode(5);
        TreeNode n2 = new TreeNode(4, n4, n5);
        TreeNode givenTree = new TreeNode(3, n2, n3);

        TreeNode n33 = new TreeNode(2);
        TreeNode n22 = new TreeNode(1);
        TreeNode givenSubTree = new TreeNode(4, n22, n33);

        SubtreeOfAnotherTree subtreeOfAnotherTree = new SubtreeOfAnotherTree();

        // when
        boolean result = subtreeOfAnotherTree.isSubtree(givenTree, givenSubTree);

        //then
        assertEquals(false, result);
    }
}
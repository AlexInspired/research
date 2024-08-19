package com.practice.leetcode.trees;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvertBinaryTreeTest {

    @Test
    public void test() {
        // given
        TreeNode n7 = new TreeNode(9, null, null);
        TreeNode n6 = new TreeNode(6, null, null);
        TreeNode n5 = new TreeNode(3, null, null);
        TreeNode n4 = new TreeNode(1, null, null);
        TreeNode n3 = new TreeNode(7, n6, n7);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode givenTree = new TreeNode(4, n2, n3);

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

        // when
        invertBinaryTree.invertTree(givenTree);

    }

}
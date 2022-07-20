package com.practice.leetcode.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeIteratorTest {

    @Test
    public void test() {
        // given
        TreeNode n20 = new TreeNode(20);
        TreeNode n9 = new TreeNode(9);
        TreeNode n15 = new TreeNode(15, n9, n20);
        TreeNode n3 = new TreeNode(3);
        TreeNode root = new TreeNode(7, n3, n15);

        BinarySearchTreeIterator binarySearchTreeIterator = new BinarySearchTreeIterator(root);
    }

}
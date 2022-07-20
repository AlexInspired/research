package com.practice.leetcode.trees;

import org.junit.Test;

public class FlattenBinaryTreeToLinkedListTest {

    @Test
    public void test() {
        // given
        TreeNode n6 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5, null, n6);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2, n3, n4);
        TreeNode root = new TreeNode(1, n2, n5);

        FlattenBinaryTreeToLinkedList flattenBinaryTreeToLinkedList = new FlattenBinaryTreeToLinkedList();

        // when
        flattenBinaryTreeToLinkedList.flatten(root);

    }

}
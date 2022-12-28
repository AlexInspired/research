package com.practice.leetcode.trees;

public class MirrorTree {

    public void transform(TreeNode node) {
        if (node == null) {
            return;
        }
        swapChildren(node);
        transform(node.left);
        transform(node.right);
    }

    void swapChildren(TreeNode node) {
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}

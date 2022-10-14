package com.practice.leetcode.trees;

/*
A height balanced binary tree is a binary tree in which the height
of the left subtree and right subtree of any node does not differ
by more than 1 and both the left and right subtree are also height balanced.
*/
public class BalancedBinaryTree {
    private boolean result = true;

    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result;
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1)
            result = false;
        return 1 + Math.max(l, r);
    }
}

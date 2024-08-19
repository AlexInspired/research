package com.practice.leetcode.trees;

public class PathSum {

    public boolean hasPathSum(TreeNode node, int targetSum) {

        if (node == null) {
            return false;
        }

        if (node.left == null && node.right == null) {
            return targetSum == node.val;
        }

        return hasPathSum(node.left, targetSum - node.val) ||
                hasPathSum(node.right, targetSum - node.val);
    }
}

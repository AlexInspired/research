package com.practice.leetcode.trees;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode node) {

       int h = 1;

       return dfs(node, h);

    }

    private int dfs(TreeNode node, int h){
        if (node == null) {
            return  h - 1;
        }

        return Math.max(dfs(node.left, h + 1),
                dfs(node.right, h + 1));
    }

}

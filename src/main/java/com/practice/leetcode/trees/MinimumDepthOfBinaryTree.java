package com.practice.leetcode.trees;

public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        int[] ans = new int[] {Integer.MAX_VALUE};
        return dfs(root, 1, ans);
    }

    int dfs(TreeNode root, int h, int[] ans) {
        if (root == null) {
            return h - 1;
        }
        if(root.left == null && root.right == null){
            ans[0] = Math.min(h, ans[0]);
        }

        dfs(root.left, h + 1, ans);
        dfs(root.right, h + 1, ans);

        return ans[0];
    }
}

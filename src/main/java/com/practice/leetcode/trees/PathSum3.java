package com.practice.leetcode.trees;

import java.util.LinkedList;
import java.util.Queue;

public class PathSum3 {

    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return count;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode temp = q.poll();
                check(temp, 0, targetSum);
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
        return count;
    }

    public void check(TreeNode root, long sum, int target) {
        if (root == null) {
            return;
        }
        if (sum + root.val == (long) target) {
            count += 1;
        }
        check(root.left, sum + root.val, target);
        check(root.right, sum + root.val, target);
    }
}

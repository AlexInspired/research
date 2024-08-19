package com.practice.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTilt {

    public int findTilt(TreeNode root) {

        List<Integer> tilts = new ArrayList<>();
        dfs(root,tilts);
        return tilts.stream()
                .reduce(0, Integer::sum);
    }

    private int dfs(TreeNode node, List<Integer> tilts) {
        if (node == null){
            return 0;
        }

        if(node.left == null && node.right == null){
            return node.val;
        }

        int leftSum = dfs(node.left, tilts);
        int rightSum = dfs(node.right, tilts);
        int nextTilt = Math.abs(rightSum - leftSum);
        tilts.add(nextTilt);
        return rightSum + leftSum + node.val;
    }
}

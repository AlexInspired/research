package com.practice.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root, result, "");
        return result;
    }

    private void dfs(TreeNode node, List<String> paths, String path) {

        if (node == null) {
            return;
        }

        if (path.isEmpty()) {
            path = String.valueOf(node.val);
        } else {
            path = path + "->" + node.val;
        }

        if (node.left == null && node.right == null) {
            paths.add(path);
            return;
        }

        dfs(node.left, paths, path);
        dfs(node.right, paths, path);
    }
}

package com.practice.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class StepByStepDirectionsFromABinaryTreeNodeToAnother {

    public String getDirections(TreeNode root, int startValue, int destValue) {
        // step 1: find the LCA
        final TreeNode node = findLCAInBinaryTree(root, startValue, destValue);

        // step 2: find path for start value
        final StringBuilder startPath = new StringBuilder();
        findNode(node, startValue, startPath);

        // step 2.1: convert start path from top down to bottom up
        for (int i = 0; i < startPath.length(); i++) {
            startPath.setCharAt(i, 'U');
        }

        // step 3. find path for destination value
        final StringBuilder destPath = new StringBuilder();
        findNode(node, destValue, destPath);

        // step 4. combine paths
        return startPath.append(destPath).toString();
    }

    // General solution to find a node in a binary tree for a given key
    // Time complexity: O(N), in the worst case, need to browse all the nodes
    private TreeNode findNode(TreeNode node, int targetValue, StringBuilder path) {
        if (node == null) return null;
        if (node.val == targetValue) return node;

        // explore left subtree
        TreeNode foundNode = findNode(node.left, targetValue, path.append("L"));
        if (foundNode != null) return foundNode;

        // otherwise, revert previous path append
        path.setLength(path.length() - 1);

        // explore right subtree
        foundNode = findNode(node.right, targetValue, path.append("R"));
        if (foundNode != null) return foundNode;

        // otherwise, revert previous path append
        path.setLength(path.length() - 1);

        return null;
    }

    private TreeNode findLCAInBinaryTree(TreeNode node, int startValue, int destValue) {
        if (node == null || node.val == startValue || node.val == destValue) {
            return node;
        }

        // explore left subtree for LCA
        TreeNode leftNode = findLCAInBinaryTree(node.left, startValue, destValue);
        // explore right subtree for LCA
        TreeNode rightNode = findLCAInBinaryTree(node.right, startValue, destValue);

        if (leftNode == null) return rightNode;
        if (rightNode == null) return leftNode;

        // if both are not null, we found the LCA node
        return node;
    }
}

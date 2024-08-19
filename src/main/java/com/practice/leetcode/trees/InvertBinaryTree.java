package com.practice.leetcode.trees;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {

        invert(root);
        return root;
    }

    void invert(TreeNode root) {
        if(root == null){
            return;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        invert(root.left);
        invert(root.right);
    }
}

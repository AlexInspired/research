package com.practice.leetcode.trees;

public class SortedArraytoBinarySearchTreeofMinimalHeight {

    public TreeNode convert(int[] arr, int l, int r) {
        if (l > r) {
            return null;
        }

        Integer middle = (l + r) / 2;

        TreeNode leftNode = convert(arr, l, middle - 1);
        TreeNode rightNode = convert(arr, middle + 1, r);

        TreeNode root = new TreeNode(arr[middle], leftNode, rightNode);
        return root;
    }

}

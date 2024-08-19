package com.practice.leetcode.trees;

public class ConvertSortedArrayToBinarySearchTree {

    //{-10, -3, 0, 5, 9}
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        TreeNode root = binary(0, nums.length - 1, nums);
        return root;
    }

    private TreeNode binary(int l, int r, int[] nums) {
        if (l > r) {
            return null;
        }
        int mid = (l + r) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = binary(l, mid - 1, nums);
        node.right = binary(mid + 1, r, nums);

        return node;
    }
}

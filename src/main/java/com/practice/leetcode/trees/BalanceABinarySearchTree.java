package com.practice.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class BalanceABinarySearchTree {

    // пройти преордером и сделать из дерева отсортирванный массив
    // из массива сделать сбалансированное дерево binary подходом
    public TreeNode balanceBST(TreeNode root) {

        List<Integer> nums = BSTToSortedArray(root);
        int[] paramArray = nums.stream().mapToInt(i->i).toArray();
        root = sortedArrayToBST(paramArray);
        return root;
    }

    private List<Integer> BSTToSortedArray(TreeNode root){
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    private void dfs(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }
        dfs(root.left, list);
        // preorder
        list.add(root.val);
        dfs(root.right, list);
    }

    private TreeNode sortedArrayToBST(int[] nums) {
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

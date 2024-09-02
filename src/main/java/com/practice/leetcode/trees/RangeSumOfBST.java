package com.practice.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class RangeSumOfBST {

    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> sortedList = new ArrayList<>();
        inOrder(root, sortedList);

        int sum = 0;
        for (int i = 0; i < sortedList.size(); i++) {
            var current = sortedList.get(i);
            if( low <= current  && current <= high ){
                sum = sum + current;
            }
        }
        return sum;
    }


    private void inOrder(TreeNode node, List<Integer> sortedList) {
        if (node == null) {
            return;
        }
        inOrder(node.left, sortedList);
        sortedList.add(node.val);
        inOrder(node.right, sortedList);
    }

}

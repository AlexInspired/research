package com.practice.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {
    //In the case of binary search trees (BST), Inorder traversal gives nodes in non-decreasing order
    List<Integer> list = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        traverseInOrder(root);
         return isIncreasing(list);
    }

    void traverseInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        traverseInOrder(node.left);
        visit(node);
        traverseInOrder(node.right);
    }

    private void visit(TreeNode node) {
        list.add(node.val);
    }

    private boolean isIncreasing(List<Integer> given) {

       for(int i = 0; i < given.size() - 1; i++){
            if(given.get(i) >= given.get(i+1)) return false;
       }
       return true;
    }

}

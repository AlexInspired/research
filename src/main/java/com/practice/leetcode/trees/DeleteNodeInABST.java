package com.practice.leetcode.trees;

import com.practice.leetcode.Pair.Pair;

public class DeleteNodeInABST {

    public TreeNode deleteNode(TreeNode root, int key) {

        // Base case: if the root is null, the key is not found in the tree
        if(root == null){
            return root;
        }

        // Recursively search for the key in the left subtree if it is less than the root value
        if(key < root.val){
           root.left = deleteNode(root.left, key);
        }

        // Recursively search for the key in the right subtree if it is greater than the root value
        else if(key > root.val){
           root.right =deleteNode(root.right, key);
        }

        // If the key is equal to the root value, we have found the node to be deleted
        else{

            // Case 1: If the node has no children, we simply set the root to null
            if(root.left == null && root.right == null){
                root = null;
            }

            // Case 2: If the node has only one child, we replace the root with the child
            else if(root.left == null){
                root = root.right;
            }

            else if(root.right == null){
                root = root.left;
            }

            // Case 3: If the node has two children, we find the inorder successor of the node,
            // which is the node with the smallest value in the right subtree. We then replace
            // the value of the root with the value of the inorder successor, and recursively
            // delete the inorder successor node from the right subtree.
            else{
                TreeNode successor = findMin(root.right);
                root.val = successor.val;
                root.right = deleteNode(root.right, successor.val);
            }
        }
        // Return the updated root of the subtree
        return root;
    }

    // Helper method to find the node with the minimum value in the subtree rooted at "node"
    private TreeNode findMin(TreeNode node){

        // Traverse down the left subtree until we reach a leaf node with no left child
        while(node.left != null){
            node = node.left;
        }
        // Return the node with the smallest value in the subtree
        return node;
    }
}

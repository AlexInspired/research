package com.practice.leetcode.warmup;

public class WarmUp2 {

    /*
     * A binary tree node has data, the pointer to left child and a pointer to right
     * child
     */
    static class node {
        int data;
        node left;
        node right;
        node parent;
    }

    ;

    static void inOrderTraversal(node root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.data);
        inOrderTraversal(root.right);
    }

    static void inOrderTraversal(node root, node n, node succ) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left, n, succ);
        if (root.data > n.data && succ.left == null) {
            succ.left = root;
            return;
        }
        inOrderTraversal(root.right, n, succ);
    }

    static node inOrderSuccessor(node root, node n) {
        node succ = newNode(0);
        inOrderTraversal(root, n, succ);
        return succ.left;
    }

    // Helper function that allocates a new
    // node with the given data and null left
    // and right pointers.
    static node newNode(int data) {
        node node = new node();

        node.data = data;
        node.left = null;
        node.right = null;
        node.parent = null;

        return (node);
    }

    // Give a binary search tree and a
    // number, inserts a new node with
    // the given number in the correct
    // place in the tree. Returns the new
    // root pointer which the caller should
    // then use (the standard trick to
    // astatic void using reference parameters).
    static node insert(node node, int data) {

        /*
         * 1. If the tree is empty, return a new, single node
         */
        if (node == null)
            return (newNode(data));
        else {
            node temp;

            /* 2. Otherwise, recur down the tree */
            if (data <= node.data) {
                temp = insert(node.left, data);
                node.left = temp;
                temp.parent = node;
            } else {
                temp = insert(node.right, data);
                node.right = temp;
                temp.parent = node;
            }

            /* Return the (unchanged) node pointer */
            return node;
        }
    }

    // Driver code
    public static void main(String[] args) {
        node root = null, temp, succ, min;

        // Creating the tree given in the above diagram
        root = insert(root, 20);
        root = insert(root, 8);
        root = insert(root, 22);
        root = insert(root, 4);
        root = insert(root, 12);
        root = insert(root, 10);
        root = insert(root, 14);
        temp = root.left.right.left;

        // Function Call
        succ = inOrderSuccessor(root, temp);
        if (succ != null)
            System.out.print("\n Inorder Successor of " + temp.data + " is " + succ.data);
        else
            System.out.print("\n Inorder Successor doesn't exist");

    }
}
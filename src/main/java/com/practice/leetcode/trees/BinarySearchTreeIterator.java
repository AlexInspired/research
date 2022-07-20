package com.practice.leetcode.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeIterator {
    private Queue<Integer> values = new LinkedList<>();
    private int size;

    public BinarySearchTreeIterator(TreeNode root) {
        if (root != null) visit(root);
        size = values.size();
    }

    private void visit(TreeNode root) {
        if (root.left != null) visit(root.left);
        values.add(root.val);
        if (root.right != null) visit(root.right);
    }

    public int next() {
        size--;
        return values.poll();
    }

    public boolean hasNext() {
        return size > 0;
    }
}

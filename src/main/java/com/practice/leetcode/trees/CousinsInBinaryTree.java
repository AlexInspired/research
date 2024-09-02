package com.practice.leetcode.trees;

import java.util.Objects;

public class CousinsInBinaryTree {

    Tuple hX = new Tuple();
    Tuple hY = new Tuple();

    public boolean isCousins(TreeNode root, int x, int y) {

        dfs(root, 0, x, y, root);

        return Objects.equals(hX.getH(), hY.getH()) && hX.getParent().val != hY.getParent().val;

    }

    private void dfs(TreeNode node, int h, int x, int y, TreeNode parent) {
        if (node == null) {
            return;
        }

        if (node.val == x) {
            hX.setH(h);
            hX.setParent(parent);
        }

        if (node.val == y) {
            hY.setH(h);
            hY.setParent(parent);
        }

        h++;
        dfs(node.left, h, x, y, node);
        dfs(node.right, h, x, y, node);
    }


    class Tuple {
        public Integer getH() {
            return h;
        }

        public void setH(Integer h) {
            this.h = h;
        }

        public TreeNode getParent() {
            return parent;
        }

        public void setParent(TreeNode parent) {
            this.parent = parent;
        }

        public  Integer h;
        public  TreeNode parent;

    }
}

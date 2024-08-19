package com.practice.leetcode.trees;

import org.junit.Assert;
import org.junit.Test;

public class DiameterOfBinaryTreeTest {

    @Test
    public void test() {
        // given
        TreeNode n5 = new TreeNode(5, null, null);
        TreeNode n4 = new TreeNode(4, null, null);
        TreeNode n3 = new TreeNode(3, null, null);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode givenTree = new TreeNode(1, n2, n3);

        DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();

        // when
        int actual = diameterOfBinaryTree.diameterOfBinaryTree(givenTree);

        Assert.assertEquals(3, actual);

    }

    @Test
    public void test1() {
        // given
        TreeNode n2 = new TreeNode(1, null, null);
        TreeNode n1 = new TreeNode(3, n2, null);
        TreeNode givenTree = new TreeNode(2, n1, null);

        DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();

        // when
        int actual = diameterOfBinaryTree.diameterOfBinaryTree(givenTree);

        Assert.assertEquals(2, actual);

    }

//    int diameter = 0;
//
//    public int diameterOfBinaryTree(TreeNode root) {
//
//        findDiameter(root, 0);
//        return diameter;
//    }
//
//    int findDiameter(TreeNode root, int h) {
//        if (root == null) {
//            return h - 1;
//        }
//
//        int hl = getMaxHeight(root.left, h + 1);
//        int hr = getMaxHeight(root.right, h + 1);
//
//        diameter = Math.max(hl + hr, diameter);
//
//        findDiameter(root.left, h);
//        findDiameter(root.right, h);
//        return diameter;
//    }
//
//    private int getMaxHeight(TreeNode node, int h) {
//        if (node == null) {
//            return h - 1;
//        }
//
//        return Math.max(getMaxHeight(node.left, h + 1),
//                getMaxHeight(node.right, h + 1));
//    }

}
package com.practice.leetcode.trees;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteNodeInABSTTest {

    @Test
    public void test() {
        // given
        TreeNode n9 = new TreeNode(8, null, null);
        TreeNode n8 = new TreeNode(8, null, n9);
        TreeNode n6 = new TreeNode(6);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3, null, n4);
        TreeNode n7 = new TreeNode(7, n6, n8);
        TreeNode n2 = new TreeNode(2, null, n3);
        TreeNode n12 = new TreeNode(12, null, null);
        TreeNode n5 = new TreeNode(5, n2, n7);
        TreeNode root = new TreeNode(10, n5, n12);

        DeleteNodeInABST deleteNodeInABST = new DeleteNodeInABST();

        int key = 5;
        TreeNode result = deleteNodeInABST.deleteNode(root, key);

        Assert.assertEquals(4, result.left.val);
    }

    @Test
    public void test2() {
        // given
        TreeNode root = new TreeNode(0, null, null);

        DeleteNodeInABST deleteNodeInABST = new DeleteNodeInABST();

        int key = 0;
        TreeNode result = deleteNodeInABST.deleteNode(root, key);

        Assert.assertNull(result);
    }


    @Test
    public void test3() {
        // given
        TreeNode n7 = new TreeNode(7);
        TreeNode n4 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n6 = new TreeNode(6, null, n7);
        TreeNode n3 = new TreeNode(3, n2, n4);
        TreeNode root = new TreeNode(5, n3, n6);

        DeleteNodeInABST deleteNodeInABST = new DeleteNodeInABST();

        int key = 7;
        TreeNode result = deleteNodeInABST.deleteNode(root, key);

        Assert.assertEquals(4, result.left.val);
    }

}
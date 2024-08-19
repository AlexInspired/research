package com.practice.leetcode.trees;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeTiltTest {

    @Test
    public void test() {
        // given
        TreeNode n6 = new TreeNode(7);
        TreeNode n5 = new TreeNode(9, null, n6);
        TreeNode n4 = new TreeNode(5);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2, n3, n4);
        TreeNode root = new TreeNode(4, n2, n5);

        BinaryTreeTilt binaryTreeTilt = new BinaryTreeTilt();

        int expected = 15;
        int actual = binaryTreeTilt.findTilt(root);

        Assert.assertEquals(expected, actual);
    }

}
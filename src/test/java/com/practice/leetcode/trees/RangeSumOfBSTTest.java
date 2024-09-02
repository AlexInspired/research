package com.practice.leetcode.trees;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RangeSumOfBSTTest {

    @Test
    public void test() {
        // given
        TreeNode n6 = new TreeNode(18);
        TreeNode n5 = new TreeNode(7);
        TreeNode n4 = new TreeNode(3);
        TreeNode n3 = new TreeNode(15, null, n6);
        TreeNode n2 = new TreeNode(5, n4, n5);
        TreeNode root = new TreeNode(10, n2, n3);

        int low = 7, high = 15;
        RangeSumOfBST rangeSumOfBST = new RangeSumOfBST();

        int actual = rangeSumOfBST.rangeSumBST(root, low, high);

        Assert.assertEquals(32, actual);
    }

}
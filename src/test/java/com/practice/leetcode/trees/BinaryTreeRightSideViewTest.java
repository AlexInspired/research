package com.practice.leetcode.trees;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class BinaryTreeRightSideViewTest {
    @Test
    public void test1() {
        //given
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3,null, n4);
        TreeNode n2 = new TreeNode(2, null, n5);
        TreeNode givenTree = new TreeNode(1, n2, n3);

        List<Integer> expected = Arrays.asList(1, 3, 4);

        BinaryTreeRightSideView binaryTreeRightSideView = new BinaryTreeRightSideView();

        // when
        List<Integer> result = binaryTreeRightSideView.rightSideView(givenTree);

        //then
        Assert.assertEquals(expected, result);
    }
}
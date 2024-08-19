package com.practice.leetcode.trees;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BinaryTreePathsTest {

    @Test
    public void test() {
        // given
        TreeNode n5 = new TreeNode(5);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2, null, n5);
        TreeNode root = new TreeNode(1, n2, n3);

        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();

        List<String> expected = Arrays.asList("1->2->5", "1->3");
        List<String> actual = binaryTreePaths.binaryTreePaths(root);

        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }

}
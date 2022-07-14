package com.practice.leetcode.trees;

import org.junit.Assert;
import org.junit.Test;

public class UniqueBinarySearchTreesTest {

    @Test
    public void testUniqueBinarySearchTrees() {
        UniqueBinarySearchTrees uniqueBinarySearchTrees = new UniqueBinarySearchTrees();

        Assert.assertEquals(5, uniqueBinarySearchTrees.numTrees(3));
    }

}
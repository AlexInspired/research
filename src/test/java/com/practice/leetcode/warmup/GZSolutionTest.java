package com.practice.leetcode.warmup;

import org.junit.Assert;
import org.junit.Test;

public class GZSolutionTest {
    @Test
    public void test() {

        GZSolution gzSolution = new GZSolution();

        Assert.assertEquals(2, gzSolution.indexOfFirstUnique("abcfabe"));
    }
}

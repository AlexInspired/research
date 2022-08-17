package com.practice.leetcode.dynamicprogm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KConcatenationMaximumSumTest {
    @Test
    public void test() {
        KConcatenationMaximumSum kConcatenationMaximumSum = new KConcatenationMaximumSum();
        int[] given = {1,-2,1,}; int k = 5;
//        int[] given = {-1,-2,-1,-2,-1,-2,-1,-2,-1,-2}; int k = 5;
        int result = kConcatenationMaximumSum.kConcatenationMaxSum(given, k);

        Assert.assertEquals(2, result);
    }

}
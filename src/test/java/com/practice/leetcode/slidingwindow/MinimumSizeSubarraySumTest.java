package com.practice.leetcode.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSizeSubarraySumTest {
    @Test
    public void test() {
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();
        int[] given = new int[]{2,3,1,2,4,3};
        int target = 7;
        Assert.assertEquals(2, minimumSizeSubarraySum.minSubArrayLen(target, given));

        int[] given1 = new int[]{1,4,4};
        int target1 = 1;
        Assert.assertEquals(1, minimumSizeSubarraySum.minSubArrayLen(target1, given1));

        int[] given2 = new int[]{1,1,1,1,1,1,1,1};
        int target2 = 11;
        Assert.assertEquals(0, minimumSizeSubarraySum.minSubArrayLen(target2, given2));
    }
}
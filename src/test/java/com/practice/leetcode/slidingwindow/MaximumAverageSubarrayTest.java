package com.practice.leetcode.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAverageSubarrayTest {

    @Test
    public void test() {
        MaximumAverageSubarray maximumAverageSubarray = new MaximumAverageSubarray();
        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
        int k = 4;

        Assert.assertEquals(0, Double.compare(12.75, maximumAverageSubarray.findMaxAverage(nums, k)));
    }

}
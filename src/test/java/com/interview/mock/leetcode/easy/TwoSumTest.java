package com.interview.mock.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void testTilesPlot() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 2, 4};
        int[] result = {1, 2};

        Assert.assertArrayEquals(result, twoSum.twoSum(nums, 6));

    }
}

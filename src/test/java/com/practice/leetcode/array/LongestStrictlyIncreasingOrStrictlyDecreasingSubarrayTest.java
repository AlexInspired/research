package com.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarrayTest {

    @Test
    public void test() {
        LongestStrictlyIncreasingOrStrictlyDecreasingSubarray object = new LongestStrictlyIncreasingOrStrictlyDecreasingSubarray();

        int[] nums = new int[]{1, 2};

        int result = object.longestMonotonicSubarray(nums);

        Assert.assertEquals(2, result);
    }

    @Test
    public void test2() {
        LongestStrictlyIncreasingOrStrictlyDecreasingSubarray object = new LongestStrictlyIncreasingOrStrictlyDecreasingSubarray();

        int[] nums = new int[]{1, 4, 3, 3, 2};

        int result = object.longestMonotonicSubarray(nums);

        Assert.assertEquals(2, result);
    }

    @Test
    public void test3() {
        LongestStrictlyIncreasingOrStrictlyDecreasingSubarray object = new LongestStrictlyIncreasingOrStrictlyDecreasingSubarray();

        int[] nums = new int[]{3,2,1};

        int result = object.longestMonotonicSubarray(nums);

        Assert.assertEquals(3, result);
    }
}
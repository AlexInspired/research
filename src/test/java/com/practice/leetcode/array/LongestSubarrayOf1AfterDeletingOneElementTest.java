package com.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubarrayOf1AfterDeletingOneElementTest {
    @Test
    public void test() {
        LongestSubarrayOf1AfterDeletingOneElement object = new LongestSubarrayOf1AfterDeletingOneElement();
//        int nums[] = new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1};
//        int nums[] = new int[]{ 1, 1, 0 ,1};
//        int nums[] = new int[]{1,1,0,0,1,1,1,0,1};
        int nums[] = new int[]{1,1,1,0,1,1,1,0,1,1,1,1,1};

        int result = object.longestSubarray(nums);

        Assert.assertEquals(4, result);
    }
}
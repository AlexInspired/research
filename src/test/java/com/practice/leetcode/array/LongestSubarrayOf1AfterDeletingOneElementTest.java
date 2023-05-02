package com.practice.leetcode.array;

import com.practice.leetcode.slidingwindow.LongestSubarrayOf1AfterDeletingOneElementSlidingWindow;
import org.junit.Assert;
import org.junit.Test;

public class LongestSubarrayOf1AfterDeletingOneElementTest {
//    @Test
    public void test() {
        LongestSubarrayOf1AfterDeletingOneElementMy1Approach object = new LongestSubarrayOf1AfterDeletingOneElementMy1Approach();
//        int nums[] = new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1};
//        int nums[] = new int[]{ 1, 1, 0 ,1};
//        int nums[] = new int[]{1,1,0,0,1,1,1,0,1};
        int nums[] = new int[]{1,1,1,0,1,1,1,0,1,1,1,1,1};

        int result = object.longestSubarray(nums);

        Assert.assertEquals(4, result);
    }

    @Test
    public void test2() {
        LongestSubarrayOf1AfterDeletingOneElementSlidingWindow object = new LongestSubarrayOf1AfterDeletingOneElementSlidingWindow();

        int nums[] = new int[]{ 1, 1, 0, 0, 1, 1, 0, 1};

        int result = object.longestSubarray(nums);

        Assert.assertEquals(3, result);
    }
}
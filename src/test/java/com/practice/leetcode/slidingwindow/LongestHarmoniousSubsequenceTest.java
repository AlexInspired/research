package com.practice.leetcode.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class LongestHarmoniousSubsequenceTest {

    @Test
    public void test() {
        LongestHarmoniousSubsequence longestHarmoniousSubsequence = new LongestHarmoniousSubsequence();
        int[] nums = new int[]{1, 3, 2, 2, 5, 2, 3, 7};

        Assert.assertEquals(5, longestHarmoniousSubsequence.findLHS(nums));
    }

    @Test
    public void test2() {
        LongestHarmoniousSubsequence longestHarmoniousSubsequence = new LongestHarmoniousSubsequence();
        int[] nums = new int[]{1,2,3,4};

        Assert.assertEquals(2, longestHarmoniousSubsequence.findLHS(nums));
    }

    @Test
    public void test3() {
        LongestHarmoniousSubsequence longestHarmoniousSubsequence = new LongestHarmoniousSubsequence();
        int[] nums = new int[]{1,1,1,1};

        Assert.assertEquals(0, longestHarmoniousSubsequence.findLHS(nums));
    }

}
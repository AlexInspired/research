package com.practice.leetcode.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class JumpGame6Test {

    @Test
    public void test() {
        JumpGame6 jumpGame6 = new JumpGame6();
        int nums[] = new int[]{1,-1,-2,4,-7,3};
        int k = 2;

        Assert.assertEquals(7, jumpGame6.maxResult(nums,  k));
    }

}
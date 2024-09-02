package com.practice.leetcode.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicate2Test {

    //    1,2,3,1,3,1,1,3 k =2
    @Test
    public void test() {
        ContainsDuplicate2 containsDuplicate2 = new ContainsDuplicate2();

        int[] nums = new int[]{1, 2, 3, 1, 3, 1, 1, 3};
        int k = 2;

        boolean actual = containsDuplicate2.containsNearbyDuplicate(nums, k);

        Assert.assertTrue(actual);
    }


    @Test
    public void test2() {
        ContainsDuplicate2 containsDuplicate2 = new ContainsDuplicate2();

        int[] nums = new int[]{1, 0, 1, 1};
        int k = 1;

        boolean actual = containsDuplicate2.containsNearbyDuplicate(nums, k);

        Assert.assertTrue(actual);
    }

}
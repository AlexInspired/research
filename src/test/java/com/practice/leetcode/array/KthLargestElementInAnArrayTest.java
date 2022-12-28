package com.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthLargestElementInAnArrayTest {

    @Test
    public void test1(){
        KthLargestElementInAnArray kthLargestElementInAnArray = new KthLargestElementInAnArray();
        int[] nums = {10, 4, 5, 8, 6, 11, 26};
        int k = 3;
        int result = kthLargestElementInAnArray.findKthLargest(nums, k);

        Assert.assertEquals(10, result);
    }

}
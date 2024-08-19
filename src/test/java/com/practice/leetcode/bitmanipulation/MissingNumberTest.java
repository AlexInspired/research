package com.practice.leetcode.bitmanipulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingNumberTest {
    @Test
    public void test() {
        MissingNumber missingNumber = new MissingNumber();

        int[] nums = {3, 0, 1};
        assertEquals(2, missingNumber.missingNumberSum(nums));
    }
}
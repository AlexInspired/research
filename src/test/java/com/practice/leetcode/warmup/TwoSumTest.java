package com.practice.leetcode.warmup;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoSumTest {
    @Test
    public void testTwoSum() {

        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 2, 4};
        int[] expected = {1, 2};
        int[] actual = twoSum.twoSumV3(nums, 6);

        assertThat(expected).containsExactlyInAnyOrder(actual);
    }
}

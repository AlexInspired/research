package com.practice.leetcode.array;

public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {

    public int longestMonotonicSubarray(int[] nums) {

        int decCount = 1, decCountMax = 0, elseEntranceCount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                decCount++;
            } else {
                decCountMax = Math.max(decCount, decCountMax);
                decCount = 1;
                if (nums[i] == nums[i + 1]) {
                    elseEntranceCount++;
                }
            }
        }
        decCountMax = Math.max(decCount, decCountMax);
        if (elseEntranceCount == nums.length - 1) {
            return 1;
        }
        int incCount = 1, incCountMax = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                incCount++;
            } else {
                incCountMax = Math.max(incCount, incCountMax);
                incCount = 1;
            }
        }
        incCountMax = Math.max(incCount, incCountMax);
        return Math.max(decCountMax, incCountMax);

    }
}

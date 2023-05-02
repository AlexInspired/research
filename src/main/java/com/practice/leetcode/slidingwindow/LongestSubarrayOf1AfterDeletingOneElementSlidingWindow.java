package com.practice.leetcode.slidingwindow;

public class LongestSubarrayOf1AfterDeletingOneElementSlidingWindow {
    //    {1, 1, 1, 0, 0, 1, 1, 0, 1};
    public int longestSubarray(int[] nums) {
        int start = -1;
        int zeroCount = 0;
        int maxLength = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                zeroCount++;
            }
            while (zeroCount > 1) {
                start++;
                if (nums[start] == 0) {
                    zeroCount--;
                }
            }
            int length = end - start - 1;
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}

package com.practice.leetcode.slidingwindow;

public class MinimumSizeSubarraySum {

    //    2,3,1,2,4,3
    public int minSubArrayLen(int x, int[] nums) {
        // Initialize current sum and minimum length
        int curr_sum = 0, n = nums.length, min_len = n + 1;

        // Initialize starting and ending indexes
        int start = 0, end = 0;
        while (end < n) {
            // Keep adding array elements while current sum
            // is smaller than x
            while (curr_sum < x && end < n)
                curr_sum += nums[end++];

            // If current sum becomes greater than x.
            while (curr_sum >= x && start < n) {
                // Update minimum length if needed
                if (end - start < min_len)
                    min_len = end - start;

                // remove starting elements
                curr_sum -= nums[start++];
            }
        }
        if (min_len == n + 1) min_len = 0;
        return min_len;
    }
}

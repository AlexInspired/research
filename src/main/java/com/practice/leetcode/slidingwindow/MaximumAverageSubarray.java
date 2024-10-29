package com.practice.leetcode.slidingwindow;

public class MaximumAverageSubarray {

    // {1, 12, -5, -6, 50, 3}
    public double findMaxAverage(int[] nums, int k) {

        int left = 0, right = 0, windowSum = 0;
        double maxAverage = 0;

        while (right - left < k) {
            windowSum = windowSum + nums[right];
            right++;
        }
        maxAverage = (double) windowSum / k;

        while (right < nums.length) {

            windowSum = windowSum + nums[right];
            windowSum = windowSum - nums[left];

            maxAverage = Math.max(maxAverage, (double) windowSum / k);
            left++;
            right++;
        }
        return maxAverage;
    }
}

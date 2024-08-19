package com.practice.leetcode.bitmanipulation;

public class MissingNumber {
// 0,1,2,3
    // {3, 0, 1};
    public int missingNumberSum(int[] nums) {
        int len = nums.length;
        int sum = (len) * (len + 1) / 2;
        for (int i = 0; i < len; i++)
            sum -= nums[i];
        return sum;
    }
}

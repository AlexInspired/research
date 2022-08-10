package com.practice.leetcode.array;

public class LongestSubarrayOf1AfterDeletingOneElement {
//    {0, 1, 1, 1, 0, 1, 1, 0, 1};
    public int longestSubarray(int[] nums) {
        int globalMax = 0;
        int localMax = 0;

        boolean firstTime = true;
        int firstTimeIndx = 0;

        for (int i = 0; i < nums.length; i++) {
            if(i == 0 && nums[i] == 0) continue;
            //  1 0 0 0
            if( i > 0 && nums[i-1] != 1 && nums[i] == 0) {
                globalMax = Math.max(localMax, globalMax);
                localMax = 0;
                firstTime = true;
                continue;
            }
            if (nums[i] == 1) {
                localMax++;
            }
            if (nums[i] == 0) {
                if (firstTime) { // 1 1 0
                    firstTime = false;
                    firstTimeIndx = i;
                    continue;
                }
                // 1, 1, 1, 0, 1, 1, 0
                globalMax = Math.max(localMax, globalMax);
                localMax = 0;
                i = firstTimeIndx;
                firstTime = true;
            }
        }
        int result = globalMax == 0 ? localMax : Math.max(localMax, globalMax);
        if (result == nums.length) result--;
        return result;
    }
}

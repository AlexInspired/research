package com.practice.leetcode.slidingwindow;

public class MaxConsecutiveOnes3 {

    public int longestOnes(int[] nums, int k) {

        int start = -1, zeroCount = 0;
        int maxLength = 0;

        for(int end = 0; end < nums.length; end++) {
            if(nums[end] == 0) {
                zeroCount++;
            }
            while(zeroCount > k){
                start++;
                if(nums[start] == 0) {
                    zeroCount--;
                }
            }

            int length = end - start;
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}

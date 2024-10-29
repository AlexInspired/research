package com.practice.leetcode.prefixSum;

// Create an array sumLeft where sumLeft[i] is the sum of all the numbers to the left of index i.
// Create an array sumRight where sumRight[i] is the sum of all the numbers to the right of index i.
// For each index i, check if sumLeft[i] equals sumRight[i]. If so, return i. If no such i is found, return -1.
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] start = new int[n];
        int[] end = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            start[i] = sum;
        }
        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += nums[i];
            end[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            if (start[i] == end[i]) {
                return i;
            }
        }
        return -1;
    }
}

package com.practice.leetcode.sort;

public class FindFirstandLastPositionofElementinSortedArray {

    public int[] searchRange(int[] nums, int target) {
        return new int[] { findIndex(nums, target, true), findIndex(nums, target, false) };
    }
    //perform binary search in array
    private int findIndex(int[] nums, int target, boolean isLeft) {
        int index = -1, left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (isLeft) right = mid - 1; // Look in the left sub-array
                else left = mid + 1; //look the right sub array
            } else if (nums[mid] < target) left = mid + 1; else right = mid - 1;
        }
        return index;
    }
}

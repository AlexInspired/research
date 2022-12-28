package com.practice.leetcode.array;

import java.util.Random;

// Time Complexity: O(N2) in worst case and O(N) on average
// Auxiliary Space: O(1)
public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        // performing quick select will result in finding the k smallest element.
        // As a result, we target the len - k to find the kth largest
        return quick_select(nums,  0, nums.length - 1, nums.length - k);
    }

    private int quick_select(int[] nums, int l, int r, int kLargest) {
        if(l == r) return nums[r];

        // get smaller partition
        int pivot = new Random().nextInt(r - l) + l;
        pivot = partition(nums, l, r, pivot);

        // three condition
        // base case (works because partition() guarantees that returning pivot will
        // contains the correct sorted position of index pivot) i.e. if pivot  == ksmallest
        // we know for sure that at this position the item is at its final sorted index
        if(pivot == kLargest)
            return nums[pivot];

        if(pivot > kLargest)
            return quick_select(nums, l, pivot - 1, kLargest);
        else
            return quick_select(nums, pivot + 1, r, kLargest);
    }

    private int partition(int[] nums, int l, int r, int pivot) {
        int pivotVal = nums[pivot];
        // move pivot to very right
        swap(nums, pivot, r);

        // move pivot past smaller elements
        pivot = l;

        // <= allows the loop to also reposition the pivot back
        for(int i = l; i <= r; i++) {
            if(nums[i] <= pivotVal) {
                swap(nums, pivot++, i);
            }
        }

        // strictly the smaller partition
        return pivot - 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

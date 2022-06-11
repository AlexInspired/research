package com.practice.leetcode.dynamicprogm;

public class JumpGame2 {

    int minJumps = Integer.MAX_VALUE;

    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        return minJumps(nums, 0, 0);
    }

    private int minJumps(int[] nums, int currentPosition, int jumpsCounter) {
        if (currentPosition >= nums.length - 1) {
            minJumps = Math.min(minJumps, jumpsCounter);
            return minJumps;
        }
        if (nums[currentPosition] == 0) return minJumps;

        for (int i = currentPosition; i < (currentPosition + nums[currentPosition]); jumpsCounter--) {
            minJumps(nums, ++i, ++jumpsCounter);
        }
        return minJumps;
    }
}

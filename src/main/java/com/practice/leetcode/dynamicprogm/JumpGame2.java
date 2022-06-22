package com.practice.leetcode.dynamicprogm;

public class JumpGame2 {

    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        return minJumps(nums, 0, 0);
    }

    private int minJumps(int[] nums, int currentPosition, int jumpsCounter) {

        if (nums[currentPosition] == 0) return jumpsCounter;
        int nextPosition = determineNextPosition(nums, currentPosition);
        if (nextPosition == -1) return ++jumpsCounter;
        jumpsCounter = minJumps(nums, nextPosition, ++jumpsCounter);

        return jumpsCounter;
    }

    private int determineNextPosition(int[] nums, int currentPosition) {
        int maxJumpRange = (currentPosition + nums[currentPosition]);

        int maxJumpInx = maxJumpRange;
        if (maxJumpRange >= nums.length - 1) {
            return -1;
        }
        for (int i = currentPosition + 1; i <= currentPosition + nums[currentPosition]; i++) {
            if (nums[i] + i >= maxJumpRange) {
                maxJumpInx = i;
                maxJumpRange = nums[i] + i;
            }
            if(maxJumpRange >= nums.length) break;
        }
        return maxJumpInx;
    }

}

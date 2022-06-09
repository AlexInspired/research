package com.practice.leetcode.dynamicprogm;

public class JumpGame2 {

    int[] given = {2,3,1,1,4};
    int minJumps = Integer.MAX_VALUE;

    public int jump(int[] nums) {
        return minJumps(nums, 0, 0);
    }

    private int minJumps(int[] nums, int currentPosition, int jumpsCounter) {
        if(currentPosition >= nums.length){
            minJumps = Math.min(minJumps, jumpsCounter);
            return minJumps;
        }
        for(int i = currentPosition; i < nums[currentPosition];){
            minJumps(nums, ++i, ++jumpsCounter);
        }
        return minJumps;
    }
}

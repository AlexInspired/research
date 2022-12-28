package com.practice.leetcode.array;

public class IncreasingTripletSubsequence {

//            2,1,5,0,4,5

//            num_i == 0
//            num_j == 4

    public boolean increasingTriplet(int[] nums) {
        int num_i = Integer.MAX_VALUE, num_j = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] <= num_i){
                num_i = nums[i];
            }
            else if(nums[i] <= num_j){
                num_j = nums[i];
            }
            else return true;
        }
        return false;
    }
}

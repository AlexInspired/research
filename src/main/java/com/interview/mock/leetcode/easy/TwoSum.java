package com.interview.mock.leetcode.easy;


import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        TwoSum twoSum = new TwoSum();
//        int[] result = twoSum.twoSum(nums, 6);
        int[] result = twoSum.twoSumv2(nums, 6);

     int i = 1;
    }

// [2nlogn + n] vs n2
    public int[] twoSumv2(int[] nums, int target){
        int[] result = new int[2];
        int[] numsSorted = nums.clone();
        //nlogn
        Arrays.sort(numsSorted);
        for (int i = 0; i < numsSorted.length - 1; i++){
            result[0] = numsSorted[i];
            int reminder = target - numsSorted[i];
            //logn + n for cycle = nlogn
            int searchedIndex =  Arrays.binarySearch(numsSorted, i+1, numsSorted.length, reminder);
            if(searchedIndex > 0){
                result[1] = numsSorted[searchedIndex];
                return findStartIndexes(nums, result);

            }

        }
        return result;
    }

    int[] findStartIndexes(int[] nums, int[] foundValues){
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == foundValues[0])
                result[0] = i;
            if(nums[i] == foundValues[1])
                result[1] = i;
        }
        return result;
    }
    //can we solve it with less than n2 time complexity ?
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            result[0] = i;
            int second = target - nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if( second - nums[j] == 0 ){
                    result[1] = j;
                    return result;
                }

            }
        }
        return result;
    }
}

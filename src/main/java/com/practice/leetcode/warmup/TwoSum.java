package com.practice.leetcode.warmup;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // [2nlogn + n] vs n2
    public int[] twoSumv2(int[] nums, int target) {
        int[] result = new int[2];
        int[] numsSorted = nums.clone();
        //nlogn
        Arrays.sort(numsSorted);
        for (int i = 0; i < numsSorted.length - 1; i++) {
            result[0] = numsSorted[i];
            int reminder = target - numsSorted[i];
            //logn + n for cycle = nlogn
            int searchedIndex = Arrays.binarySearch(numsSorted, i + 1, numsSorted.length, reminder);
            if (searchedIndex > 0) {
                result[1] = numsSorted[searchedIndex];
                return findStartIndexes(nums, result);

            }

        }
        return result;
    }

    int[] findStartIndexes(int[] nums, int[] foundValues) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == foundValues[0])
                result[0] = i;
            if (nums[i] == foundValues[1])
                result[1] = i;
        }
        return result;
    }

    //can we solve it with less than n2 time complexity ?
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            result[0] = i;
            int second = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (second - nums[j] == 0) {
                    result[1] = j;
                    return result;
                }

            }
        }
        return result;
    }


    public int[] twoSumV3(int[] nums, int target) {
        int s = nums.length;
        Map<Integer, Integer> indexByElement = new HashMap<>();
        for (int i = 0; i < s; i++) {

            //getting the value we need by subtracting the target with the current value
            int n = target - nums[i];

            //if the map already contains the "n" we are looking for
            if (indexByElement.containsKey(n)) {
                return new int[]{i, indexByElement.get(n)};  //print there indexes
            }

            //putting the value and its index onto the map
            indexByElement.put(nums[i], i);

        }
        return new int[0];
    }
}

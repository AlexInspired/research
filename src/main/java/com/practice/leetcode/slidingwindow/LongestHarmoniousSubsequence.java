package com.practice.leetcode.slidingwindow;

import java.util.Arrays;

public class LongestHarmoniousSubsequence {

    // 1,3,2,2,5,2,3,7
    // 1,2,2,2,3,3,5,7

    // 1. Сортируем входной массив.
    // 2. Создаем окно, в котором ослеживаем, что попадалась дельта, равная 1,
    //  чтобы отфильтровать случаи, когда был массив(или его часть) из одних чисел - нам это не подходит.


    public int findLHS(int[] nums) {

        Arrays.sort(nums);

        int left = 0, right = 0, lHS = 0, currentHS;
        boolean deltaDetected = false;
        while (right < nums.length) {

            // защита от indexOutOfBound
            while (right < nums.length && nums[right] - nums[left] <= 1) {
                if (nums[right] - nums[left] == 1) {
                    deltaDetected = true;
                }
                right++;
            }
            if (deltaDetected) {
                currentHS = right - left;
                lHS = Math.max(lHS, currentHS);
                deltaDetected = false;
            }
            left++;
        }

        return lHS;
    }
}

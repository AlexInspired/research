package com.practice.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 0) return result;
        String startOfInterval = String.valueOf(nums[0]);
        if (nums.length == 1) {
            result.add(startOfInterval);
            return result;
        }
        for (int i = 1; i < nums.length; i++) {

            int delta = Math.abs(nums[i] - nums[i - 1]);
            if (delta > 1) {
                //close interval
                if (startOfInterval.equals(String.valueOf(nums[i - 1]))) {
                    result.add(startOfInterval);
                } else {
                    result.add(startOfInterval + "->" + nums[i - 1]);
                }
                //open new interval
                startOfInterval = String.valueOf(nums[i]);
                if (i == nums.length - 1) {
                    result.add(startOfInterval);
                }
            }
            if (delta == 1 && i == nums.length - 1) {
                result.add(startOfInterval + "->" + nums[i]);
            }
        }
        return result;
    }
}

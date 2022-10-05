package com.practice.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    List<List<Integer>> output = new ArrayList();
    int n, k;

    public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
        // if the combination is done
        if (curr.size() == k) {
            output.add(new ArrayList(curr));
            return;
        }
        for (int i = first; i < n; ++i) {
            // add i into the current combination
            curr.add(nums[i]);
            // use next integers to complete the combination
            backtrack(i + 1, curr, nums);
            // backtrack
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        for (k = 0; k < n + 1; ++k) {
            backtrack(0, new ArrayList<Integer>(), nums);
        }
        return output;
    }
//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        backtrack(nums, 0, new ArrayList<>(), result);
//        return result;
//    }
//
//    void backtrack(int nums[], int idx, List<Integer> temp, List<List<Integer>> result) {
//        if (idx > nums.length) {
//            result.add(temp);
//            return;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            temp.add(i);
//            backtrack(nums, idx++, temp, result);
//            temp.remove(Integer.valueOf(i));
//        }
//    }
}

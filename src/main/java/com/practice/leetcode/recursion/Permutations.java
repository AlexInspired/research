package com.practice.leetcode.recursion;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> current = new LinkedHashSet<>();
        backtrack(nums, current, result);
        return result;
    }

    private void backtrack(int[] nums, Set<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (current.contains(nums[i])) {
                continue;
            }
            current.add(nums[i]);
            backtrack(nums, current, result);
            current.remove(nums[i]);
        }
    }
}

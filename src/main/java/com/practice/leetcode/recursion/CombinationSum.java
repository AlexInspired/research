package com.practice.leetcode.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        searchSubset(candidates, new ArrayList<>(), target);
        return result;
    }

    private void searchSubset(int[] candidates, List<Integer> partSolution, int target) {
        int nextSum = getSum(partSolution);
        if (target - nextSum == 0) {
            tryAddToResult(new ArrayList(partSolution));
            return;
        } else if (target - nextSum < 0) {
            return;
        }
        for (int i = 0; i < candidates.length; i++) {
            partSolution.add(candidates[i]);
            searchSubset(candidates, partSolution, target);
            partSolution.remove(partSolution.size() - 1);
        }
    }

    private int getSum(List<Integer> list) {
        return list.stream().reduce(0, (a, b) -> a + b);
    }

    private void tryAddToResult(List candidate) {
        Collections.sort(candidate);
        for (List list : result) {
            if (list.equals(candidate)) {
                return;
            }
        }
        result.add(candidate);
    }


}

package com.practice.leetcode.recursion;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CombinationSumTest {

    @Test
    public void test() {
        CombinationSum combinationSum = new CombinationSum();
        int[] candidates = new int[]{2, 3, 6, 7};
        List sublist0 = Arrays.asList(2, 2, 3);
        List sublist1 = Arrays.asList(7);
        List<List<Integer>> result = combinationSum.combinationSum(candidates, 7);

        Assert.assertEquals(sublist0, result.get(0));
        Assert.assertEquals(sublist1, result.get(1));
    }

}
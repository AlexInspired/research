package com.practice.leetcode.recursion;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PermutationsTest {

    @Test
    public void test() {
        Permutations permutations = new Permutations();
        int[] nums = new int[]{1, 2, 3};

        List<List<Integer>> result = permutations.permute(nums);
        assertEquals(6 , result.size());

    }
}
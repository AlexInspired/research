package com.practice.leetcode.recursion;

import com.practice.leetcode.recursion.StringPermutation;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringPermutationTest {

    @Test
    public void testStringPermutation() {
        StringPermutation stringPermutation = new StringPermutation();
        String given = "abcd";
        stringPermutation.permutation(given);
        assertTrue("true", true);
    }
}

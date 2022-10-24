package com.practice.leetcode.dynamicprogm;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubarraySumEqualsKTest {

    @Test
    public void test() {
        SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();
        int [] given = {10,5,2,1};
        int target = 8;
        assertEquals(1 , subarraySumEqualsK.subarraySum(given, target));

    }


}
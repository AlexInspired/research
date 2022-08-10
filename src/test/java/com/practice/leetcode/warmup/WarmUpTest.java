package com.practice.leetcode.warmup;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WarmUpTest {

    @Test
    public void test() {
        WarmUp warmUp = new WarmUp();
        int[][] givenArray = new int[][]{
                {1, 2, 3, 5, 7},
                {8, 9, 10, 11, 12},
                {15, 17, 18, 20, 21},
                {25, 26, 30, 31, 32},
        };

        assertTrue(warmUp.find(11, givenArray));
        assertTrue(warmUp.find(30, givenArray));
        assertFalse(warmUp.find(16, givenArray));
        assertTrue(warmUp.find(21, givenArray));
        assertFalse(warmUp.find(6, givenArray));
        assertFalse(warmUp.find(40, givenArray));
        assertFalse(warmUp.find(0, givenArray));
    }

}
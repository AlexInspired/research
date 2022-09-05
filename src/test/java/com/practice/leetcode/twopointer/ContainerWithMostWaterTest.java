package com.practice.leetcode.twopointer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainerWithMostWaterTest {
    @Test
    public void test() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
//
//        int[] given = new int[]{2,3,4,5,18,17,6};
//        assertEquals(17, containerWithMostWater.maxArea(given));

//        int[] given = new int[]{1, 8, 100, 2, 100, 4, 8, 3, 7};
//        assertEquals(200, containerWithMostWater.maxArea(given));

        int[] given = new int[]{0,14,6,2,10,9,4,1,10,3};
        assertEquals(70, containerWithMostWater.maxArea(given));

//        int[] given = new int[]{1,1};
//        assertEquals(1, containerWithMostWater.maxArea(given));

//        int[] given = new int[]{1,2,1};
//        assertEquals(2, containerWithMostWater.maxArea(given));

    }
}
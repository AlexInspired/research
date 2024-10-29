package com.practice.leetcode.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class DefuseTheBombTest {

    @Test
    public void test1() {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();
        int[] nums = new int[]{5, 7, 1, 4};
        int k = 3;
        int[] expected = new int[]{12, 10, 16, 13};

        int[] actual = defuseTheBomb.decrypt(nums, k);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();
        int[] nums = new int[]{2,4,9,3};
        int k = -2;
        int[] expected = new int[]{12,5,6,13};

        int[] actual = defuseTheBomb.decrypt(nums, k);

        Assert.assertArrayEquals(expected, actual);
    }
}
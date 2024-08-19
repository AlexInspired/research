package com.practice.leetcode.stacksqueues;

import org.junit.Assert;
import org.junit.Test;

public class DailyTemperaturesTest {

    @Test
    public void test() {

        int[] dailyTemperaturesData = new int[]{73, 74, 75, 71, 69, 72, 76, 76, 73};
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] result = dailyTemperatures.dailyTemperatures(dailyTemperaturesData);
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0, 0};
        Assert.assertArrayEquals(expected, result);
    }

}
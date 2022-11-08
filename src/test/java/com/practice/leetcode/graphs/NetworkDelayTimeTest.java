package com.practice.leetcode.graphs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkDelayTimeTest {

    @Test
    public void test1() {
        // given
        NetworkDelayTime networkDelayTime = new NetworkDelayTime();
        int n = 4, k = 2;
        int[][] times = new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}, {1, 3, 600}, {2, 3, 200}};

        // when
        int result = networkDelayTime.networkDelayTime(times, n, k);

        //then
        assertEquals(2, result);
    }
}
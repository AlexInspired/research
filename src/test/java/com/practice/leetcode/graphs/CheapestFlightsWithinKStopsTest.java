package com.practice.leetcode.graphs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheapestFlightsWithinKStopsTest {
    @Test
    public void test1() {
        // given
        CheapestFlightsWithinKStops cheapestFlightsWithinKStops = new CheapestFlightsWithinKStops();
        int n = 4, src = 0, dst = 3, k = 1;
        int[][] flights = new int[][]{{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};

        // when
        int result = cheapestFlightsWithinKStops.findCheapestPrice(n, flights, src, dst, k);

        //then
        assertEquals(700, result);
    }
}
package com.practice.leetcode.graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinCostToConnectAllPointsTest {
    @Test
    public void test1() {
        // given
        MinCostToConnectAllPoints minCostToConnectAllPoints = new MinCostToConnectAllPoints();
        int[][] points = new int[][]{{0, 0}, {2, 2}, {3, 10}, {5,2}, {7,0}};

        // when
        int result = minCostToConnectAllPoints.minCostConnectPoints(points);

        //then
        assertEquals(20, result);
    }

}
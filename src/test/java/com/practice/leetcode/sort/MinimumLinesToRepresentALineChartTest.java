package com.practice.leetcode.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MinimumLinesToRepresentALineChartTest {

    @Test
    public void test() {
//        int[][] givenArray = new int[][] {{3,4},{1,2},{7,8},{2,3}};
//        [1,7],[2,6],[3,5],[4,4],[5,4],[6,3],[7,2],[8,1]
        int[][] givenArray = new int[][] {{1,7},{2,6},{3,5},{4,4},{5,4},{6,3},{7,2},{8,1}};

        MinimumLinesToRepresentALineChart minimumLinesToRepresentALineChart = new MinimumLinesToRepresentALineChart();

        assertEquals( 3 ,minimumLinesToRepresentALineChart.minimumLines(givenArray));
    }

}
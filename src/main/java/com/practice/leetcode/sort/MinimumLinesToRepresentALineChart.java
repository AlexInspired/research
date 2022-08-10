package com.practice.leetcode.sort;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumLinesToRepresentALineChart {
    //  int[][] givenArray = new int[][] {{3,4},{1,2},{7,8},{2,3}};
    int minimumLines(int[][] stockPrices) {
        Arrays.sort(stockPrices, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] > o2[0]) return 1;
                else return -1;
            }
        });
        if (stockPrices.length == 1) return 0;
        int ans = 1;
        for (int i = 1; i < stockPrices.length - 1; i++) {

            int x1 = stockPrices[i - 1][0], y1 = stockPrices[i - 1][1];
            int x2 = stockPrices[i][0], y2 = stockPrices[i][1];
            int x3 = stockPrices[i + 1][0], y3 = stockPrices[i + 1][1];

            if ((y2 - y1) * (x3 - x2) != (y3 - y2) * (x2 - x1)) ans++;

        }
        return ans;
    }
}
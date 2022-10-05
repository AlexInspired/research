package com.practice.leetcode.sort;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeIntervalsTest {

    @Test
    public void test6() {
        int[][] given = new int[][]{{1, 4}, {5, 6}};
        int[][] expected = new int[][]{{1, 4}, {5, 6}};

        MergeIntervals mergeIntervals = new MergeIntervals();
        assertThat(expected).isEqualTo(mergeIntervals.merge(given));

    }

    @Test
    public void test5() {
        int[][] given = new int[][]{{1, 3}};
        int[][] expected = new int[][]{{1, 3}};

        MergeIntervals mergeIntervals = new MergeIntervals();
        assertThat(expected).isEqualTo(mergeIntervals.merge(given));

    }

    @Test
    public void test() {
        int[][] given = new int[][]{{1, 3}, {2, 6}, {5, 10}, {15, 18}};
        int[][] expected = new int[][]{{1, 10}, {15, 18}};

        MergeIntervals mergeIntervals = new MergeIntervals();
        assertThat(expected).isEqualTo(mergeIntervals.merge(given));

    }

    @Test
    public void test2() {
        int[][] given = new int[][]{{1, 3}, {2, 6}, {8, 10}, {9, 18}};
        int[][] expected = new int[][]{{1, 6}, {8, 18}};

        MergeIntervals mergeIntervals = new MergeIntervals();
        assertThat(expected).isEqualTo(mergeIntervals.merge(given));

    }

    @Test
    public void test3() {
        int[][] given = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = new int[][]{{1, 6}, {8, 10}, {15, 18}};

        MergeIntervals mergeIntervals = new MergeIntervals();

        assertThat(expected).isEqualTo(mergeIntervals.merge(given));
    }

    @Test
    public void test4() {
        int[][] given = new int[][]{{1, 4}, {4, 5}};
        int[][] expected = new int[][]{{1, 5}};

        MergeIntervals mergeIntervals = new MergeIntervals();

        assertThat(expected).isEqualTo(mergeIntervals.merge(given));

    }


}
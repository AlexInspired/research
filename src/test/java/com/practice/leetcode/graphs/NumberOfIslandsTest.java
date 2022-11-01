package com.practice.leetcode.graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIslandsTest {

    @Test
    public void test1() {
        // given
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        char[][] grid = new char[][] {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        // when
        int result = numberOfIslands.numIslands(grid);

        //then
        assertEquals(1, result);
    }
}
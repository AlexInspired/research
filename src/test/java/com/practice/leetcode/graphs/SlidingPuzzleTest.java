package com.practice.leetcode.graphs;

import org.junit.Test;

import static org.junit.Assert.*;
//Perform a breadth-first-search, where the nodes are the puzzle boards
// and edges are if two puzzle boards can be transformed into one another with one move.
public class SlidingPuzzleTest {

    @Test
    public void test1() {
        // given
        SlidingPuzzle slidingPuzzle = new SlidingPuzzle();
        int[][] board = new int[][]{
                {4,1,2},
                {5,0,3}
        };

        // when
        int result = slidingPuzzle.slidingPuzzle(board);

        //then
        assertEquals(5, result);
    }
}
package com.practice.leetcode.graphs.dfs;

import com.practice.leetcode.graphs.CheapestFlightsWithinKStops;
import org.junit.Test;

import static org.junit.Assert.*;

public class BattleshipsInABoardTest {

    @Test
    public void test() {
        // given
        BattleshipsInABoard battleshipsInABoard = new BattleshipsInABoard();
        char[][] board = new char[][] {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};

        // when
        int result = battleshipsInABoard.countBattleships(board);

        //then
        assertEquals(2, result);
    }

}
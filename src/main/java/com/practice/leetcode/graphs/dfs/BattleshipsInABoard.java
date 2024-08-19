package com.practice.leetcode.graphs.dfs;

public class BattleshipsInABoard {
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int counter = 0;
//https://leetcode.com/problems/battleships-in-a-board/solutions/3893370/tc-o-m-n-sc-o-1-beginner-friendly-easy-solution-100-beats-fully-explained/
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'X') {
                    if ((i == 0 || (board[i - 1][j] == '.')) && (j == 0 || board[i][j - 1] == '.')) {
                        counter++;
                    }
                }

            }
        }
        return counter;
    }
}

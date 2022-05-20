package com.practice.leetcode.recursion;

class ValidSudoku {
    char[][] board;
    public boolean isValidSudoku(char[][] board) {
        this.board = board;
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                if(Character.isDigit(board[row][col])){
                    int digit = board[row][col] - '0';
                    if(!checkDigit(digit, row, col))
                        return false;
                }
            }
        }
        return true;
    }

    public boolean checkDigit(int digit, int row, int col) {
        // Check the row
        int digitCount = 0;
        for(int i = 0; i < this.board[0].length; i++){
            if(this.board[row][i] == (char)(digit + '0')){
                digitCount++;
                if(digitCount == 2)
                    return false;
            }
        }
        digitCount = 0;
        // Check the columns
        for(int i = 0; i < this.board.length; i++){
            if(this.board[i][col] == (char)(digit + '0')){
                digitCount++;
                if(digitCount == 2)
                    return false;
            }
        }

        // Check the matrixes
        // 0, 1, 2 -> (0)
        // 3, 4, 5 -> (3)
        // 6, 7, 8 -> (6)
        int startRowIdx = (row/3) * 3;
        int startColIdx = (col/3) * 3;
        digitCount = 0;
        for(int i = startRowIdx; i < startRowIdx + 3; i++){
            for(int j = startColIdx; j < startColIdx + 3; j++){
                if(this.board[i][j] == (char)(digit + '0')){
                    digitCount++;
                    if(digitCount == 2)
                        return false;
                }
            }
        }
        return true;
    }

}

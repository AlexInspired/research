package com.practice.leetcode.matrix;

public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int c=0,r=1,k=(n*2)-1;
        while (c<k){
            for (int j = c; j < n; ++j) {
                matrix[c][j]=r;
                ++r;
            }
            for (int i = c +1; i <n; ++i) {
                matrix[i][n-1]=r;
                ++r;
            }
            for (int j = n-2; j >= c; --j) {
                matrix[n-1][j]=r;
                ++r;
            }
            for (int i = n-2; i > c; --i) {
                matrix[i][c]=r;
                ++r;
            }
            --n;
            ++c;
        }
        return matrix;
    }
}

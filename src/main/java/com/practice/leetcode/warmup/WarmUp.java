package com.practice.leetcode.warmup;

import java.util.Arrays;

public class WarmUp {


/*
Given an array of integers sorted in non-decreasing order.
Return an array of the squares of each number, also in sorted non decreasing order.

Example
Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
*/

    public Boolean find(int param, int matrix[][]) {
        for (int row = 0; row < matrix.length; row++) {
            int value = matrix[row][0];
            // Do stuff
            if(value == param) return  true;
            if(value > param && row>0){
                //search inside array
                if(Arrays.binarySearch(matrix[row-1], param) >= 0) return true;
                else return false;
            }
        }
        if(Arrays.binarySearch(matrix[matrix.length-1], param) >= 0) return true;
        else return false;
    }
}

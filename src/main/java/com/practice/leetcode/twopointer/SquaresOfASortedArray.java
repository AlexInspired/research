package com.practice.leetcode.twopointer;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {

        int[] result = new int[A.length];
        int s = 0;
        int i = 0;
        int j = 0;
        for (int k = 0; k < A.length; k++) {
            if (A[k] < 0) {
                j++;
            }
            A[k] = A[k] * A[k];
        }
        i = j -1;
        while (i >= 0 && j <= A.length - 1) {
            if (A[i] < A[j]) {
                result[s] = A[i];
                i--;
            } else {
                result[s] = A[j];
                j++;
            }
            s++;
        }
        while (i >= 0) {
            result[s] = A[i];
            i--;
            s++;
        }
        while (j <= A.length - 1) {
            result[s] = A[j];
            j++;
            s++;
        }
        return result;
    }
}

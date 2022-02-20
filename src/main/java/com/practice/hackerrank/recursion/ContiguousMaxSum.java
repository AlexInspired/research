package com.practice.hackerrank.recursion;

public class ContiguousMaxSum {

//    int[] arr = {2, -3, 4, -1, -2, 1, 5, -3};
    // int[] arr = {-2,1};

    public int maxSubArray(int[] arr) {
        int maxSum = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
            if (maxSum < sum) maxSum = sum;
            for (int j = i + 1; j < arr.length; j++) {
                sum = sum + arr[j];
                if (maxSum < sum) maxSum = sum;
            }
        }

        return Math.max(sum, maxSum);
    }
}

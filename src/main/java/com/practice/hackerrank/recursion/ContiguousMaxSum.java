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

    //   int [] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    public int maxSubArray1(int[] a) {
        int size = a.length;
        int max = Integer.MIN_VALUE, currentMax = 0;

        for (int i = 0; i < size; i++) {
            currentMax = currentMax + a[i];
            if (max < currentMax)
                max = currentMax;
             if (currentMax < 0)
                 currentMax = 0;
        }
        return max;
    }

    public int maxSubArray3(int[] a) {
        int size = a.length;
        int localMax = 0;
        int globalMax = 0;

        for (int i = 0; i < size; i++) {
            localMax = Math.max(a[i], a[i] + localMax);
            if(globalMax < localMax)
                globalMax = localMax;
        }
        return globalMax;
    }
}
//
//        3, 4, 1
//            4, 1
//               1
//        2, 3, = 5
//        2, 3, 4,

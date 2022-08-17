package com.practice.leetcode.dynamicprogm;

public class KConcatenationMaximumSum {
    long mod = 1000000007;

    public long kadanes(int[] arr) {
        long csum = arr[0];
        long msum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (csum >= 0) {
                csum = (csum + arr[i]) % mod;
            } else {
                csum = arr[i];
            }
            msum = Math.max(msum, csum);
        }
        return msum;
    }

    public long kadanesTwo(int[] arr) {
        long maxSum = 0;
        long currSum = 0;
        for (int i = 0; i < 2 * arr.length; i++) {
            if (currSum < 0) currSum = arr[i % arr.length];
            else currSum = (currSum + arr[i % arr.length]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public int kConcatenationMaxSum(int[] arr, int k) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (k == 1) {
            return (int) ((kadanes(arr)) % mod);
        } else if (sum >= 0) {
            return (int) ((kadanesTwo(arr) + ((k - 2) * sum)) % mod);
        } else {
            return kadanesTwo(arr) % mod < 0 ? 0 : (int) (kadanesTwo(arr) % mod);
        }
    }
}

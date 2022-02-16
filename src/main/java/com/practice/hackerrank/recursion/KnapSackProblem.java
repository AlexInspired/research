package com.practice.hackerrank.recursion;

public class KnapSackProblem {

    int[] weight = {6, 4, 3, 2};
    int[] value = {5, 3, 1, 3};
    int c = 10;

    public int knapSack(int weight[], int value[], int c, int n) {
        if (c <= 0 || n <= 0)
            return 0;

        if(weight[n - 1] > c)
            return knapSack(weight, value, c, n-1);

        //item included
        int x = value[n - 1] + knapSack(weight, value, c - weight[n - 1], n - 1);
        //item not included
        int y = knapSack(weight, value, c, n - 1);

        return Math.max(x, y);
    }


}

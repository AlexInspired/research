package com.practice.leetcode.recursion;

import java.util.Arrays;
import java.util.List;

public class CoinChangeProblem {
    List<Integer> coins = Arrays.asList(1, 5, 6, 9);
    int sum = 11;
    public int minCoins(List<Integer> coins, int n, int s) {
        if (s == 0)
            return 0;
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if(coins.get(i) <= s){
                int tmp = minCoins(coins, n, s - coins.get(i));
                if(tmp + 1 < res)
                    res = tmp + 1;
            }
        }
        return res;
    }
}

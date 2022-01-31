package com.practice.hackerrank.recursion;

import java.util.Arrays;
import java.util.List;

public class CoinChangeProblem {
    //    List<Integer> coins = Arrays.asList(1, 2, 5, 10, 12, 20, 50);
    List<Integer> coins = Arrays.asList(1, 2, 5, 10, 12);

    //    int sum = 65;
    int sum = 15;
    int count = 0;

    int countMinCoins(int sum, int index) {
//        if (sum == 0)
//            return 1;
//        if (sumIsGreaterThanCoin(sum, coins.get(coins.size() - 1))) {
//            sum = sum - coins.get(coins.size() - index);//3
//            count++;
//        }
//        return count + countMinCoins(sum, index - 1);
//        for (int i = coins.size(); i > 0; i--) {
//            countMinCoins(sum, i);
//        }
        return 787;
    }

    boolean sumIsGreaterThanCoin(int sum, int nextCoin) {
        return sum - nextCoin > 0 ? true : false;
    }
}

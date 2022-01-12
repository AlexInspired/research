package com.practice.hackerrank.recursion;

//example 8.3 from  Dynamic Programming
public class ScoreWays {
    int count10 = 0;
    int count3 = 0;
    int count5 = 0;
    int count = 0;
    public int countWays(int n) {
       if(n < 0) return 0;
       if(n == 0) return 1;
         count = countWays(n - 10) + countWays(n - 5) + countWays(n - 3);

        return count;
    }
}

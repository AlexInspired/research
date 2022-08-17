package com.practice.leetcode.twopointer;

public class JumpGame7 {
    //        3,5
//    11 011 11101   0011010011010
//      101
//    011010111
//    0110100110100
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        boolean dp[] = new boolean[n];
        char[] ch = s.toCharArray();

        dp[0] = ch[0] == '0';
        int reachable = 0;

        for (int i = 1; i < n; i++) {
            if (i >= minJump) {
                reachable += dp[i - minJump] ? 1 : 0;
            }
            if (i > maxJump) {
                reachable -= dp[i - maxJump - 1] ? 1 : 0;
            }
            dp[i] = reachable > 0 && ch[i] == '0';
        }
        return dp[n - 1];
    }

}

package com.practice.leetcode.number;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String str = String.valueOf(x);
        for (int i = 1; i <= str.length() / 2; i++) {
            if (str.charAt(i-1) != str.charAt(str.length() - i)) {
                return false;
            }
        }
        return true;
    }
}

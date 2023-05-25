package com.practice.leetcode.twopointer;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(s.isEmpty()) return true;
        char[] chars = s.toCharArray();

        for (int l = 0, r = chars.length - 1; l < r; ) {
            if (chars[l] != chars[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

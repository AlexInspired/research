package com.practice.leetcode.string;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = findPalindrome(s, i, i, result);
            result = findPalindrome(s, i, i + 1, result);
        }
        return result;
    }

    private static String findPalindrome(String s, int l, int r, String result) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            String palindrome = s.substring(l, r + 1);
            if (palindrome.length() > result.length()) {
                result = palindrome;
            }
            l--;
            r++;
        }
        return result;
    }
}

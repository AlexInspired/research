package com.practice.leetcode.string;

public class PalindromeWithOneMistake {
    public boolean palindromeWithOneMistake(String given) {

        for (int i = 0; i < given.length(); i++) {
            String rem = given.substring(0, i) + given.substring(i + 1);
            if (isValidPalindrome(rem)) {
                return true;
            }
        }
        return false;
    }

    boolean isValidPalindrome(String candidate) {

        for (int l = 0, r = candidate.length() - 1; l < r; l++, r--) {
            if (candidate.charAt(l) != candidate.charAt(r)) {
                return false;
            }
        }
        return true;
    }


}

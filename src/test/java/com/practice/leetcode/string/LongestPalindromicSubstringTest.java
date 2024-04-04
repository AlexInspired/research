package com.practice.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {
    @Test
    public void test() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String given =  "babad";
        assertEquals("bab",
                longestPalindromicSubstring.longestPalindrome(given));
    }
}
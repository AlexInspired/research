package com.practice.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeWithOneMistakeTest {

    @Test
    public void testUniqueString() {
        PalindromeWithOneMistake palindromeWithOneMistake = new PalindromeWithOneMistake();
        String given = "baaa";
        String given1 = "aaa";

      //  assertTrue(palindromeWithOneMistake.palindromeWithOneMistake(given));
        assertTrue(palindromeWithOneMistake.palindromeWithOneMistake(given1));
    }
}
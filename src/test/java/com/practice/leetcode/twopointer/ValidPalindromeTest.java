package com.practice.leetcode.twopointer;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeTest {
    @Test
    public void test() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String  given = "0P";
        Assert.assertFalse(validPalindrome.isPalindrome(given));

        given = "race a car";
        Assert.assertFalse(validPalindrome.isPalindrome(given));
    }
}
package com.practice.leetcode.number;

import com.practice.leetcode.number.IsPalindrome;
import org.junit.Assert;
import org.junit.Test;

public class IsPalindromeTest {
    @Test
    public void test() {
        IsPalindrome isPalindrome = new IsPalindrome();
        Assert.assertTrue("", isPalindrome.isPalindrome(10));

    }
}

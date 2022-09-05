package com.practice.leetcode.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void test() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

//        String str = "tmmzuxt";
        String str = "abcabcbb";
       // String str = "tabcabcdet";
       // String str = "abcdbfeh";
       // String str = "pabcwwkew";
       // String str = "pabcwakew";

        Assert.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(str));
    }
}
package com.practice.leetcode.string;

import com.practice.leetcode.string.LongestCommonPrefix;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {
    @Test
    public void test() {
        LongestCommonPrefix longestCommonPrefix = new         LongestCommonPrefix();
        String[] strs =  {"flower","flow","flight"};
        assertEquals("fl",
                longestCommonPrefix.longestCommonPrefix(strs));
    }
}

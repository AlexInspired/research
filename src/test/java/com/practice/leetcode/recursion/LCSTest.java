package com.practice.leetcode.recursion;

import com.practice.leetcode.recursion.LCS;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCSTest {

    @Test
    public void testLCS() {
        LCS lcs = new LCS();
        String s1 = "AAACCGTGAGTTATTCGTTCTAGAA";
        String s2 = "CACCCCTAAGGTACCTTTGGTTC";
        assertEquals(13, lcs.countMaxLCS(s1, s2));
        System.out.println("Done");

    }
}

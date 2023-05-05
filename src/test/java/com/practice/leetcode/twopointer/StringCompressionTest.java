package com.practice.leetcode.twopointer;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressionTest {
    @Test
    public void test() {
        StringCompression stringCompression = new StringCompression();

        char[] given = new char[]{'a','a', 'b', 'c', 'c'};

        assertEquals(5, stringCompression.compress(given));

    }
}
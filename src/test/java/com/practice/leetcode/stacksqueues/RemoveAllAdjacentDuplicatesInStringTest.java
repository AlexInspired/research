package com.practice.leetcode.stacksqueues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveAllAdjacentDuplicatesInStringTest {

    @Test
    public void test() {
        RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicatesInString = new RemoveAllAdjacentDuplicatesInString();
        String str = "abbaca";
        assertEquals("ca", removeAllAdjacentDuplicatesInString.removeDuplicates(str));

        String str1 = "azxxzy";
        assertEquals("ay", removeAllAdjacentDuplicatesInString.removeDuplicates(str1));
    }
}
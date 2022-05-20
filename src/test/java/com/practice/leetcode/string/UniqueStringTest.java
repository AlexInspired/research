package com.practice.leetcode.string;

import com.practice.leetcode.string.UniqueString;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UniqueStringTest {

    @Test
    public void testUniqueString() {
        UniqueString uniqueString = new UniqueString();
        String given = "abbc";
        String given2 = "abc";

        assertFalse("false expected", uniqueString.allCharactersUnique(given));
        assertTrue("true expected", uniqueString.allCharactersUnique(given2));
    }

}

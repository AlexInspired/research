package com.practice.leetcode.math;

import com.practice.leetcode.linkedlist.LRUCache;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {
    @Test
    public void test(){
        ReverseInteger reverseInteger = new ReverseInteger();

        assertEquals(321, reverseInteger.reverse(123));
    }
}
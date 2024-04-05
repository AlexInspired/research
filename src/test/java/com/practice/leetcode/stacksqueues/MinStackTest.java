package com.practice.leetcode.stacksqueues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinStackTest {

    @Test
    public void test() {

        MinStack minStack = new MinStack();
        // 0 1 0
        // 0
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        // 0
        int min = minStack.getMin();

        minStack.pop();
        // 1 0
        // 0
        assertEquals(0, minStack.getMin());
    }
}
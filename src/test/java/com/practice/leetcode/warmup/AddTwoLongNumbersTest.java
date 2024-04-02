package com.practice.leetcode.warmup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoLongNumbersTest {

    @Test
    public void testAddTwoLongNumbers() {
        AddTwoLongNumbers addTwoLongNumbers = new AddTwoLongNumbers();

        int mas1[] = new int[]{5, 4, 9};
        int mas2[] = new int[]{1, 2};

        assertEquals("0561", addTwoLongNumbers.solve(mas1, mas2));

        int mas3[] = new int[]{5, 4, 9};
        int mas4[] = new int[]{9 ,1, 2};

        assertEquals("1461",addTwoLongNumbers.solve(mas3, mas4));

        int mas5[] = new int[]{9 ,9, 2};
        int mas6[] = new int[]{   4, 9};

        assertEquals("1041",addTwoLongNumbers.solve(mas5, mas6));

    }

}

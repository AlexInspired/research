package com.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {

    @Test
    public void test() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] given = new int[]{0, 1, 0, 3, 12};
        int[] expected = new int[]{1, 3, 12, 0, 0};
        moveZeroes.moveZeroes(given);
        Assert.assertArrayEquals(expected, given);
    }

}
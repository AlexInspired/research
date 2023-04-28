package com.practice.leetcode.hashmap;

import org.junit.Assert;
import org.junit.Test;

public class LineReflectionTest {

    @Test
    public void test() {
        LineReflection lineReflection = new LineReflection();
        int[][] given = new int[][]{
                {-2, 3},
                {4,3}
        };

        Assert.assertEquals(true, lineReflection.check(given));
    }
}
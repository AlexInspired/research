package com.practice.leetcode.recursion;

import com.practice.leetcode.recursion.CuttingARod;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CuttingARodTest {

    @Test
    public void testCuttingARod() {
        CuttingARod cuttingARod = new CuttingARod();
        List<Integer> values = Arrays.asList(0, 1, 5, 8, 9);
        assertEquals(10, cuttingARod.cutRod(values, 4));

    }
}

package com.practice.leetcode.warmup;

import com.practice.leetcode.warmup.ContiguousMaxProduct;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContiguousMaxProductTest {
    @Test
    public void testMaxProduct() {
        ContiguousMaxProduct contiguousMaxProductTest = new ContiguousMaxProduct();
//        int[] a = {-2, 0, -1};
//        int[] a = {-3,0,1,-2};
//        int[] a = {2, -5, -2, -4, 3};
//        int[] b = {2, -5, -2, 3, 2, 3,-4};
//        int[] c = {2, -5, 2, 3, -2, 3,-4};
//        int[] d = {2, -5, -2, -4, 3, -5, -1};
        int[] a = {-2};
        assertEquals(-2, contiguousMaxProductTest.maxProduct(a));

    }
}

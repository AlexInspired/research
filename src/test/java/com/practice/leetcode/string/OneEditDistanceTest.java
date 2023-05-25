package com.practice.leetcode.string;

import com.practice.leetcode.string.OneEditDistance;
import org.junit.Assert;
import org.junit.Test;

public class OneEditDistanceTest {

    @Test
    public void test() {
        OneEditDistance oneEditDistance = new OneEditDistance();
        String s = "ab";
        String t = "acb";

        Assert.assertTrue(oneEditDistance.checkOneEditDistance(s, t));
    }

    @Test
    public void test2() {
        OneEditDistance oneEditDistance = new OneEditDistance();
        String s = "cab";
        String t = "ad";

        Assert.assertFalse(oneEditDistance.checkOneEditDistance(s, t));
    }

    @Test
    public void test3() {
        OneEditDistance oneEditDistance = new OneEditDistance();
        String s = "1203";
        String t = "1213";

        Assert.assertTrue(oneEditDistance.checkOneEditDistance(s, t));
    }

}
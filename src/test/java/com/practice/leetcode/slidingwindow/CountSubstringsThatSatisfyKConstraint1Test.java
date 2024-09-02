package com.practice.leetcode.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CountSubstringsThatSatisfyKConstraint1Test {

    @Test
    public void test() {
        CountSubstringsThatSatisfyKConstraint1 countSubstringsThatSatisfyKConstraint1 = new CountSubstringsThatSatisfyKConstraint1();

//        1 10 101 1010 10101
//        0 01 010 0101
//        1 10 101
//        0 01 1

        String givenS = "10101";
        int k = 1;

        int actual = countSubstringsThatSatisfyKConstraint1.countKConstraintSubstringsSlidingWindow(givenS, k);

        Assert.assertEquals(12, actual);
    }

    @Test
    public void test2() {
        CountSubstringsThatSatisfyKConstraint1 countSubstringsThatSatisfyKConstraint1 = new CountSubstringsThatSatisfyKConstraint1();

        String givenS = "1010101";
        int k = 2;

        int actual = countSubstringsThatSatisfyKConstraint1.countKConstraintSubstringsSlidingWindow(givenS, k);

        Assert.assertEquals(25, actual);
    }
}
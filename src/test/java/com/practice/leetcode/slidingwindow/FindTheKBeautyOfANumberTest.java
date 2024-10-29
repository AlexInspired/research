package com.practice.leetcode.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheKBeautyOfANumberTest {

    @Test
    public void test() {
        FindTheKBeautyOfANumber findTheKBeautyOfANumber = new FindTheKBeautyOfANumber();
        Assert.assertEquals(2, findTheKBeautyOfANumber.divisorSubstrings(240, 2));
    }

    @Test
    public void test2() {
        FindTheKBeautyOfANumber findTheKBeautyOfANumber = new FindTheKBeautyOfANumber();
        Assert.assertEquals(2, findTheKBeautyOfANumber.divisorSubstrings(430043, 2));
    }

}
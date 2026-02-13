package com.practice.leetcode.twopointer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivideIntervalsIntoMinimumNumberOfGroupsTest {


    @Test
    public void test() {
        DivideIntervalsIntoMinimumNumberOfGroups underTest = new DivideIntervalsIntoMinimumNumberOfGroups();

        int[][] intervals = {{5, 10}, {6, 8}, {1, 5}, {2, 3}, {1, 10}};

        Assert.assertEquals(3 , underTest.minGroups(intervals));
    }

}
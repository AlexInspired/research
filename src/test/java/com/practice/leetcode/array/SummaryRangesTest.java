package com.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SummaryRangesTest {
    @Test
    public void test() {
        SummaryRanges object = new SummaryRanges();

//        int nums[] = new int[]{0, 1};
//        int nums[] = new int[]{0, 1, 2, 4, 5, 6};
        int nums[] = new int[]{0, 1, 2, 4, 5, 7};
        List<String> expected = Arrays.asList(new String[]{"0->2", "4->5", "7"});
        List<String> result = object.summaryRanges(nums);

        Assert.assertEquals(expected, result);
    }
}
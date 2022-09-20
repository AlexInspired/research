package com.practice.leetcode.unionfind;

import org.junit.Assert;
import org.junit.Test;

public class LongestConsecutiveSequenceTest {

    @Test
    public void test() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
//        int[] given = new int[]{0,3,7,2,5,8,4,6,0,1};
        int[] given = new int[]{100, 4, 200, 1, 3, 2};

        Assert.assertEquals(4, longestConsecutiveSequence.longestConsecutive(given));
    }
}
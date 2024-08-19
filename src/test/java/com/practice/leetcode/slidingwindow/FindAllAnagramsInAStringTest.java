package com.practice.leetcode.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FindAllAnagramsInAStringTest {

    @Test
    public void test() {
        FindAllAnagramsInAString findAllAnagramsInAString = new FindAllAnagramsInAString();

        String givenS = "cbaebabacd";
        String givenP = "abc";

        List<Integer> expected = List.of(0, 6);
        List<Integer> actual = findAllAnagramsInAString.findAnagrams(givenS, givenP);

        Assert.assertEquals(expected, actual);
    }

}
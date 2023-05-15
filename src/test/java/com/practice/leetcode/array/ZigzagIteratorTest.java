package com.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ZigzagIteratorTest {

    @Test
    public void test() {
        List<Integer> nums1 = List.of(1, 2);
        List<Integer> nums2 = List.of(3, 4, 5, 6);

        ZigzagIterator sut = new ZigzagIterator(nums1, nums2);
        List<Integer> actualList = new ArrayList<>();
        List<Integer> expectedList = List.of(1, 3, 2, 4, 5, 6);

        while (sut.hasNext()) {
            actualList.add(sut.next());
        }
        Assert.assertEquals(expectedList, actualList);
    }

}
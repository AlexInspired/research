package com.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class MaximizeDistanceToClosestPersonTest {

    @Test
    public void test() {
        MaximizeDistanceToClosestPerson sut = new MaximizeDistanceToClosestPerson();

        int nums[] = new int[]{1,0,0,0,1,0,1};
        //int nums[] = new int[]{1, 1, 0, 0};

        int result = sut.maxDistToClosest(nums);

        Assert.assertEquals(2, result);
    }

}
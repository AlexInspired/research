package com.practice.leetcode.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMinimumInRotatedSortedArrayTest {

    @Test
    public void test1(){
        FindMinimumInRotatedSortedArray object = new FindMinimumInRotatedSortedArray();
        int[] nums = {3,4,5,1,2};
        Assert.assertEquals(1, object.findMin(nums));
    }

    @Test
    public void test2(){
        FindMinimumInRotatedSortedArray object = new FindMinimumInRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        object.findMin(nums);
        Assert.assertEquals(0, object.findMin(nums));
    }

    @Test
    public void test3(){
        FindMinimumInRotatedSortedArray object = new FindMinimumInRotatedSortedArray();
        int[] nums = {3,4,5,1,2};
        Assert.assertEquals(1, object.findMin(nums));
    }

    @Test
    public void test4(){
        FindMinimumInRotatedSortedArray object = new FindMinimumInRotatedSortedArray();
        int[] nums = {3,4,5,1,2};
        object.findMin(nums);
    }

    @Test
    public void test5(){
        FindMinimumInRotatedSortedArray object = new FindMinimumInRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        object.findMin(nums);
        Assert.assertEquals(0, object.findMin3(nums));
    }


    @Test
    public void test6(){
        FindMinimumInRotatedSortedArray object = new FindMinimumInRotatedSortedArray();
        int[] nums = {2,1};
        Assert.assertEquals(1, object.findMin4(nums));
    }

}
package com.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IncreasingTripletSubsequenceTest {

    @Test
    public void test1(){
        IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();
        int[] nums = {2,1,5,0,4,5};
        Assert.assertTrue(increasingTripletSubsequence.increasingTriplet(nums));
    }

    @Test
    public void test2(){
        IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();
        int[] nums = {5,4,3,2,1};
        Assert.assertFalse(increasingTripletSubsequence.increasingTriplet(nums));
    }
}
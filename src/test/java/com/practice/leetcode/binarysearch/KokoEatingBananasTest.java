package com.practice.leetcode.binarysearch;

import com.practice.leetcode.array.IncreasingTripletSubsequence;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KokoEatingBananasTest {

    @Test
    public void test1(){
        KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();
        int[] piles = {3,6,7,11};
        int h = 8;
        Assert.assertEquals(4, kokoEatingBananas.minEatingSpeed(piles, h));
    }

    @Test
    public void test2(){
        KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();
        int[] piles = {30,11,23,4,20};
        int h = 5;
        Assert.assertEquals(30, kokoEatingBananas.minEatingSpeed(piles, h));
    }

    @Test
    public void test3(){
        KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();
        int[] piles = {30,11,23,4,20};
        int h = 6;
        Assert.assertEquals(23, kokoEatingBananas.minEatingSpeed(piles, h));
    }

    @Test
    public void test4(){
        KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();
        int[] piles = {8,8,8};
        int h = 10;
        Assert.assertEquals(3, kokoEatingBananas.minEatingSpeed(piles, h));
    }

    @Test
    public void test5(){
        KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();
        int[] piles = {805306368,805306368,805306368};
        int h = 1000000000;
        Assert.assertEquals(3, kokoEatingBananas.minEatingSpeed(piles, h));
    }

    @Test
    public void test6(){
        KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();
        int[] piles = {2,2};
        int h = 4;
        Assert.assertEquals(1, kokoEatingBananas.minEatingSpeed(piles, h));
    }
}
package com.practice.leetcode.dynamicprogm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void test() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] given = {7,1,5,3,6,4};
        int result = bestTimeToBuyAndSellStock.maxProfit(given);

        Assert.assertEquals(5, result);

        int[] given2 = {7,6,4,3,1};
        int result2 = bestTimeToBuyAndSellStock.maxProfit(given2);

        Assert.assertEquals(0, result2);
    }

}
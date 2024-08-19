package com.practice.leetcode.greedy;

import com.practice.leetcode.dynamicprogm.JumpGame2;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameTest {

    @Test
    public void test1() {
        JumpGame jumpGame = new JumpGame();
        int[] given = {2,3,1,1,4};
        boolean result = jumpGame.canJump(given);

        Assert.assertTrue( result);
    }

    @Test
    public void test2() {
        JumpGame jumpGame = new JumpGame();
        int[] given = {3,2,1,0,4};
        boolean result = jumpGame.canJump(given);

        Assert.assertFalse( result);
    }

}
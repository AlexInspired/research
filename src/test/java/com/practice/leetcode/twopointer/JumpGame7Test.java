package com.practice.leetcode.twopointer;

import org.junit.Assert;
import org.junit.Test;

public class JumpGame7Test {

    @Test
    public void test() {
        JumpGame7 jumpGame7 = new JumpGame7();
        String s = "01101111101";
        int minJump = 3, maxJump = 5;

        Assert.assertFalse("JumpGame4Test assertion error", jumpGame7.canReach(s, minJump, maxJump));
    }
}
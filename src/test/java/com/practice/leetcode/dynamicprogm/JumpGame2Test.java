package com.practice.leetcode.dynamicprogm;

import org.junit.Assert;
import org.junit.Test;

public class JumpGame2Test {
    @Test
    public void test() {
        JumpGame2 jumpGame2 = new JumpGame2();
//        int[] given = {2,3,1,1,4};
        int[] given = {2,1};

        int result = jumpGame2.jump(given);

        Assert.assertEquals(1, result);
    }

}
package com.practice.leetcode.dynamicprogm;

import org.junit.Assert;
import org.junit.Test;

public class JumpGame2Test {
    @Test
    public void test() {
        JumpGame2 jumpGame2 = new JumpGame2();
//        int[] given = {10,9,8,7,6,5,4,3,2,1,1,0};
        int[] given = {4,1,1,3,1,1,1};
        int result = jumpGame2.jump(given);

        Assert.assertEquals(2, result);
    }

}
package com.practice.leetcode.dynamicprogm;

import com.practice.leetcode.array.RotateImage;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGame2Test {


    @Test
    public void test(){
        JumpGame2 jumpGame2 = new JumpGame2();
        int[] given = {2,3,1,1,4};

        int result = jumpGame2.jump(given);

        Assert.assertEquals(3, result);
    }

}
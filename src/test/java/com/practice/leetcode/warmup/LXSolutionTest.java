package com.practice.leetcode.warmup;

import com.practice.leetcode.warmup.LXSolution;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

public class LXSolutionTest {
//    @Test
//    public void test() {
//
//        LXSolution lxSolution = new LXSolution(3);
//
//        Assert.assertTrue(lxSolution.top().isEmpty());
//
//        lxSolution.push(1);
//        Assert.assertTrue(lxSolution.top().containsAll(Arrays.asList(1)));
//
//        lxSolution.push(2);
//        lxSolution.push(3);
//        lxSolution.push(4);
//
//        Assert.assertTrue(lxSolution.top().containsAll(Arrays.asList(2,3,4)));
//    }

    @Test
    public void test2() {

        LXSolution lxSolution = new LXSolution(3);

        Assert.assertTrue(lxSolution.top().isEmpty());

        lxSolution.push("1");
//        Assert.assertTrue(lxSolution.top().containsAll(Arrays.asList(1)));

        lxSolution.push("2");
        lxSolution.push("3");
        lxSolution.push("4");

        Assert.assertTrue(lxSolution.top().containsAll(Arrays.asList("2","3","4")));
    }
}

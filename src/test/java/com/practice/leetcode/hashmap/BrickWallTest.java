package com.practice.leetcode.hashmap;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BrickWallTest {

    @Test
    public void test() {
        BrickWall brickWall = new BrickWall();

        List<List<Integer>> given = new ArrayList<>(List.of(
                new ArrayList<>(List.of(1,2,2,1)),
                new ArrayList<>(List.of(3,1,2)),
                new ArrayList<>(List.of(1,3,2)),
                new ArrayList<>(List.of(2,4)),
                new ArrayList<>(List.of(3,1,2)),
                new ArrayList<>(List.of(1,3,1,1))
        ));

        Assert.assertEquals(2, brickWall.leastBricks(given));
    }

    @Test
    public void test2() {
        BrickWall brickWall = new BrickWall();

        List<List<Integer>> given = new ArrayList<>(List.of(
                new ArrayList<>(List.of(1)),
                new ArrayList<>(List.of(1)),
                new ArrayList<>(List.of(1))
        ));

        Assert.assertEquals(3, brickWall.leastBricks(given));
    }

}
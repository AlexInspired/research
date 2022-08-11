package com.practice.leetcode.simulation;

import com.practice.leetcode.sort.InsertionSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class WalkingRobotSimulation2Test {
    @Test
    public void test() {
        WalkingRobotSimulation2 container = new WalkingRobotSimulation2();
        WalkingRobotSimulation2.Robot robot = container.new Robot(3, 3);
        
        robot.step(5);
    }

}
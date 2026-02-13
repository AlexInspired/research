package com.practice.leetcode.dfs;

import org.junit.Assert;
import org.junit.Test;

public class CourseScheduleTest {

    @Test
    public void test1() {
        // given
        CourseSchedule courseSchedule = new CourseSchedule();
        int numCourses = 5;
        int[][] prerequisites = new int[][]{{1, 0}, {2, 1}, {3, 2}, {4, 3}, {4, 1} ,{4, 0}};

        // when
        Assert.assertTrue(courseSchedule.canFinish(numCourses, prerequisites));
    }

    @Test
    public void test2() {
        // given
        CourseSchedule courseSchedule = new CourseSchedule();
        int numCourses = 5;
        int[][] prerequisites = new int[][]{{1, 0}, {2, 1}, {3, 2}, {4, 3}, {1, 4} ,{4, 0}};

        // when
        Assert.assertFalse(courseSchedule.canFinish(numCourses, prerequisites));
    }
}
package com.practice.leetcode.graphs;

import org.junit.Test;

public class CourseSchedule2Test {
    @Test
    public void test1() {
        // given
        CourseSchedule2 courseSchedule = new CourseSchedule2();
        int numCourses = 4;
        int[][] prerequisites = new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}};

        // when
        int[] result = courseSchedule.findOrder(numCourses, prerequisites);

    }

}
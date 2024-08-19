package com.practice.leetcode.intervals;

import java.util.Arrays;

public class MeetingRooms {
    // int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
    // 1. Сортируем интервалы по началу.
    // 2. Проверяем, что начало последующего интервала позже окончания текущего
    boolean canAttendAllMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < intervals.length - 1; i++) {
            var a = intervals[i];
            var b = intervals[i + 1];
            if (a[1] > b[0]) {
                return false;
            }
        }
        return true;

    }
}

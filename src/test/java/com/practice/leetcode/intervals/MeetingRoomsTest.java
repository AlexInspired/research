package com.practice.leetcode.intervals;

import org.junit.Assert;
import org.junit.Test;

public class MeetingRoomsTest {

    @Test
    public void test() {
        MeetingRooms meetingRooms = new MeetingRooms();
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        int[][] intervals2 = {{7,10}, {2,4}};

        var actual = meetingRooms.canAttendAllMeetings(intervals);
        Assert.assertEquals(Boolean.FALSE, actual);

        var actual2 = meetingRooms.canAttendAllMeetings(intervals2);
        Assert.assertEquals(Boolean.TRUE, actual2);
    }

}
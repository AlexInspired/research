package com.practice.leetcode.warmup;

import com.practice.leetcode.warmup.CurrentDateTime;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class CurrentDateTimeTest {
    @Test
    public void testCurrentDateTime() {
        CurrentDateTime currentDateTime = new CurrentDateTime();
        log.info("Current time is: " + currentDateTime.getCurrentTime1());
        log.info("Current instant is: " + currentDateTime.getCurrentTime2());
    }
}

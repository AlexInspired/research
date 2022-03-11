package com.practice.leetcode.warmup;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public String getCurrentTime1() {
         return LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("d.MM.yyyy 'um' HH:mm 'Uhr'"));

    }
    public String getCurrentTime2() {
        Instant instant = Instant.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy_hh:mm:ss").withZone(ZoneId.of("Europe/Moscow"));
        return formatter.format(instant);
    }
}

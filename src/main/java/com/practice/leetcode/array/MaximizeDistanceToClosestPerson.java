package com.practice.leetcode.array;

public class MaximizeDistanceToClosestPerson {

    public int maxDistToClosest(int[] seats) {
        if (seats.length == 2)
            return 1;
        int zeroCounter = 0;
        int maxDistance = 0;
        int startIntervalValue = seats[0];
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                if (startIntervalValue == 0 && i > 0) {
                    maxDistance = zeroCounter;
                    startIntervalValue = seats[i];
                    zeroCounter = 0;
                    continue;
                }
                int currentDistance = calculateCurrentDistance(zeroCounter);
                if (currentDistance > maxDistance) {
                    maxDistance = currentDistance;
                }
                zeroCounter = 0;

            } else {
                //case when  0 1 0 0
                zeroCounter++;
                if (i == seats.length - 1){
                    if(zeroCounter > maxDistance){
                        maxDistance = zeroCounter;
                    }
                }
            }
        }
        return maxDistance;
    }

    private int calculateCurrentDistance(int zeroCounter) {
        if (zeroCounter == 0) return 0;
        if (zeroCounter % 2 == 0) {
            return zeroCounter / 2;
        } else {
            return zeroCounter / 2 + 1;
        }
    }
}

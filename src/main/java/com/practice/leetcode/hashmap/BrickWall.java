package com.practice.leetcode.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall {

    List<List<Integer>> given = new ArrayList<>(List.of(
            new ArrayList<>(List.of(1, 2, 2, 1)),
            new ArrayList<>(List.of(3, 1, 2)),
            new ArrayList<>(List.of(1, 3, 2)),
            new ArrayList<>(List.of(2, 4)),
            new ArrayList<>(List.of(3, 1, 2)),
            new ArrayList<>(List.of(1, 3, 1, 1))
    ));

    public int leastBricks(List<List<Integer>> wall) {

        Map<Integer, Integer> gapsBySpot = new HashMap<>();

        for (List<Integer> row : wall) {
            int gapSpot = 0;
            int gapCounterForSpot = 0;
            // последний столбец не интересен, тк там всегда gap
            for (int column = 0; column < row.size() - 1; column++) {
                gapSpot = gapSpot + row.get(column);
                gapCounterForSpot = gapsBySpot.getOrDefault(gapSpot, 0);
                gapsBySpot.put(gapSpot, gapCounterForSpot + 1);
            }
        }
        int maxGapsInAnyColumn = 0;
        if (!gapsBySpot.values().isEmpty()) {
            maxGapsInAnyColumn = Collections.max(gapsBySpot.values());
        }
        return wall.size() - maxGapsInAnyColumn;
    }
}

package com.practice.leetcode.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LineReflection {

    public boolean check(int[][] points) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Map<Integer, HashSet<Integer>> ys = new HashMap<Integer, HashSet<Integer>>();

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            min = Math.min(min, x);
            max = Math.max(max, x);
            if (!ys.containsKey(y)) {
                ys.put(y, new HashSet<>());
            }
            ys.get(y).add(x);
        }
        int doubleBar = min + max;
        for (Integer y : ys.keySet()) {
            for(Integer x: ys.get(y)){
                int mx = doubleBar - x;
                if(!ys.get(y).contains(mx)){
                return false;
                }
            }
        }
        return true;
    }
}

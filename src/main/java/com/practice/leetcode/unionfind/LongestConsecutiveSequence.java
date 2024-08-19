package com.practice.leetcode.unionfind;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int e : nums) set.add(e);
        int ans = 0;
        for (int e : set) {
            // local minimum
            if (!set.contains(e - 1)) {
                int len = 1;
                while (set.contains(++e)) {
                    len++;
                }
                ans = Math.max(ans, len);
            }
        }
        return ans;
    }

}

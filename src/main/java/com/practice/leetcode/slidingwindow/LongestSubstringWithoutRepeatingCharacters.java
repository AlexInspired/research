package com.practice.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LongestSubstringWithoutRepeatingCharacters {

    //abcdbfeh
    public int lengthOfLongestSubstring(String s) {
        if (s == "") return 0;
        if(s.length() == 1) return 1;
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Integer> counters = new PriorityQueue<>((a, b) -> b - a);
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]) && i - map.get(arr[i]) <= counter) {
                counters.offer(counter);
                counter = i - map.get(arr[i]);
                map.put(arr[i], i);
            } else {
                map.put(arr[i], i);
                counter++;
                if(i == arr.length - 1){
                    counters.offer(counter);
                }
            }
        }
        if(counters.peek() == null){
            return s.length();
        }
        return counters.peek();
    }

}

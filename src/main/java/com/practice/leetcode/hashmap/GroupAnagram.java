package com.practice.leetcode.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs.length == 0) return  result;
        List<String> givenList = Arrays.asList(strs);
        Map<String, List<String>> map = new HashMap<>();
        for (String token : givenList) {
            String key = translateKey(token);
            if (map.containsKey(key)) {
                List<String> groupOfAnagrams = map.get(key);
                groupOfAnagrams.add(token);
            } else {
                List newGroupOfAnagrams = new ArrayList<>();
                newGroupOfAnagrams.add(token);
                map.put(key, newGroupOfAnagrams);
            }
        }
        for(List<String> group : map.values()){
            result.add(group);
        }
        return result;
    }

    private String translateKey(String str) {
        char[] key = str.toCharArray();
        Arrays.sort(key);
        return String.valueOf(key);
    }
}

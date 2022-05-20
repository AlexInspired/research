package com.practice.leetcode.linkedlist;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LRUCache {
    private int cacheSize;
    private Map<Integer, Integer> map = new HashMap<>();
    private List<Integer> linkedList = new LinkedList<>();

    public LRUCache(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)){
            makeRecently(key, value);
            return;
        }

        if(map.size() == cacheSize) {
            map.remove(linkedList.get(0));
            linkedList.remove(0);
        }

        linkedList.add(key);
        map.put(key, value);
    }

    private void makeRecently(Integer key, Integer value) {
        linkedList.remove(key);
        linkedList.add(key);
        map.put(key, value);
    }

    private void makeRecently(Integer key) {
        linkedList.remove(key);
        linkedList.add(key);
    }

    public int get(int key){
        if(!map.containsKey(key)) return -1;
        makeRecently(key);
        return map.getOrDefault(key, -1);
    }
}

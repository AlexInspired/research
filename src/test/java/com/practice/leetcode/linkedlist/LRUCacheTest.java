package com.practice.leetcode.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LRUCacheTest {

    @Test
    public void test(){
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        assertEquals((long)1, (long)lRUCache.get(1));
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        assertEquals((long)3, (long)lRUCache.get(3));
        assertEquals((long)-1, (long)lRUCache.get(2));
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lRUCache.get(1);    // return -1 (not found)
        lRUCache.get(3);    // return 3
        lRUCache.get(4);    // return 4
    }

    //    @Test
    public void whenInputElementsExceedCacheSize_thenEvictLastRecentlyUsedElement(){

        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);

        assertEquals((long)-1, (long)lruCache.get(1));
    }
    // test case eviction policy (when cache is full and item is added)

 //   @Test
    public void whenPutElementsWithSameKey_thenRefreshItsPositionInCache(){
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(1, 1);
        lruCache.put(3, 3);

        assertEquals((long)-1, (long)lruCache.get(2));
    }
// test case eviction policy (when cache is full and item is added)
}

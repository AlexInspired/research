package com.practice.leetcode.heap;

import com.practice.leetcode.hashmap.GroupAnagram;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TopKFrequentWordsTest {

    @Test
    public void test() {
        TopKFrequentWords topKFrequentWords = new TopKFrequentWords();
        String[] given = {"i","love","leetcode","i","love","coding"};
        List<String> expected = List.of("i","love");
        List<String> actual = topKFrequentWords.topKFrequent(given, 2);

        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }

}
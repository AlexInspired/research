package com.practice.leetcode.hashmap;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GroupAnagramTest {

    @Test
    public void test() {
        GroupAnagram groupAnagram = new GroupAnagram();
        String[] given = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<String> list1 = List.of("bat");
        List<String> list2 = List.of("nat", "tan");
        List<String> list3 = List.of("ate", "eat", "tea");
        List<List<String>> expected = List.of(list1, list2, list3);
        groupAnagram.groupAnagrams(given);
    }

    @Test
    public void test1() {
        GroupAnagram groupAnagram = new GroupAnagram();
        String[] given = {"a"};
        List<String> list1 = List.of("a");
        List<List<String>> expected = List.of(list1);
        groupAnagram.groupAnagrams(given);
    }
}
package com.practice.leetcode.warmup;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GZSolution {
    // Написать функцию int indexOfFirstUnique(String str), которая находит индекс первого уникального символа в строке str. Какая сложность?
// Example:
// Input: abcfabe
// Output: 2


//    Даны таблицы:
//    Singer (id, name)
//    Album (id, singer_id, sales)
//
//1 Bob
//2 Martin
//
//            1 Album1 1, 100
//            2 Album2 1, 200
//            3 Album3 2, 300
//
//    Выбрать:
//    singer id, singer name, сумма по всем album sales певца
//    где эта sum sales > 200000
//
//    SELECT s.id, s.name, sum(sales) from singer as s
//    LEFT OUTER JOIN album as a ON s.id = a.singer_id
//    GROUP BY name
//    HAVING sum(sales) > 200000

    public int indexOfFirstUnique(String str) {
        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            Integer count = map.getOrDefault(charArray[i], 0);
            count++;
            map.put(charArray[i], count);
        }
        for (Character key : map.keySet()) {
           if(map.get(key) == 1){
               return str.indexOf(key);
           }
        }
        return -1;
    }

}

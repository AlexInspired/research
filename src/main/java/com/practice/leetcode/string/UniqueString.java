package com.practice.leetcode.string;

import scala.Char;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueString {

    public boolean allCharactersUnique(String str){
        char[] charArray = str.toCharArray();
        Map<String, Integer> countMap = new HashMap<>();
        for(int i = 0; i < charArray.length; i++){
            String currentChar = String.valueOf(charArray[i]);
            if(countMap.containsKey(currentChar)){
                int countForKey = countMap.get(currentChar);
                countMap.put(currentChar, ++countForKey);
            }
            else{
                countMap.put(currentChar, 1);
            }
        }
        for(Map.Entry<String, Integer> entry: countMap.entrySet()){
            if(entry.getValue() > 1){
                return false;
            }
        }

        return true;
    }
}

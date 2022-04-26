package com.practice.leetcode.string;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0 || strs.length == 1) return "";
        int minStrLen = strs[0].length();
        for(int i =1; i < strs.length; i++){
            minStrLen = Math.min(strs[i].length(), minStrLen);
        }
        StringBuilder result = new StringBuilder("");
        for(int i = 0; i < minStrLen; i++) {
            for(int j =0; j < strs.length -1; j++){
               if(strs[j].charAt(i) == strs[j+1].charAt(i)){
               }
               else{
                   return result.toString();
               }
               if(j == strs.length -2){
                   result.append(strs[j].charAt(i));
               }
            }
        }
        return result.toString();
    }

}

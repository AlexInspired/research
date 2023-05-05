package com.practice.leetcode.twopointer;

public class StringCompression {

    public int compress(char[] chars) {
        int i = 0;
        for (int j = 1, count = 1; j <= chars.length; j++, count++) {
            if (j == chars.length || chars[j] != chars[j - 1]) {
                chars[i++] = chars[j - 1];
                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[i++] = c;
                    }
                }
                count = 0;
            }
        }
        return i;
    }
}

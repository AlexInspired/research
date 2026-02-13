package com.practice.leetcode.slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LongestSubstringWithoutRepeatingCharacters {

    //abcdbfeh
    public int lengthOfLongestSubstring(String s) {
       int[] lastSeen = new int[128];

        Arrays.fill(lastSeen, -1);
        int left = 0, maxLen = 0;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            // Если символ уже был в текущем окне — сдвигаем left
            if (lastSeen[c] >= left) {
                left = lastSeen[c] + 1;
            }
            // Обновляем позицию символа
            lastSeen[c] = right;

            // Обновляем максимальную длину
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

}

package com.practice.leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {

    // Заводим массивы частот попадающихся символов - для s и p строк
    // Наполняем размер скользящего окна.
    // Ищем анаграмму слева направо.
    // Оставляем символ слева, прибавляем в скользящее окно символ справа.
    // Сравниваем частоты.

    // s = "cbaebabfacd", p = "abc"
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();
        int[] freqP = new int[26];
        int[] freqS = new int[26];

        if (s.length() < p.length()) {
            return result;
        }

        int right = 0;
        for (int i = 0; i < p.length(); i++) {
            freqP[(p.charAt(i) - 'a')]++;
            freqS[(s.charAt(right) - 'a')]++;
            right++;
        }

        if (Arrays.equals(freqP, freqS)) {
            result.add(0);
        }

        int left = 0;
        while (right < s.length()) {

            freqS[s.charAt(left) - 'a']--;
            freqS[s.charAt(right) - 'a']++;

            if (Arrays.equals(freqP, freqS)) {
                //тк сначала сдвигаем вправо, а потом проверяем, то + 1.
                result.add(left + 1);
            }

            left++;
            right++;
        }
        return result;
    }

}

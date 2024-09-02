package com.practice.leetcode.slidingwindow;

public class CountSubstringsThatSatisfyKConstraint1 {

//    "10101"
//    Input: s = "10101", k = 1
//    it 1: l = 0, r = 0; "1", res += r - l + 1 = 1; +1 (1)
//    it 2: l = 0, r = 1; "10", res += r - l + 1 = 2; +2 (0 and 10)
//    it 3: l = 0, r = 2; "101", +3 (1 and 01 and 101)
//    right - left + 1 = он считает все подстроки с новым символом на конце: в данном случае 1, 01, 101.
//    Их количество равно длинне интервала (right - left), тк этот конечный символ должен входить в каждую
//    подстроку.
//    Предыдущие подстроки, входящие во множество подстрок интервала (right - left) подсчитаны на предыдущих
//    итерациях.

//     1 0 1
//     10
//     01
//     101
//    n*(n+1)/2 = 6;

    public int countKConstraintSubstrings(String s, int k) {

        int resultSum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                System.out.println(substring);
                if (kConditionsHold(substring, k)) {
                    resultSum++;
                }
            }
        }
        return resultSum;
    }



//        10101
//        1 10 101 1010 10101
//        0 01 010 0101
//        1 10 101
//        0 01 1
    public int countKConstraintSubstringsSlidingWindow(String s, int k) {

        int result = 0;
        int l = 0, r = 0, zeroes = 0, ones = 0;
        while (r < s.length()) {

            if (s.charAt(r) == '0')
                zeroes++;
            else ones++;

            // Both exceed k, so we need to shrink the window
            while (zeroes > k && ones > k) {
                if (s.charAt(l) == '0')
                    zeroes--;
                else ones--;
                l++;
            }
            result += r - l + 1;
            r++;
        }

        return result;
    }


    private boolean kConditionsHold(String substring, int k) {
        char[] array = substring.toCharArray();
        int zeroCount = 0, onesCount = 0;
        for (char c : array) {
            if (c == '0') zeroCount++;
            if (c == '1') onesCount++;
        }

        return zeroCount <= k || onesCount <= k;
    }
}

package com.practice.leetcode.slidingwindow;

public class FindTheKBeautyOfANumber {

    public int divisorSubstrings(int num, int k) {

        String numberStr = String.valueOf(num);

        int l = 0, r = k, result = 0;
        while (r <= numberStr.length()) {

            if (isDivisor(numberStr.substring(l, r), num)) {
                result++;
            }

            l++;
            r++;
        }
        return result;
    }

    private boolean isDivisor(String substring, int num) {

        Integer subNum = Integer.parseInt(substring);
        if (subNum.equals(0)) return false;

        return num % subNum == 0;
    }
}

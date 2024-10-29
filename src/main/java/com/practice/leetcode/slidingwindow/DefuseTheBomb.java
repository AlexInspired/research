package com.practice.leetcode.slidingwindow;

import java.util.Arrays;

public class DefuseTheBomb {

    //    12345 -> 54321
    //
    //        5432
    //        1543
    //        2154
    //        3215
    //        4321

    // {5, 7, 1, 4}
    // Чтобы подсчитать циркулярный индекс используем формулу j % code.length;
    // Для к < 0 переворачивапм массив и идем справа налево.
    public int[] decrypt(int[] code, int k) {

        int windowSum = 0;
        int[] res = new int[code.length];

        if (k == 0) {
            res = Arrays.stream(code)
                    .map(el -> 0)
                    .toArray();
        }
        if (k < 0) {
             k = k * (-1);
            reverse(code);
            for (int i = code.length - 1; i >= 0; i--) {
                for (int j = i + 1; j <= i + k; j++) {
                    if (j >= code.length) {
                        int sircularInx = j % code.length;
                        windowSum = windowSum + code[sircularInx];
                    } else {
                        windowSum = windowSum + code[j];
                    }
                }
                res[i] = windowSum;
                windowSum = 0;
            }
            reverse(res);
            return res;
        }
        if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                for (int j = i + 1; j <= i + k; j++) {
                    if (j >= code.length) {
                        int sircularInx = (j % code.length);
                        windowSum = windowSum + code[sircularInx];
                    } else {
                        windowSum = windowSum + code[j];
                    }
                }
                res[i] = windowSum;
                windowSum = 0;
            }
            return res;
        }
        return res;
    }

    private void reverse(int[] data) {
        int left = 0;
        int right = data.length - 1;

        while (left < right) {
            // swap the values at the left and right indices
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;

            // move the left and right index pointers in toward the center
            left++;
            right--;
        }
    }
}

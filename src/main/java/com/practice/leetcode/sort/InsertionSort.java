package com.practice.leetcode.sort;

import java.util.List;

public class InsertionSort {
    //    (2, 5, 1, 6, 2);
    //    (2, 1, 5, 6, 2);
    //    (2, 1, 5, 6, 2);

    public List<Integer> insertionSort(List<Integer> given) {
        for (int i = 1; i < given.size(); i++) {
            Integer currentElement = given.get(i);
            for (int j = i - 1; j >= 0; j--) {
                if (given.get(j) > currentElement) {
                    int temp = given.get(j);
                    given.set(j, currentElement);
                    given.set(j + 1, temp);
                }
            }
        }
        return given;
    }
}

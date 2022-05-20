package com.practice.leetcode.sort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import com.practice.leetcode.sort.InsertionSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        List<Integer> givenArray = new ArrayList<>(Arrays.asList(2, 5, 1, 6, 2));
        List<Integer> sortedArray = Arrays.asList(2, 5, 1, 6, 2);

        InsertionSort insertionSort = new InsertionSort();

        sortedArray = insertionSort.insertionSort(givenArray);

        assertEquals(givenArray,sortedArray);

    }
}

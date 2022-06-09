package com.practice.leetcode.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FindFirstandLastPositionofElementinSortedArrayTest {

    @Test
    public void testInsertionSort() {
        List<Integer> givenArray = new ArrayList<>(Arrays.asList(2, 5, 1, 6, 2));
        List<Integer> sortedArray = Arrays.asList(2, 5, 1, 6, 2);

        InsertionSort insertionSort = new InsertionSort();

        sortedArray = insertionSort.insertionSort(givenArray);

        assertEquals(givenArray,sortedArray);

    }

}
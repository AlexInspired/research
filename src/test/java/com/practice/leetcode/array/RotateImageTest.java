package com.practice.leetcode.array;

import com.practice.leetcode.linkedlist.LRUCache;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotateImageTest {

    @Test
    public void test(){
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] expectedMatrix = {
                {7,4,1},
                {8,5,2},
                {9,6,3}
        };
        rotateImage.rotate(matrix);
        Assert.assertArrayEquals(expectedMatrix, matrix);
    }
}

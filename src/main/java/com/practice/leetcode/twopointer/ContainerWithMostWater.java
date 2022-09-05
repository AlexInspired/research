package com.practice.leetcode.twopointer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//{0,14,6,2,10,9,4,1,10,3}
public class ContainerWithMostWater  {

    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        int currArea = 0;
        while (left < right) {
            currArea = (right - left) * Math.min(height[left], height[right]);
            if (currArea > maxArea) {
                maxArea = currArea;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}

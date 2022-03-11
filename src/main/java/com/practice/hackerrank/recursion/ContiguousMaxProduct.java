package com.practice.hackerrank.recursion;

import java.util.ArrayList;
import java.util.List;

public class ContiguousMaxProduct {

    public int maxProduct(int[] nums) {
        List<int[]> splitted = splitArrayByZeroV2(nums);
        int max = Integer.MIN_VALUE;
        int currentMax = 0;
        for (int[] subarray : splitted) {
            currentMax = maxProductForSubarray(subarray);
            if (max < currentMax) {
                max = currentMax;
            }
        }
        if (splitted.size() > 1 && max < 0)
            max = 0;
        return max;
    }

    private List<int[]> splitArrayByZeroV2(int[] nums) {
        List<int[]> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>(5);
        boolean anyZeroFound = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp.add(nums[i]);
            } else {
                anyZeroFound = true;
                result.add(temp.stream().mapToInt(j -> j).toArray());
                temp.clear();
            }
        }

        if(!anyZeroFound){
            result.add(nums);
        }
        else {
            result.add(temp.stream().mapToInt(j -> j).toArray());
        }
        return result;
    }

    public int maxProductForSubarray(int[] nums) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int evenSignedProduct = nums[0];
        int oddSignedProduct = 0;
        int signCounter = 0;
        if (nums[0] < 0) signCounter++;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                signCounter++;
            }
            evenSignedProduct = Math.abs(evenSignedProduct * nums[i]);
        }
        if (signCounter % 2 == 0) {
            return evenSignedProduct;
        } else {
            oddSignedProduct = solveOddSignes(nums, signCounter);
            return oddSignedProduct;
        }
    }

    private int solveOddSignes(int[] nums, int signCounter) {
        int currentSignCounter = 0;
        int evenSignedProductLR = 1;
        int evenSignedProductRL = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                currentSignCounter++;
            }
            evenSignedProductLR = Math.abs(evenSignedProductLR * nums[i]);
            if (signCounter - 1 == 0) {
                if (currentSignCounter == 1) {
                    evenSignedProductLR = Math.abs(evenSignedProductLR / nums[i]);
                    break;
                }
            } else if (currentSignCounter == signCounter) {
                evenSignedProductLR = Math.abs(evenSignedProductLR / nums[i]);
                break;
            }
        }
        currentSignCounter = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 0) {
                currentSignCounter++;
            }
            evenSignedProductRL = Math.abs(evenSignedProductRL * nums[i]);
            if (signCounter - 1 == 0) {
                if (currentSignCounter == 1) {
                    evenSignedProductRL = Math.abs(evenSignedProductRL / nums[i]);
                    break;
                }
            } else if (currentSignCounter == signCounter) {
                evenSignedProductRL = Math.abs(evenSignedProductRL / nums[i]);
                break;
            }

        }
        return Math.max(evenSignedProductLR, evenSignedProductRL);
    }

}

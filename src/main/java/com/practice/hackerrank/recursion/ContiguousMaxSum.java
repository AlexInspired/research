package com.practice.hackerrank.recursion;

import java.util.Arrays;
import java.util.List;

public class ContiguousMaxSum {

    List<Integer> arr = Arrays.asList(-2, -3, 4, -1, -2, 1, 5, -3);

    public int count(){
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            sum = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++){
                sum = sum + arr.get(j);
                if(maxSum < sum) maxSum = sum;
            }
        }

        return maxSum;
    }
}

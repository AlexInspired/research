package com.practice.hackerrank.recursion;

import java.util.Arrays;
import java.util.List;

public class CuttingARod {
    List<Integer> values = Arrays.asList(0, 1, 5, 8, 9);
    public int cutRod(List<Integer> value, int n){
        if(n <= 0)
            return 0;
        int maxValue = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            maxValue = Math.max(maxValue,
                    value.get(i) + cutRod(value, n-i));
        }
        return maxValue;
    }

}

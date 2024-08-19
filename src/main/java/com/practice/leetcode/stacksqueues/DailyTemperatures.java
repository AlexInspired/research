package com.practice.leetcode.stacksqueues;

import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
//      73, 74, 75, 71, 69, 72, 76, 76, 73
//       0,  1,  2,  3,  4,  5,  6,  7,  8
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (i == temperatures.length - 1) {
                result[i] = 0;
                stack.push(i);
                continue;
            }

            if (temperatures[i] <  temperatures[stack.peek()]) {
                stack.push(i);
                result[i] = 1;
                continue;
            }

            // temperatures[i] >= stack.peek()
            boolean stackWasEmpty = false;
            while (temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
                if (stack.isEmpty()) {
                    result[i] = 0;
                    stack.push(i);
                    stackWasEmpty = true;
                    break;
                }
            }
            if (!stackWasEmpty) {
                result[i] = stack.peek() - i;
                stack.push(i);
            }
        }

        return result;
    }
}

package com.practice.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {

    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder("(");
        generate(0, n, sb);

        return result;
    }

    private void generate(int countP, int n, StringBuilder sb) {
        if (countP == 2 * n - 1) {
            // System.out.println(sb);
            if (validate(sb))
                result.add(sb.toString());
            return;
        }
        countP++;
        generate(countP, n, sb.append("("));
        sb.delete(countP, sb.length());
        generate(countP, n, sb.append(")"));
    }

    private boolean validate(StringBuilder sb) {
        char mas[] = sb.toString().toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == '(')
                stack.push(mas[i]);
            else if (mas[i] == ')') {
                if (stack.isEmpty())
                    return false;
                stack.pop();
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}

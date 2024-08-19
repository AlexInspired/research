package com.practice.leetcode.stacksqueues;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperation(token)) {
                int op2 = Integer.parseInt(stack.pop());
                int op1 = Integer.parseInt(stack.pop());

                int localResult = evaluate(op1, op2, token);

                stack.push(String.valueOf(localResult));
            } else {
                stack.push(token);
            }
        }

      return Integer.parseInt(stack.pop());
    }

    private boolean isOperation(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int evaluate(int op1, int op2, String operation) {

        return switch (operation) {
            case "+" -> op1 + op2;
            case "-" -> op1 - op2;
            case "*" -> op1 * op2;
            case "/" -> op1 / op2;
            default -> -1;
        };
    }
}

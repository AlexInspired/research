package com.practice.leetcode.stacksqueues;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveAllAdjacentDuplicatesInString {
    //"azxxzy"
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character topChar = stack.empty() ? Character.MIN_VALUE : stack.peek();
            Character currentChar = s.charAt(i);
            if (topChar == currentChar) {
                stack.pop();
            } else {
                stack.push(currentChar);
            }
        }

        return stack.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}

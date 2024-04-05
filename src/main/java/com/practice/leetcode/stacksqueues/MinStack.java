package com.practice.leetcode.stacksqueues;

import java.util.LinkedList;
import java.util.List;

public class MinStack {
    LinkedList<Integer> mainList;
    LinkedList<Integer> minList;

    public MinStack() {
        mainList = new LinkedList<>();
        minList = new LinkedList<>();
    }

    public void push(int val) {
        mainList.addFirst(val);
        if (minList.isEmpty()) {
            minList.addFirst(val);
        } else if (minList.getFirst() >= val) {
            minList.addFirst(val);
        }
    }

    public void pop() {
        int topElement = mainList.removeFirst();
        if (minList.getFirst() == topElement) {
            minList.removeFirst();
        }
    }

    public int top() {
        return mainList.getFirst();
    }

    public int getMin() {
        return minList.getFirst();
    }

}

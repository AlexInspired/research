package com.practice.leetcode.stacksqueues;

import org.junit.Assert;
import org.junit.Test;

public class EvaluateReversePolishNotationTest {

    @Test
    public void test() {

        String[] given = new String[]{"2", "1", "+", "3", "*"};
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();
        int result = evaluateReversePolishNotation.evalRPN(given);
        int expected = 9;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void test2() {

        String[] given = new String[]{"4", "13", "5", "/", "+"};
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();
        int result = evaluateReversePolishNotation.evalRPN(given);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

}
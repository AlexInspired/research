package com.practice.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

//Input: digits = "23"
//        Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
public class LetterCombinationsOfAPhoneNumber {

    private static final String[] KEY_PAD = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits.length() == 0)
            return res;
        backtrack(digits, 0, new StringBuilder(), res);
        return res;
    }

    void backtrack(String digits, int idx, StringBuilder temp, List<String> res) {
        if (idx == digits.length()) {
            res.add(new String(temp));
            return;
        }
        char[] keys = KEY_PAD[digits.charAt(idx) - '0'].toCharArray();

        for (char c : keys) {
            temp.append(c);
            backtrack(digits, idx + 1, temp, res);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}

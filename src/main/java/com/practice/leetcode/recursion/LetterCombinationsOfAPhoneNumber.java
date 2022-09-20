package com.practice.leetcode.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Input: digits = "23"
//        Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
public class LetterCombinationsOfAPhoneNumber {

    Map<Integer, String> stringBYNumber = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        init();

        findComb(digits);

        return new ArrayList<>();
    }

    private void findComb(String digits) {

        //23


    }

    private void init() {
        stringBYNumber.put(1, "");
        stringBYNumber.put(2, "abc");
        stringBYNumber.put(3, "def");
        stringBYNumber.put(4, "ghi");
        stringBYNumber.put(5, "jkl");
        stringBYNumber.put(6, "mno");
        stringBYNumber.put(7, "pqrs");
        stringBYNumber.put(8, "tuv");
        stringBYNumber.put(9, "wxyz");
    }

}

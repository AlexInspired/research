package com.practice.leetcode.recursion;
//NOT Leetcode
public class StringPermutation {

    //a b c
    //a c b

    //b a c
    //b c a

    //c a b
    //c b a

    public void permutation(String given) {
        permutation(given, "");
    }

    private void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String rem = str.substring(0, i) + str.substring(i + 1);
            permutation(rem, prefix + str.charAt(i));
        }
    }
}

package com.practice.leetcode.string;

public class OneEditDistance {

    public boolean checkOneEditDistance(String s, String t) {

        int ns = s.length();
        int nt = t.length();

        if (nt < ns) {
            return checkOneEditDistance(t, s);
        }

        if (nt - ns > 1) return false;

        for (int i = 0; i < ns; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (nt == ns) {
                    return s.substring(i + 1).equals(t.substring(i + 1));
                } else {
                    return s.substring(i).equals(t.substring(i + 1));
                }
            }
        }

        return nt == ns + 1;

//
//    aabc
//    aaxc
//
//    aabc
//    aaxbc
    }
}

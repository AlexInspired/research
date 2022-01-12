package com.practice.hackerrank.recursion;

public class LCS {

    public int countMaxLCS(String s1, String s2){
        if(s1.length() == 1 || s2.length() == 1){
            return 0;
        }
        if (s1.charAt(0) == s2.charAt(0)) {
            return 1 + countMaxLCS(s1.substring(1, s1.length()), s2.substring(1, s2.length()));
        }
        else{
            return Math.max(countMaxLCS(s1.substring(1, s1.length()), s2),

                    countMaxLCS(s1, s2.substring(1, s2.length())));
        }
    }

}

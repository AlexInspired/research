package com.practice.leetcode.recursion;

public class PermutationInString {

    //TODO learn other non recursive solutions on leetcode
    //Approach #2 Using sorting [Time Limit Exceeded]:
//    Approach #3 Using Hashmap [Time Limit Exceeded]
//    Approach #4 Using Array [Accepted]
//    Approach #5 Sliding Window [Accepted]:
//    Approach #6 Optimized Sliding Window [Accepted]:
    public boolean checkInclusion(String s1, String s2) {
        if(permute(s1, 0, s1.length() - 1, s2)){
            return true;
        }
        return false;
    }

    private boolean permute(String str, int left, int right, String target) {
        if( left == right){
            if(target.contains(str))
                return true;
        }

        for(int i = left; i <= right; i++ ){
            String swapped = swap(str, left, i);
            if(permute(swapped, left+1, right, target))
                return true;
        }
        return false;
    }

    String swap(String str, int left, int right) {
        char[] charArray = str.toCharArray();
        char tmp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = tmp;
        return String.valueOf(charArray);
    }
}

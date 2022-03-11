package com.practice.leetcode.recursion;

public class TowerOfHanoi {

    public static void main(String[] args){
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.run('s','d', 'e', 3);
    }

    private void run(char s, char d, char e, int n) {
        if(n == 0) return;

        run(s, e, d, n-1);
        System.out.println("Move disk " + n + " from " + s + " to " + d);
        run(e, d, s, n-1);

    }
}

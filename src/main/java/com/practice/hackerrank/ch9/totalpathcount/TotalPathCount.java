package com.practice.hackerrank.ch9.totalpathcount;

import com.practice.hackerrank.recursion.TowerOfHanoi;

public class TotalPathCount {
    public static void main(String[] args){
        TotalPathCount tpc = new TotalPathCount();
        tpc.run('s','d', 'e', 3);
    }

    private void run(char s, char d, char e, int n) {
        if(n == 0) return;

        run(s, e, d, n-1);
        System.out.println("Move disk " + n + " from " + s + " to " + d);
        run(e, d, s, n-1);

    }
}

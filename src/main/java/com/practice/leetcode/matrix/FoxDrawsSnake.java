package com.practice.leetcode.matrix;

import java.util.Scanner;

public class FoxDrawsSnake {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        drawSnake(Integer.valueOf(input[0]), Integer.valueOf(input[1]));
    }

    static void drawSnake(int n, int m) {
        StringBuilder sharpPatternSb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sharpPatternSb.append("#");
        }
        String sharpPattern = sharpPatternSb.toString();

        StringBuilder dotEndSharpPatternSb = new StringBuilder();
        for (int i = 0; i < m - 1; i++) {
            dotEndSharpPatternSb.append(".");
        }
        dotEndSharpPatternSb.append("#");
        String dotEndSharpPattern = dotEndSharpPatternSb.toString();

        StringBuilder dotStartSharpPatternSb = new StringBuilder();
        dotStartSharpPatternSb.append("#");
        for (int i = 1; i < m; i++) {
            dotStartSharpPatternSb.append(".");
        }
        String dotStartSharpPattern = dotStartSharpPatternSb.toString();
        boolean fl = true; // end
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(sharpPattern);
            } else {
                if (fl) {
                    System.out.println(dotEndSharpPattern);
                    fl = false;
                } else {
                    System.out.println(dotStartSharpPattern);
                    fl = true;
                }
            }
        }

    }


}

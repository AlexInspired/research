package com.practice.hackerrank.warmup;

public class AddTwoLongNumbers {

    public static void main(String[] args) {
        AddTwoLongNumbers addTwoLongNumbers = new AddTwoLongNumbers();

        int mas1[] = new int[]{5, 4, 9};
        int mas2[] = new int[]{1, 2};

        addTwoLongNumbers.solve(mas1, mas2);
    }

    public String solve(int[] mas1, int[] mas2) throws IllegalArgumentException {

        if (mas1.length < mas2.length) {
            throw new IllegalArgumentException("Argument 1 is expected to be longer than 2.");
        }

        int res[] = new int[mas1.length + 1];

        for (int i = mas1.length - 1, j = mas2.length - 1, c = 0 ;i >= 0; i--, j--, c++) {
            int agr2 = 0;
            if (c <= mas2.length - 1) {
                agr2 = mas2[j];
            }
            res[i+1] = res[i+1] + mas1[i] + agr2;
            if(res[i+1] == 10){
                res[i]++;
                res[i + 1] = 0;
            }
            else if(res[i+1] > 10) {
                int mod10 = res[i + 1] % 10;
                if (mod10 > 0) {
                    res[i]++;
                    res[i + 1] = mod10;
                }
            }
        }

        return format(res);
    }

    private String format(int[] res) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            stringBuilder.append(res[i]);
        }
        return stringBuilder.toString();
    }
}

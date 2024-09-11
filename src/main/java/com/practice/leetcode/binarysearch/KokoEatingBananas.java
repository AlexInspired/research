package com.practice.leetcode.binarysearch;

import java.util.Arrays;

public class KokoEatingBananas {

//    1) Смотрим сколько часов можно потратить на 1 кучу (h / длину piles)
//    2) Выбираем максимальную кучу, делим колво бананов на на колво часов на кучу = получаем стартовое значение скорости поедания.
//    3) Пытаемся его улучшить - съесть медленнее. Binary search используем для поиска следующей скорости.

    public int minEatingSpeed(int[] piles, int h) {

        int minVelocity = 1;
        int maxTimePerPile = h / piles.length;
        int maxPile = Arrays.stream(piles).max().getAsInt();
        int maxVelocity = maxPile / maxTimePerPile;
        if(maxVelocity == 0 && piles.length == 1){
            return 1;
        }
        if (maxPile % maxTimePerPile != 0) {
            maxVelocity++;
        }

        int mid = 0;
        int lastProperVelocity = maxVelocity;
        while (minVelocity <= maxVelocity) {
            mid = minVelocity + (maxVelocity - minVelocity) / 2;
            if (velocityIsValid(mid, piles, h)) {
                // пытаемся найти лучше(с меньшей скоростью поедания)
                lastProperVelocity = mid;
                maxVelocity = mid - 1;
            } else {
                minVelocity = mid + 1;
            }
        }

        return lastProperVelocity;
    }

    private boolean velocityIsValid(int midVelocity, int[] piles, int h) {
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
            time = time + piles[i] / midVelocity;
            if (piles[i] % midVelocity != 0) {
                time++;
            }
        }
        // защита от переполнения int
        if (time < 0) {
            return false;
        }
        return time <= h;
    }
}

package com.practice.leetcode.slidingwindow;

import com.practice.leetcode.Pair.Pair;

import java.util.LinkedHashMap;
import java.util.Map;

public class ContainsDuplicate2 {


    // 1,2,3,1,3,1,1,3 k = 2
    // Делаем мапу <цифра> = пара  пару<частота, индекс>.
    // Берем очередную цифру - если она уже встречалась - проверяем по условию к.
    // Увеличиваем частоту встречи.
    // Если длинна окна больше k, сокращаем окно, уменьшая частоту встречи цифры которую отбрасываем

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int l = 0, r = 1;
        Map<Integer, Pair<Integer, Integer>> indexAndFreqByValue = new LinkedHashMap<>();
        indexAndFreqByValue.put(nums[0], new Pair(1, 0));

        while (r < nums.length) {

            int digit = nums[r];
            if (indexAndFreqByValue.containsKey(digit)) {
                if (r - indexAndFreqByValue.get(digit).getRight() <= k) {
                    return true;
                }
                int prevFreq = indexAndFreqByValue.get(digit).getLeft();
                prevFreq++;
                indexAndFreqByValue.put(digit, new Pair(prevFreq, r));
            } else {
                indexAndFreqByValue.put(digit, new Pair(1, r));
            }

            while (r - l > k) {
                int prevFreq = indexAndFreqByValue.get(digit).getLeft();
                prevFreq--;
                if (prevFreq == 0) {
                    indexAndFreqByValue.remove(nums[l]);
                } else {
                    indexAndFreqByValue.put(digit, new Pair(prevFreq, r));
                }
                l++;
            }
            r++;
        }

        return false;
    }
}

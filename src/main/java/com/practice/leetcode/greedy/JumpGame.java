package com.practice.leetcode.greedy;

public class JumpGame {
    //  Greedy O(N)
    //  Идем слева направо. Goal выставляем на конец массива.
    //  Если можем добраться с соседнего левого до goal, то двигаем goal влево.
    //  Если goal доехал до 0, то true, иначе false.
    //  2,3,1,1,4
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        int goal = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= (goal - i)) {
                goal = i;
            }
        }
        return goal == 0;
    }
}

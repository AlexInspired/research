package com.practice.leetcode.slidingwindow;

import java.util.PriorityQueue;

public class JumpGame6 {
    public int maxResult(int[] nums, int k) {
/*  For every index starting from  1 to n
        Find out the max sum from all {i-1} to {i-k}  index
        sum[index] = value[index] + maxfound
    Result is sum[length -1]
*/

        int n = nums.length;
        int max = nums[0];
//      ind, maxSum
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        priorityQueue.offer(new int[]{0, nums[0]});

        for(int i = 1 ;i< n;i++){
            while (i - priorityQueue.peek()[0] > k){
                priorityQueue.poll();
            }
            int[] top = priorityQueue.peek();
            max = nums[i] + top[1];
            priorityQueue.offer(new int[]{i, max});
        }
        return max;
    }
}

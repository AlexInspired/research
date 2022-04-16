package com.practice.leetcode.warmup;


import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;

//Given infinite stream of integers. Using only JDK library implement
//class which would process those integers and at any moment will be able
//        to provide at most N unique biggest values among all processed. Class interface:
//        1. N is class constructor argument, immutable.
//        2. void push(int val) - process integers one-by-one.
//        3. Collection<Integer> top().
public class LXSolution<T extends Comparable> {
    TreeSet<T> treeSet;
    Integer N;
    CountDownLatch countDownLatch;

    public LXSolution(Integer n) {
        N = n;
        treeSet = new TreeSet<T>();
        countDownLatch = new CountDownLatch(N);
    }

    // 1 2 4 5
    public void push(T val) {
        countDownLatch.countDown();
        if (treeSet.size() >= N) {
            if (treeSet.first().compareTo(val) < 0) {
                treeSet.add(val);
            }
        } else {
            treeSet.add(val);
        }
    }

    // 1 2 4 5
    public Collection<T> top() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new ArrayList<>(treeSet);
    }
}

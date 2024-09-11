package com.practice.leetcode.Pair;


public class Pair<T, T1> {

    public Pair(){};
    public Pair(T left, T1 right){
        this.left = left;
        this.right = right;
    }
    private T left;
    private T1 right;

    public T getLeft() {
        return left;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public T1 getRight() {
        return right;
    }

    public void setRight(T1 right) {
        this.right = right;
    }
}

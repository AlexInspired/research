package com.practice.leetcode.trees;

import java.util.List;

public class UniqueBinarySearchTrees {

    int count = 0;

    public int numTrees(int n) {
        countTrees(List.of(1, 2, 3));
        return count;
    }

    public void countTrees(List list) {
        if (list == null) return;
        if (list.size() == 1) {
            count++;
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            countTrees(prepareLeftSublist(list, i));
            countTrees(prepareRightSublist(list, i));
        }
    }

    private List prepareLeftSublist(List original, int parentPos) {
        if (parentPos == 0) {
            return null;
        }
        return original.subList(0, parentPos);
    }

    private List prepareRightSublist(List original, int parentPos) {
        if (parentPos == original.size() - 1) {
            return null;
        }
        return original.subList(parentPos + 1, original.size());
    }
}

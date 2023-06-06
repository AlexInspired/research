package com.practice.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

//leetcode 1372
public class LongestZigZagPathInABinaryTree {
    int maxH = Integer.MIN_VALUE;
    public int longestZigZag(TreeNode root) {
        List<Character> bends = new ArrayList<>();
        traverse(root, bends, -1);
        return maxH;

    }

    void traverse(TreeNode node, List<Character> bends, int h) {
        if (node == null) {
            maxH = Math.max(maxH, h);
            return;
        }
        h++;
        if (notZigZag(bends)) {
            h = 1;
        }

        traverse(node.left, addLeftBend(bends), h);
        bends.remove(bends.size() - 1);
        traverse(node.right, addRightBend(bends), h);
        bends.remove(bends.size() - 1);
    }

    private boolean notZigZag(List<Character> bends) {
        if (bends.isEmpty() || bends.size() == 1) return false;
        Character prevBend = bends.get(bends.size() - 1);
        Character preprevBend = bends.get(bends.size() - 2);
        return prevBend.equals(preprevBend);
    }

    private List<Character> addLeftBend(List<Character> bends) {
        bends.add('L');
        return bends;
    }

    private List<Character> addRightBend(List<Character> bends) {
        bends.add('R');
        return bends;
    }
}

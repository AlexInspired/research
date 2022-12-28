package com.practice.leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//leetcode 101
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();

                if (curr == null) list.add(null);
                else {
                    list.add(curr.val);
                    q.offer(curr.left);
                    q.offer(curr.right);
                }
            }

            if (!checkSymmetry(list)) return false;
        }

        return true;
    }

    public boolean checkSymmetry(List<Integer> list) {
        int l = 0, r = list.size() - 1;

        while (l < r) {
            if (list.get(l++) != list.get(r--)) {
                return false;
            }
        }

        return true;
    }
}

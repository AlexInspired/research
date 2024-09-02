package com.practice.leetcode.trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
// 1. Обходим по уровням
// 2. Сохраняем узлы прошедшего уровня во вспомогательную очередь rowQueue
// 3. Если мы на листовом уровне, смотрим, чтобы после пустой ноды не было непустых нод
// 4. Если на промежуточном уровне, удаляем пустые ноды(которые сами вставили) - и проверяем, что уровень целиком заполнен
public class CheckCompletenessOfABinaryTree {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return false;

        TreeNode emtyNode = new TreeNode(Integer.MIN_VALUE);

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> rowQueue = new LinkedList<>();
        queue.add(root);
        boolean weAreAtLeafLevel = true;
        int h = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size > 0) {
                TreeNode currentNode = queue.poll();
                rowQueue.add(currentNode);
                if (currentNode.left != null || currentNode.right != null) {
                    weAreAtLeafLevel = false;
                }

                queue.add(Objects.requireNonNullElse(currentNode.left, emtyNode));
                queue.add(Objects.requireNonNullElse(currentNode.right, emtyNode));
                size--;
            }

            if (weAreAtLeafLevel) {
                boolean emptyNodeMet = false;
                while (!rowQueue.isEmpty()) {
                    TreeNode currentNode = rowQueue.poll();
                    if (currentNode.val == Integer.MIN_VALUE) {
                        emptyNodeMet = true;
                    }
                    if (currentNode.val != Integer.MIN_VALUE && emptyNodeMet) {
                        return false;
                    }
                }
                //  дальнейшая обработка в основном цикле не требуется
                return true;
            } else {
                List<TreeNode> filteredQueue = rowQueue.stream()
                        .filter(e -> e.val != Integer.MIN_VALUE).toList();

                if (filteredQueue.size() != ((int) Math.pow(2, h))) {
                    return false;
                }
                while (!rowQueue.isEmpty()) rowQueue.poll();
            }
            h++;
            weAreAtLeafLevel = true;
        }

        return true;
    }
}

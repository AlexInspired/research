package com.practice.leetcode.trees;


// 1) The longest path may or may not include the root node.
// 2) Take a global variable to store diameter of the tree.
// 3) for each node, find the max height of left and right subtree, and compare (leftHeight + rightHeight) with diameter. Populate diameter with the max value.

public class DiameterOfBinaryTree {

    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root.left == null && root.right == null){
            return 0;
        }
        findDiameter(root, 0);
        return diameter - 1;
    }

    int findDiameter(TreeNode root, int h){
        if(root == null){
            return h - 1;
        }

        int hl = getMaxHeight(root.left, h + 1);
        int hr = getMaxHeight(root.right, h + 1);

        diameter = Math.max( hl + hr, diameter);
        // здесь не надо h + 1, тк глубину надо считать от текущей вершины, она будет локальным началом.
        // все вершины выше мы уже посчитали
        findDiameter(root.left, h);
        findDiameter(root.right, h);
        return diameter;
    }

    private int getMaxHeight(TreeNode node, int h){
        if (node == null) {
            return  h - 1;
        }

        return Math.max(getMaxHeight(node.left, h + 1),
                getMaxHeight(node.right, h + 1));
    }

    //------------------------------------------------------------------------------------
    // Подход снизу вверх
//    public int diameterOfBinaryTree(TreeNode root) {
//
//        calculate(root);
//        return diameter;
//    }
//
//    int calculate(TreeNode root) {
//        if (root == null) return 0;
//
//        int left = calculate(root.left);
//        int right = calculate(root.right);
//
//        diameter = Math.max(diameter, left + right);
//
//        return Math.max(left, right) + 1;
//    }

}

package com.practice.leetcode.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class StepByStepDirectionsFromABinaryTreeNodeToAnotherTest {

    @Test
    public void test1() {
        // given
        TreeNode n6 = new TreeNode(4);
        TreeNode n5 = new TreeNode(6, null, null);
        TreeNode n4 = new TreeNode(2, n5, n6);
        TreeNode n3 = new TreeNode(3, null, null);
        TreeNode n2 = new TreeNode(1, n3, null);
        TreeNode givenTree = new TreeNode(5, n2, n4);

        StepByStepDirectionsFromABinaryTreeNodeToAnother stepByStepDirectionsFromABinaryTreeNodeToAnother
                = new StepByStepDirectionsFromABinaryTreeNodeToAnother();

        // when
        String result = stepByStepDirectionsFromABinaryTreeNodeToAnother.getDirections(givenTree, 3, 6);

        //then
        assertEquals("UURL", result);
    }
}
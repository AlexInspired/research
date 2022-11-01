package com.practice.leetcode.graphs;

import com.practice.leetcode.trees.PathSum3;
import com.practice.leetcode.trees.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindIfPathExistsInGraphTest {

    @Test
    public void test1() {
        // given
        FindIfPathExistsInGraph findIfPathExistsInGraph = new FindIfPathExistsInGraph();
        int n = 3;
        int[][] edges = new int[][]{
                {0,1},
                {1,2},
                {2,0}
        };
        int source = 0;
        int destination = 2;

        // when
        boolean result = findIfPathExistsInGraph.validPath(n, edges, source, destination);

        //then
        assertEquals(true, result);
    }
}
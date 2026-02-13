package com.practice.leetcode.dfs;

import java.util.*;
// 207 задача сводится к поиску цикла в графе - тремя цветами - изначально белый, серый(текущий анализ),
// черный - ранее пройденные узлы, не содержащие циклов.
public class CourseSchedule {

    Map<Integer, List<Integer>> graph = new HashMap<>();

    Set<Integer> greyList = new HashSet<>();
    Set<Integer> blackList = new HashSet<>();
    Boolean result = Boolean.FALSE;

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        initGraph(prerequisites);

        for(int node: graph.keySet()){
            if(!blackList.contains(node)){
                result = detectCycle(node, graph, greyList, blackList);
            }
            if (result) break;
        }

        return !result;

    }

    Boolean detectCycle(Integer node, Map<Integer, List<Integer>> graph, Set<Integer> greyList, Set<Integer> blackList){
        if(greyList.contains(node)){
            return true;
        }
        else if(!graph.containsKey(node) || graph.get(node).isEmpty() || blackList.contains(node)){
            blackList.add(node);
            return  false;
        }
        else {
            result = false;
            greyList.add(node);
            for(int neighbour : graph.get(node)){
                result = detectCycle(neighbour, graph, greyList, blackList);
                if(result) break;
            }
            greyList.remove(node);
            blackList.add(node);
            return result;
        }
    }

    void initGraph(int[][] prerequisites){

        for(int[] pair: prerequisites){
            if(!graph.containsKey(pair[1])){
                graph.put(pair[1], new ArrayList<>());
            }
            graph.get(pair[1]).add(pair[0]);
        }
    }
}

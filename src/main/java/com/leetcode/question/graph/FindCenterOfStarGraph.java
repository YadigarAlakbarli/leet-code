package com.leetcode.question.graph;

import java.util.HashMap;
import java.util.Map;

public class FindCenterOfStarGraph {

    public static void main(String[] args) {
        int[][] edges = {
                {1, 2},
                {2, 3},
                {2, 4},
                {2, 5}
        };
        int center = findCenter(edges);
        System.out.println("Center node: " + center);
    }


    public static int findCenter(int[][] edges) {
        Map<Integer, Integer> nodeCount = new HashMap<>();

        for (int[] edge : edges) {
            for (int node : edge) {
                nodeCount.put(node, nodeCount.getOrDefault(node, 0) + 1);
                if (nodeCount.get(node) == edges.length) {
                    return node;
                }
            }
        }
        return -1;
    }


}

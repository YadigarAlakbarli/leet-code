package com.leetcode.question.graph;

import java.util.*;

class BFS {
    public static void bfs(Graph graph, int startVertex) {
        boolean[] visited = new boolean[graph.V];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            LinkedList<Integer> adjList = graph.getAdjList(vertex);
            for (int neighbor : adjList) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}

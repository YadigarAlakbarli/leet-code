package com.leetcode.question.graph;

import java.util.LinkedList;

class DFS {
    public static void dfsTraversal(Graph graph, int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        LinkedList<Integer> adjList = graph.getAdjList(vertex);
        for (int neighbor : adjList) {
            if (!visited[neighbor]) {
                dfsTraversal(graph, neighbor, visited);
            }
        }
    }

    public static void dfs(Graph graph, int startVertex) {
        boolean[] visited = new boolean[graph.V];
        dfsTraversal(graph, startVertex, visited);
    }
}

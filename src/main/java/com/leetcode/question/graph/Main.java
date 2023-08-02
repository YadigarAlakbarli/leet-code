package com.leetcode.question.graph;

public class Main {
    public static void main(String[] args) {
        int V = 6; // Number of vertices

        Graph graph = new Graph(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        int startVertex = 0; // Starting vertex for DFS and BFS

        System.out.println("DFS Traversal:");
        DFS.dfs(graph, startVertex);

        System.out.println("\n\nBFS Traversal:");
        BFS.bfs(graph, startVertex);
    }
}

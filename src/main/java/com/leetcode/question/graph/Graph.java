package com.leetcode.question.graph;

import java.util.*;

class Graph {
    public int V; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list

    @SuppressWarnings("unchecked")
    public Graph(int V) {
        this.V = V;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
    }

    // Get the adjacency list for a vertex
    public LinkedList<Integer> getAdjList(int vertex) {
        return adjList[vertex];
    }
}

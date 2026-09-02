package dsa.graphs;
import java.util.*;
public class Graph {
    private int vertices;
    private List<List<Integer>> adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) adjList.add(new ArrayList<>());
    }

    public void addEdge(int u, int v)           { /* TODO */ }      // Problem 122
    public List<Integer> bfs(int start)         { return new ArrayList<>(); } // Problem 123
    public List<Integer> dfs(int start)         { return new ArrayList<>(); } // Problem 124
    public int countComponents()                { return 0; }        // Problem 125
    public boolean hasCycle()                   { return false; }    // Problem 126
}

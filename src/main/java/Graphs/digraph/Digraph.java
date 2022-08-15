package Graphs.digraph;

import java.util.HashSet;
import java.util.Set;

public class Digraph {

    public Digraph(int V) {
        if (V < 0) throw new IllegalArgumentException("Number of vertices must be non-negative");
        this.V = V;
        this.E = 0;
        adj = new HashSet[V];
        for (int v=0; v<V; v++) {
            adj[v] = new HashSet<>();
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    private final int V; //vertex
    private int E; //edge
    private final Set<Integer>[] adj;
}

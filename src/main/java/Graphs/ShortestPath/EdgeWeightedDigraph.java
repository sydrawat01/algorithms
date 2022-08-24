package Graphs.ShortestPath;

import ADT.API.Bag.Bag;

public class EdgeWeightedDigraph {
    public EdgeWeightedDigraph(int V) {
        this.V = V;
        adj = (Bag<DirectedEdge>[]) new Bag[V];

        for(int v=0; v<V; v++) {
            adj[v] = new Bag<>();
        }
    }

    public void addEdge(DirectedEdge e) {
        int v = e.from();
        adj[v].add(e);
    }

    public Iterable<DirectedEdge> adj(int v) {
        return adj[v];
    }

    public int V() {
        return V;
    }

    private final int V;
    private final Bag<DirectedEdge>[] adj;
}

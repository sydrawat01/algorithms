package Graphs;

import ADT.API.Queue.Queue;

public class BFSPaths {

    /**
     * Computes the vertices in graph {@code G} that are
     * connected to the source vertex {@code s}.
     * @param G the graph
     * @param s the source vertex
     * @throws IllegalArgumentException unless {@code 0 <= s < V}
     */
    public BFSPaths(Graph G, int s) {
        this.G = G;
        this.s = s;
        edgeTo = new int[G.V()];
        distTo = new int[G.V()];
        marked = new boolean[G.V()];
        validateVertex(s);
        bfs(G,s);
    }

    private void bfs(Graph G, int s) {
        Queue<Integer> q = new Queue<>();
        for (int v = 0; v < G.V(); v++)
            distTo[v] = INFINITY;
        distTo[s] = 0;
        marked[s] = true;
        q.enqueue(s);

        while (!q.isEmpty()) {
            int v = q.dequeue();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    edgeTo[w] = v;
                    distTo[w] = distTo[v] + 1;
                    marked[w] = true;
                    q.enqueue(w);
                }
            }
        }
    }

    // throw an IllegalArgumentException unless {@code 0 <= v < V}
    private void validateVertex(int v) {
        int V = marked.length;
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    }

    private static final int INFINITY = Integer.MAX_VALUE;
    private final int[] edgeTo; //edgeTo[v] = last edge on s-v path
    private final int[] distTo;      // distTo[v] = number of edges shortest s-v path
    private final boolean[] marked; // marked[v] = is there an s-v path?
    private final int s; // source vertex
    private final Graph G;
}

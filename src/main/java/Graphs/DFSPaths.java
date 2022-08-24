package Graphs;

import java.util.Stack;

public class DFSPaths {

    /**
     * Computes the vertices in graph {@code G} that are
     * connected to the source vertex {@code s}.
     * @param G the graph
     * @param s the source vertex
     * @throws IllegalArgumentException unless {@code 0 <= s < V}
     */
    public DFSPaths(Graph G, int s) {
        this.G = G;
        this.s = s;
        edgeTo = new int[G.V()];
        marked = new boolean[G.V()];
        validateVertex(s);
        dfs(G,s);
    }

    /**
     * Is there a path between the source vertex {@code s} and vertex {@code v}?
     * @param v the vertex
     * @return {@code true} if there is a path, {@code false} otherwise
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public boolean visited(int v) {
        validateVertex(v);
        return marked[v];
    }

    /**
     * Is there a path between the source vertex {@code s} and vertex {@code v}?
     * @param v the vertex
     * @return {@code true} if there is a path, {@code false} otherwise
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public boolean hasPathTo(int v) {
        validateVertex(v);
        return marked[v];
    }

    // depth first search from v
    private void dfs(Graph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!visited(w)) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }

    public Iterable<Integer> pathTo(int v) {
        validateVertex(v);
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[x])
            path.push(x);
        path.push(s);
        return path;
    }

    // throw an IllegalArgumentException unless {@code 0 <= v < V}
    private void validateVertex(int v) {
        int V = marked.length;
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int v = 0; v < G.V(); v++) {
            if (hasPathTo(v)) {
//                System.out.print(s + " to " + v);
                sb.append(s).append(" to ").append(v);
                for (int x : pathTo(v)) {
                    if (x == s)
//                        System.out.print(x);
                        sb.append(x);
                    else
//                        System.out.print("->" + x);
                    sb.append("->").append(x);
                }
//                System.out.println();
                sb.append("\n");
            } else {
//                System.out.println(s + " to " + v + ":  not connected\n");
                sb.append(s).append(" to ").append(v).append(" not connected\n");
            }
        }
        return sb.toString();
    }

    private final int[] edgeTo; //edgeTo[v] = last edge on s-v path
    private final boolean[] marked; // marked[v] = is there an s-v path?
    private final int s; // source vertex
    private final Graph G;
}

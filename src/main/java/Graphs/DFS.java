package Graphs;

public class DFS {
    public DFS(Graph G, int s) {
        marked = new boolean[G.V()];
        dfs(G,s);
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        for (int w: G.adj(v))
            if(!marked[w])
                dfs(G,w);
    }

    public boolean visited(int v) {
        return marked[v];
    }
    private final boolean[] marked;
}

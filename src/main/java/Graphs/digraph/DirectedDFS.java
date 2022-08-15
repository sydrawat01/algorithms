package Graphs.digraph;

public class DirectedDFS {

    public DirectedDFS(Digraph G, int s) {
        marked = new boolean[G.V()];
        dfs(G,s);
    }

    public boolean visited(int v) {
        return marked[v];
    }

    private void dfs(Digraph G, int v) {
        marked[v] = true;
        for(int w: G.adj(v)) {
            if(!visited(w))
                dfs(G,w);
        }
    }
    private final boolean[] marked;
}

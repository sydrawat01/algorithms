package Graphs.digraph;

import ADT.API.Queue.Queue;

import java.util.Stack;

public class DFSOrder {
    public DFSOrder(Digraph G) {
        marked = new boolean[G.V()];
        reversePostOrder = new Stack<>();
        postOrder = new Queue<>();
        for (int v=0; v< G.V(); v++)
            if (!marked[v])
                dfs(G,v);
    }

    private void dfs(Digraph G, int v) {
        marked[v] = true;
        for(int w: G.adj(v))
            if (!marked[w])
                dfs(G,w);
        reversePostOrder.push(v);
        postOrder.enqueue(v);
    }

    public Iterable<Integer> reversePostOrder() {
        return reversePostOrder;
    }

    public Iterable<Integer> postOrder() { return postOrder; }

    private final boolean[] marked;
    private final Stack<Integer> reversePostOrder;
    private final Queue<Integer> postOrder;
}

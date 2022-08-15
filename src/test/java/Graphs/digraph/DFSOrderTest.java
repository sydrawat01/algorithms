package Graphs.digraph;

import org.junit.Test;

public class DFSOrderTest {
    @Test
    public void DFSReverseOrderTest() {
        int V = 7;
        Digraph digraph = new Digraph(V);
        digraph.addEdge(0,1);
        digraph.addEdge(0,2);
        digraph.addEdge(0,5);
        digraph.addEdge(1,4);
        digraph.addEdge(3,2);
        digraph.addEdge(3,4);
        digraph.addEdge(3,5);
        digraph.addEdge(3,6);
        digraph.addEdge(5,2);
        digraph.addEdge(6,0);
        digraph.addEdge(6,4);

        DFSOrder order = new DFSOrder(digraph);
        System.out.println(DFSOrderString(order));

    }

    private String DFSOrderString(DFSOrder reverseOrder) {
        StringBuilder sb = new StringBuilder();
        for(int v : reverseOrder.reversePostOrder()) {
            sb.insert(0, v + " -> ");
        }

        sb.delete(sb.length() - 4, sb.length());

        return sb.toString();
    }
}

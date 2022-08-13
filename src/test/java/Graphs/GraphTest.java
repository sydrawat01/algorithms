package Graphs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraphTest {
    @Test
    public void testGraph1() {
        int V = 7;
        GraphAPI G = new Graph(V);
        G.addEdge(0,6);
        G.addEdge(0,1);
        G.addEdge(0,2);
        G.addEdge(0,5);
        G.addEdge(3,5);
        G.addEdge(3,4);
        G.addEdge(4,5);
        G.addEdge(4,6);
        assertEquals(G.degree(4), 3);
        assertEquals(G.degree(0), 4);
    }
}

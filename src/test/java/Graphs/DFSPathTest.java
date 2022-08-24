package Graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class DFSPathTest {

    @Test
    public void testDFS1() {
        int V = 9;
        Graph G = new Graph(V);
        G.addEdge(0,6);
        G.addEdge(0,1);
        G.addEdge(0,2);
        G.addEdge(0,5);
        G.addEdge(1,0);
        G.addEdge(2,0);
        G.addEdge(3,5);
        G.addEdge(3,4);
        G.addEdge(4,5);
        G.addEdge(4,6);
        G.addEdge(4,3);
        G.addEdge(5,3);
        G.addEdge(5,4);
        G.addEdge(5,0);
        G.addEdge(6,0);
        G.addEdge(6,4);
        G.addEdge(7,8);
        G.addEdge(8,7);
        System.out.println("Degree of vertex 0: " + G.degree(0));
        DFSPaths search = new DFSPaths(G, 0);
    }

    @Test
    public void testDFS2() {
        int V = 7;
        Graph G = new Graph(V);
        G.addEdge(0,6);
        G.addEdge(0,1);
        G.addEdge(0,2);
        G.addEdge(0,5);
        G.addEdge(1,0);
        G.addEdge(2,0);
        G.addEdge(3,5);
        G.addEdge(3,4);
        G.addEdge(4,5);
        G.addEdge(4,6);
        G.addEdge(4,3);
        G.addEdge(5,3);
        G.addEdge(5,4);
        G.addEdge(5,0);
        G.addEdge(6,0);
        G.addEdge(6,4);

        DFSPaths search = new DFSPaths(G, 0);
        System.out.println(search.toString());
    }
}

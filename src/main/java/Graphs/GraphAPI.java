package Graphs;

public interface GraphAPI {

    /**
     * Add an edge between vertices v & w
     * @param v vertex v
     * @param w vertex w
     */
    void addEdge(int v, int w);

    /**
     * Vertices adjacent to v
     * @param v the vertex
     * @return all the vertices adjacent to vertex v
     */
    Iterable<Integer> adj(int v);

    /**
     * Number of vertices
     * @return the number of vertices in the Graph
     */
    int V();

    /**
     * Number of edges
     * @return the number of edges in the graph
     */
    int E();

    /**
     * The degree of a vertex
     * @param v the vertex whose degree we require
     * @return the degree of vertex v
     */
    int degree(int v);
}

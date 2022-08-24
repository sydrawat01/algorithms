package Graphs.ShortestPath;

public class DirectedEdge implements DirectedEdgeAPI{

    public DirectedEdge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public int from() {
        return v;
    }

    public int to() {
        return w;
    }

    public double weight() {
        return weight;

    }    private final int v;
    private final int w;
    private final double weight;
}

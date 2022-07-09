package ADT.UnionFind;

import java.util.ArrayList;

public class QuickUnionUF {
    public QuickUnionUF(int n) {
        count = n;
        parent = new int[n];
        for(int i=0; i<n; i++) {
            parent[i] = i;
        }
    }

    public int find(int p) {
        validate(p);
        while (p != parent[p])
            p = parent[p];
        return p;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if(connected(rootP, rootQ))
            return;
        parent[rootP] = rootQ;
        count--;
    }

    public int getCount() { return count; }

    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();
        for( int i : parent) {
            list.add(i);
        }
        return list.toString();
    }

    private void validate(int p) {
        int n = parent.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
        }
    }
    private final int[] parent;
    private int count;
}

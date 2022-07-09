package ADT.UnionFind;

import java.util.ArrayList;

public class WeightedQuickUnionPCUF {
    public WeightedQuickUnionPCUF(int n) {
        count = n;
        parent = new int[n];
        size = new int[n];
        for(int i=0; i<n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int p) {
        //FIXME
        validate(p);
        while(p != parent[p]) {
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    public boolean connected(int p, int q) { return find(p) == find(q); }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (connected(rootP, rootQ))
            return;
        if(size[rootP] < size[rootQ]) {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        } else {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
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
    private final int[] size;
    private int count;
}

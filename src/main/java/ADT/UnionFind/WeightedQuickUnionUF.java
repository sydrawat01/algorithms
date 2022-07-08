package ADT.UnionFind;

public class WeightedQuickUnionUF {
    public WeightedQuickUnionUF(int n) {
        count = n;
        parent = new int[n];
        size = new int[n];
        for(int i=0; i<n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int p) {
        validate(p);
        while(p != parent[p])
            p = parent[p];
        return p;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

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

    private void validate(int p) {
        int n = parent.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
        }
    }
    private static int[] parent;
    private static int[] size;
    private int count;

    public static void main(String[] args) {
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(10);
        System.out.println("Union (2,9)");
        uf.union(2, 9);
        System.out.println("Union (3,4)");
        uf.union(3, 4);
        System.out.println("Union (4,9)");
        uf.union(4, 9);
        System.out.println("Union (5,6)");
        uf.union(5, 6);
        System.out.println("Union (3,5)");
        uf.union(3, 5);
        for( int i : parent) {
            System.out.print(i + " ");
        }
        System.out.println("\nNumber of connections: " + uf.getCount());
    }
}

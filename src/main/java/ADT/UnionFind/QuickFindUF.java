package ADT.UnionFind;

import java.util.ArrayList;

public class QuickFindUF {
    public QuickFindUF(int n) {
        count = n;
        id = new int[n];
        for(int i=0; i<n; i++)
            id[i] = i;
    }

    public int find(int p) {
        validate(p);
        return id[p];
    }

    public boolean connected(int p ,int q) {
        validate(p);
        validate(q);
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        validate(p);
        validate(q);
        int pID = id[p];
        int qID = id[q];

        if (connected(p,q)) return;

        for(int i=0; i< id.length; i++) {
            if(id[i] == pID) {
                id[i] = qID;
            }
        }
        count--;
    }

    public int getCount() { return count; }

    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();
        for( int i : id) {
            list.add(i);
        }
        return list.toString();
    }

    /**
     * Validate that 'p' is a valid index
     * @param p the index to be found
     */
    private void validate(int p) {
        int n = id.length;
        if (p< 0 || p>= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
        }
    }
    private static int[] id;
    private static int count;
}

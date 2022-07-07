package ADT.UnionFind;

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

    public int count() { return count; }

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


    public static void main(String[] args) {
        QuickFindUF uf = new QuickFindUF(10);
        System.out.println("Union (5,6)");
        uf.union(5, 6);
        System.out.println("Union (5,0)");
        uf.union(5, 0);
        System.out.println("Union (7,2)");
        uf.union(7, 2);
        System.out.println("Union (2,1)");
        uf.union(2, 1);
        System.out.println("Union (3,4)");
        uf.union(3, 4);
        System.out.println("Union (4,9)");
        uf.union(4, 9);
        System.out.println("Union (3,8)");
        uf.union(3, 8);
        System.out.println("Union (6,1)");
        uf.union(6,1);
        for( int i : id) {
            System.out.print(i + " ");
        }
        System.out.println("\nNumber of connections: " + count);
    }
}

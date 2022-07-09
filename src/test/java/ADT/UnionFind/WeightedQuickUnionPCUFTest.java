package ADT.UnionFind;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeightedQuickUnionPCUFTest {
    @Test
    public void WQUPCUFTest() {
        WeightedQuickUnionPCUF uf = new WeightedQuickUnionPCUF(10);
        uf.union(2, 9);
        uf.union(3, 4);
        uf.union(4, 9);
        uf.union(5, 6);
        uf.union(3, 5);
        assertEquals(uf.getCount(), 5);
        assertEquals(uf.toString(), "[0, 1, 3, 3, 3, 3, 5, 7, 8, 2]");
    }
}

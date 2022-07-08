package ADT.UnionFind;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuickUnionUFTest {
    @Test
    public void QUTest() {
        QuickUnionUF uf = new QuickUnionUF(10);
        uf.union(2, 9);
        uf.union(3, 4);
        uf.union(4, 9);
        uf.union(5, 6);
        uf.union(3, 5);
        assertEquals(uf.getCount(), 5);
        assertEquals(uf.toString(), "[0, 1, 9, 4, 9, 6, 6, 7, 8, 6]");
    }
}

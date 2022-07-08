package ADT.UnionFind;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuickFindUFTest {
    @Test
    public void QFTest() {
        QuickFindUF uf = new QuickFindUF(10);
        uf.union(5, 6);
        uf.union(5, 0);
        uf.union(7, 2);
        uf.union(2, 1);
        uf.union(3, 4);
        uf.union(4, 9);
        uf.union(3, 8);
        uf.union(6,1);
        assertEquals(uf.getCount(), 2);
        assertEquals(uf.toString(), "[1, 1, 1, 8, 8, 1, 1, 1, 8, 8]");
    }
}

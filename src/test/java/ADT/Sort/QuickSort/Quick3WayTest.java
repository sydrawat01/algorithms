package ADT.Sort.QuickSort;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import util.Helper;
import util.Supplier;

public class Quick3WayTest {
    @Test
    public void TestCase1() {
        Quick3Way<Integer> ob = new Quick3Way<>();
        Helper<Integer> helper = new Helper<>();
        int seed = 10;
        Supplier<Integer> xs = new Supplier<>(seed);
        Integer[] a = xs.supply();
        assertTrue(helper.sorted(ob.sort(a,0, a.length-1)));
    }
}

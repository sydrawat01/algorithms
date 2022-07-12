package ADT.Sort.InsertionSort;

import org.junit.Test;
import util.Helper;
import util.Supplier;

import static org.junit.Assert.assertTrue;

public class InsertionSortTest {
    @Test
    public void TestCase1() {
        InsertionSort<Integer> ob = new InsertionSort<>();
        Helper<Integer> helper = new Helper<>();
        Supplier<Integer> xs = new Supplier<>(10);
        assertTrue(helper.sorted(ob.sort(xs.supply(), 0, 10)));
    }
}

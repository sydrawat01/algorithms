package ADT.Sort.QuickSort;

import org.junit.Test;
import util.Helper;
import util.Supplier;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class QuickSortTest {
    @Test
    public void TestCase1() {
        QuickSort<Integer> ob = new QuickSort<>();
        Helper<Integer> helper = new Helper<>();
        Supplier<Integer> xs = new Supplier<>(10);
        assertTrue(helper.sorted(ob.sort(xs.supply(), 0, 9)));
    }
}

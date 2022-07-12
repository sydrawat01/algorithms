package ADT.Sort.BubbleSort;

import org.junit.Test;
import util.Helper;
import util.Supplier;

import static org.junit.Assert.assertTrue;

public class BubbleSortTest {
    @Test
    public void TestCase1() {
        BubbleSort<Integer> ob = new BubbleSort<>();
        Helper<Integer> helper = new Helper<>();
        Supplier<Integer> xs = new Supplier<>(10);
        assertTrue(helper.sorted(ob.sort(xs.supply())));
    }
}

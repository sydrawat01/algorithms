package ADT.Sort.SelectionSort;

import org.junit.Test;
import util.Helper;
import util.Supplier;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class SelectionSortTest {
    @Test
    public void TestCase1() {
        SelectionSort<Integer> ob = new SelectionSort<>();
        Helper<Integer> helper = new Helper<>();
        Supplier<Integer> xs = new Supplier<>(10);
        System.out.println(Arrays.toString(ob.sort(xs.supply())));
        assertTrue(helper.sorted(ob.sort(xs.supply())));
    }
}

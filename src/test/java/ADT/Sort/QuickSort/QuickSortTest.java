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
        Supplier<Integer> xs = new Supplier<>(1000);
        assertTrue(helper.sorted(ob.sort(xs.supply())));
        System.out.println("\n"+Arrays.toString(ob.sort(xs.supply())));
    }

    @Test
    public void TestCase2() {
        QuickSort<Integer> ob = new QuickSort<>();
        Helper<Integer> helper = new Helper<>();
        Supplier<Integer> xs = new Supplier<>(5);
        assertTrue(helper.sorted(ob.sort(xs.supply())));
        System.out.println(Arrays.toString(ob.sort(xs.supply())));
    }
}

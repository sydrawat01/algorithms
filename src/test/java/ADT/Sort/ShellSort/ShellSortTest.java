package ADT.Sort.ShellSort;

import org.junit.Test;
import util.Helper;
import util.Supplier;

import static org.junit.Assert.assertTrue;

public class ShellSortTest {
    @Test
    public void TestCase1() {
        ShellSort<Integer> ob = new ShellSort<>();
        Helper<Integer> helper = new Helper<>();
        Supplier<Integer> xs = new Supplier<>(10);
        assertTrue(helper.sorted(ob.sort(xs.supply())));
    }
}

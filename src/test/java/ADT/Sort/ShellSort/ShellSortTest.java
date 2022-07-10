package ADT.Sort.ShellSort;

import org.junit.Test;
import util.Helper;

import static org.junit.Assert.assertTrue;

public class ShellSortTest {
    @Test
    public void TestCase1() {
        ShellSort<Integer> ob = new ShellSort<>();
        Helper<Integer> helper = new Helper<>();
        Integer[] arr = { 12, 11, 13, 5, 6 };
        assertTrue(helper.sorted(ob.sort(arr)));
    }
}

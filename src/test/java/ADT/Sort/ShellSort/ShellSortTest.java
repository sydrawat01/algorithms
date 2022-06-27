package ADT.Sort.ShellSort;

import org.junit.Test;
import util.Helper;

import static org.junit.Assert.assertTrue;

public class ShellSortTest {
    @Test
    public void TestCase1() {
        ShellSort ob = new ShellSort();
        Helper helper = new Helper();
        int[] arr = { 12, 11, 13, 5, 6 };
        assertTrue(helper.sorted(ob.sort(arr)));
    }
}

package ADT.Sort.SelectionSort;

import org.junit.Test;
import util.Helper;

import static org.junit.Assert.assertTrue;

public class SelectionSortTest {
    @Test
    public void TestCase1() {
        SelectionSort ob = new SelectionSort();
        Helper helper = new Helper();
        int[] arr = { 12, 11, 13, 5, 6 };
        assertTrue(helper.sorted(ob.sort(arr)));
    }
}

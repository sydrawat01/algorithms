package ADT.Sort.InsertionSort;

import org.junit.Test;
import util.Helper;

import static org.junit.Assert.assertTrue;

public class InsertionSortTest {
    @Test
    public void TestCase1() {
        InsertionSort ob = new InsertionSort();
        Helper helper = new Helper();
        int[] arr = { 12, 11, 13, 5, 6 };
        assertTrue(helper.sorted(ob.sort(arr, 0, arr.length)));
    }
}

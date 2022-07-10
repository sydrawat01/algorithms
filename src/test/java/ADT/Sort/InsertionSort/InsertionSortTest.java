package ADT.Sort.InsertionSort;

import org.junit.Test;
import util.Helper;

import static org.junit.Assert.assertTrue;

public class InsertionSortTest {
    @Test
    public void TestCase1() {
        InsertionSort<Integer> ob = new InsertionSort<>();
        Helper<Integer> helper = new Helper<>();
        Integer[] arr = { 12, 11, 13, 5, 6 };
        assertTrue(helper.sorted(ob.sort(arr, 0, arr.length)));
    }
}

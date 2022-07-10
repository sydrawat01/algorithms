package ADT.Sort.QuickSort;

import org.junit.Test;
import util.Helper;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class QuickSortTest {
    @Test
    public void TestCase1() {
        QuickSort<Integer> ob = new QuickSort<>();
        Helper<Integer> helper = new Helper<>();
        Integer[] arr = {12, 11, 13, 5, 6};
        assertTrue(helper.sorted(ob.sort(arr, 0, arr.length-1)));
    }
}

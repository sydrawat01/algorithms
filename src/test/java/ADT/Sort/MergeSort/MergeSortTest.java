package ADT.Sort.MergeSort;

import org.junit.Test;
import util.Helper;

import static org.junit.Assert.assertTrue;

public class MergeSortTest {
    @Test
    public void TestCase1() {
        MergeSort ob = new MergeSort();
        Helper<Integer> helper = new Helper<>();
        int[] arr = { 12, 11, 13, 5, 6 };
        //FIXME: Generic <T> implementation pending
//        assertTrue(helper.sorted(ob.sort(arr, 0, arr.length-1)));
    }
}

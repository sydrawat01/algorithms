package ADT.Sort.SelectionSort;

import org.junit.Test;
import util.Helper;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class SelectionSortTest {
    @Test
    public void TestCase1() {
        SelectionSort<Integer> ob = new SelectionSort<>();
        Helper<Integer> helper = new Helper<>();
        Integer[] arr = new Integer[]{ 12, 11, 13, 5, 6 };
        System.out.println(Arrays.toString(ob.sort(arr)));
        assertTrue(helper.sorted(ob.sort(arr)));
    }
}

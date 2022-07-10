package ADT.Sort.BubbleSort;

import org.junit.Test;
import util.Helper;

import static org.junit.Assert.assertTrue;

public class BubbleSortTest {
    @Test
    public void TestCase1() {
        BubbleSort<Integer> ob = new BubbleSort<>();
        Helper<Integer> helper = new Helper<>();
        Integer[] arr = new Integer[]{12, 11, 13, 5, 6};
        assertTrue(helper.sorted(ob.sort(arr)));
    }
}

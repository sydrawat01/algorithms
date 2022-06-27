package ADT.Sort.BubbleSort;

import org.junit.Test;
import util.Helper;

import static org.junit.Assert.assertTrue;

public class BubbleSortTest {
    @Test
    public void TestCase1() {
        BubbleSort ob = new BubbleSort();
        Helper helper = new Helper();
        int[] arr = { 12, 11, 13, 5, 6 };
        assertTrue(helper.sorted(ob.sort(arr)));
    }
}

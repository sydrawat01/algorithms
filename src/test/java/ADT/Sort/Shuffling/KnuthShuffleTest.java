package ADT.Sort.Shuffling;

import org.junit.Test;
import util.Helper;
import util.Supplier;

import static org.junit.Assert.assertFalse;

public class KnuthShuffleTest {
    @Test
    public void TestCase1() {
        Supplier<Integer> xs = new Supplier<>(10);
        Helper<Integer> helper = new Helper<>();
        assertFalse(helper.sorted(xs.supply()));
    }
}

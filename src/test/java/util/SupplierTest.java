package util;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;

public class SupplierTest {
    @Test
    public void TestCase1() {
        Supplier<Integer> xs = new Supplier<>(10);
        Helper<Integer> helper = new Helper<>();
        assertFalse(helper.sorted(xs.supply()));
    }
    @Test
    public void TestCase2() {
        Supplier<Integer> xs = new Supplier<>(100);
        Helper<Integer> helper = new Helper<>();
        System.out.println(Arrays.toString(xs.supply()));
        assertFalse(helper.sorted(xs.supply()));
    }

    @Test
    public void TestCase3() {
        Supplier<Integer> xs = new Supplier<>(1000000);
        Helper<Integer> helper = new Helper<>();
        assertFalse(helper.sorted(xs.supply()));
    }

    @Test
    public void TestCase4() {
        Supplier<Integer> xs = new Supplier<>(100000000);
        Helper<Integer> helper = new Helper<>();
        assertFalse(helper.sorted(xs.supply()));
    }
}

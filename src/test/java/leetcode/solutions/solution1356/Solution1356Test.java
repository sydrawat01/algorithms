package leetcode.solutions.solution1356;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Solution1356Test {
    @Test
    public void test1() {
        Solution1356 ob = new Solution1356();
        int[] arr = {5,2,3,9,6,7,15,32};
        int[] actual = ob.sortByBits(arr);
        int[] expected = {2,32,3,5,6,9,7,15};
        assertEquals(Arrays.toString(expected),Arrays.toString(actual));
    }

    @Test
    public void test2() {
        Solution1356 ob = new Solution1356();
        int[] arr = {15,31,7,3,2};
        int[] actual = ob.sortByBits(arr);
        int[] expected = {2,3,7,15,31};
        assertEquals(Arrays.toString(expected),Arrays.toString(actual));
    }

    @Test
    public void testBig() {
        Solution1356 ob = new Solution1356();
        int[] arr = {1500000,3000001,7000999,37778877,278645456};
        int[] actual = ob.sortByBits(arr);
        int[] expected = {1500000, 3000001, 37778877, 278645456, 7000999};
        assertEquals(Arrays.toString(expected),Arrays.toString(actual));
    }
}

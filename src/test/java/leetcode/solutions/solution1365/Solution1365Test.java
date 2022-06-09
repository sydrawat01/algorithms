package leetcode.solutions.solution1365;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Solution1365Test {
    @Test
    public void TestCase1() {
        int[] nums = {8, 1, 2, 2, 3};
        Solution1365 ob = new Solution1365();
        int[] res = {4, 0, 1, 1, 3};
        assertArrayEquals(res, ob.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void TestCase2() {
        int[] nums = {7, 7, 7, 7};
        Solution1365 ob = new Solution1365();
        int[] res = {0, 0, 0, 0};
        assertArrayEquals(res, ob.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void TestCase3() {
        int[] nums = {6, 5, 4, 8};
        Solution1365 ob = new Solution1365();
        int[] res = {2, 1, 0, 3};
        assertArrayEquals(res, ob.smallerNumbersThanCurrent(nums));
    }
}

package leetcode.solutions.solution35;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Solution35Test {
    @Test
    public void TestCase1() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        Solution35 ob = new Solution35();
        assertEquals(2, ob.searchInsert(nums, target));
    }

    @Test
    public void TestCase2() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 2;
        Solution35 ob = new Solution35();
        assertEquals(1, ob.searchInsert(nums, target));
    }

    @Test
    public void TestCase3() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 7;
        Solution35 ob = new Solution35();
        assertEquals(4, ob.searchInsert(nums, target));
    }
}

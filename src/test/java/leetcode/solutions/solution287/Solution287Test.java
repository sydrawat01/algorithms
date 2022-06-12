package leetcode.solutions.solution287;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Solution287Test {
    @Test
    public void TestCase1() {
        int[] nums = {1, 3, 4, 2, 2};
        Solution287 ob = new Solution287();
        assertEquals(2, ob.findDuplicate(nums));
    }

    @Test
    public void TestCase2() {
        int[] nums = {3, 1, 3, 4, 2};
        Solution287 ob = new Solution287();
        assertEquals(3, ob.findDuplicate(nums));
    }

    @Test
    public void TestCase3() {
        int[] nums = {1, 2, 3, 3, 4, 4, 6};
        Solution287 ob = new Solution287();
        assertEquals(3, ob.findDuplicate(nums));
    }
}

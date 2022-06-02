package leetcode.solutions.solution1342;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Solution1342Test {
    @Test
    public void TestCase1() {
        int num = 14;
        Solution1342 ob1342 = new Solution1342();
        int res = ob1342.numberOfSteps(num);
        assertEquals(6, res);
    }

    @Test
    public void TestCase2() {
        int num = 8;
        Solution1342 ob1342 = new Solution1342();
        int res = ob1342.numberOfSteps(num);
        assertEquals(4, res);
    }

    @Test
    public void TestCase3() {
        int num = 123;
        Solution1342 ob1342 = new Solution1342();
        int res = ob1342.numberOfSteps(num);
        assertEquals(12, res);
    }
}

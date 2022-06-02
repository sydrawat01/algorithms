package leetcode.solutions.solution9;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Solution9Test {
    @Test
    public void TestCase1() {
        int num = 121;
        Solution9 ob9 = new Solution9();
        boolean res = ob9.isPalindrome(num);
        assertTrue(res);
    }
    @Test
    public void TestCase2() {
        int num = -121;
        Solution9 ob9 = new Solution9();
        boolean res = ob9.isPalindrome(num);
        assertFalse(res);
    }
    @Test
    public void TestCase3() {
        int num = 10;
        Solution9 ob9 = new Solution9();
        boolean res = ob9.isPalindrome(num);
        assertFalse(res);
    }

}

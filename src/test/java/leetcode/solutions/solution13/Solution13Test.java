package leetcode.solutions.solution13;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Solution13Test {
    @Test
    public void TestCase1() {
        String s = "III";
        Solution13 ob = new Solution13();
        assertEquals(3, ob.romanToInt(s));
    }

    @Test
    public void TestCase2() {
        String s = "LVIII";
        Solution13 ob = new Solution13();
        assertEquals(58, ob.romanToInt(s));
    }

    @Test
    public void TestCase3() {
        String s = "MCMXCIV";
        Solution13 ob = new Solution13();
        assertEquals(1994, ob.romanToInt(s));
    }
}

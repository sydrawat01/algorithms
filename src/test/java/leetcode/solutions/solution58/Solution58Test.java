package leetcode.solutions.solution58;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Solution58Test {
    @Test
    public void TestCase1() {
        String s = "Hello World";
        Solution58 ob = new Solution58();
        assertEquals(5, ob.lengthOfLastWord(s));
    }

    @Test
    public void TestCase2() {
        String s = "This is a sentence";
        Solution58 ob = new Solution58();
        assertEquals(8, ob.lengthOfLastWord(s));
    }

    @Test
    public void TestCase3() {
        String s = "   fly me   to   the moon  ";
        Solution58 ob = new Solution58();
        assertEquals(4, ob.lengthOfLastWord(s));
    }

    @Test
    public void TestCase4() {
        String s = "luffy is still joyboy";
        Solution58 ob = new Solution58();
        assertEquals(6, ob.lengthOfLastWord(s));
    }
}

package leetcode.solutions.solution2062;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Solution2062Test {
    @Test
    public void TestCase1() {
        Solution2062 ob = new Solution2062();
        assertEquals(7, ob.countVowelSubstrings("cuaieuouac"));
    }

    @Test
    public void TestCase2() {
        Solution2062 ob = new Solution2062();
        assertEquals(2, ob.countVowelSubstrings("aeiouu"));
    }

    @Test
    public void TestCase3() {
        Solution2062 ob = new Solution2062();
        assertEquals(0, ob.countVowelSubstrings("unicornarihan"));
    }
}

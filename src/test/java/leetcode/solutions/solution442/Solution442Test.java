package leetcode.solutions.solution442;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Solution442Test {
    @Test
    public void TestCase1() {
        Solution442 ob = new Solution442();
        int[] arr = {1, 5, 7, 3, 1, 5};
        int[] solution = {1, 5};
        int[] result = ob.findDuplicates(arr).stream().mapToInt(i -> i).toArray();
        assertArrayEquals(solution, result);
    }

    @Test
    public void TestCase2() {
        Solution442 ob = new Solution442();
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] solution = {2, 3};
        int[] result = ob.findDuplicates(arr).stream().mapToInt(i -> i).toArray();
        assertArrayEquals(solution, result);
    }

    @Test
    public void TestCase3() {
        Solution442 ob = new Solution442();
        int[] arr = {1, 1, 2};
        int[] solution = {1};
        int[] result = ob.findDuplicates(arr).stream().mapToInt(i -> i).toArray();
        assertArrayEquals(solution, result);
    }

    @Test
    public void TestCase4() {
        Solution442 ob = new Solution442();
        int[] arr = {1};
        int[] solution = {};
        int[] result = ob.findDuplicates(arr).stream().mapToInt(i -> i).toArray();
        assertArrayEquals(solution, result);
    }
}

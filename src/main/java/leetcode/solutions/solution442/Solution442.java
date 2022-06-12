package leetcode.solutions.solution442;

import java.util.*;

public class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> s = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int i : nums) {
            if (!s.add(i))
                result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution442 ob = new Solution442();
        int[] arr = { 1, 5, 7, 3, 1, 5 };
        System.out.println(ob.findDuplicates(arr));
    }
}

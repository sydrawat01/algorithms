package leetcode.solutions.solution1365;

import java.util.*;

public class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] copy = nums.clone();
        Arrays.sort(copy);
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(copy[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            copy[i] = map.get(nums[i]);
        }
        return copy;
    }

    private void displayArray(int[] copy) {
        System.out.print("[ ");
        for (int i : copy) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Solution1365 ob = new Solution1365();
        int[] nums = { 8, 1, 2, 2, 3 };
        ob.displayArray(ob.smallerNumbersThanCurrent(nums));
    }
}

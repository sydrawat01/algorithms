package leetcode.solutions.solution35;

public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int begin = 0, end = nums.length;
        while (begin < end) {
            int mid = (begin + end) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                end = mid - 1;
            else
                begin = mid + 1;
        }
        return begin;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        Solution35 ob = new Solution35();
        System.out.println(ob.searchInsert(nums, target));
    }
}

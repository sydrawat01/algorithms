package leetcode.solutions.solution287;

public class Solution287 {
    private int lessOrEqualCount(int mid, int[] nums) {
        int cnt = 0;
        for (int num : nums) {
            if (num <= mid)
                ++cnt;
        }
        return cnt;
    }

    public int findDuplicate(int[] nums) {
        int lo = 1, hi = nums.length - 1;
        int res = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cnt = lessOrEqualCount(mid, nums);
            if (mid < cnt) {
                res = mid;
                hi = mid - 1;
            } else
                lo = mid + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution287 ob = new Solution287();
        int[] nums = { 1, 2, 3, 3, 4, 4, 6 };
        System.out.println(ob.findDuplicate(nums));
    }
}

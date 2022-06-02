package leetcode.solutions.solution1342;

public class Solution1342 {
    public int numberOfSteps(int num) {
        int c = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            ++c;
        }
        return c;
    }

    public static void main(String[] args) {
        Solution1342 ob = new Solution1342();
        System.out.println(ob.numberOfSteps(14));
    }
}

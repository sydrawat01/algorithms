package leetcode.solutions.solution9;

public class Solution9 {
    public boolean isPalindrome(int x) {
        int temp = x, res = 0;
        while (temp > 0) {
            int last = temp % 10;
            res = res * 10 + last;
            temp /= 10;
        }
        return res == x;
    }
    public static void main(String[] args) {
        Solution9 ob = new Solution9();
        System.out.println(ob.isPalindrome(123));
    }
}

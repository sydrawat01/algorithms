package leetcode.solutions.solution13;

public class Solution13 {
    public int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            ans = 4 * num < ans ? ans - num : ans + num;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution13 ob = new Solution13();
        System.out.println(ob.romanToInt("MCMXCIV"));
    }
}

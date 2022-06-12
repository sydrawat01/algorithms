package leetcode.solutions.solution58;

public class Solution58 {
    public int lengthOfLastWord(String s) {
        String x = s.trim();
        int len = x.length() - 1;
        int spaceIdx = x.lastIndexOf(" ");
        return len - spaceIdx;
    }

    public static void main(String[] args) {
        Solution58 ob = new Solution58();
        System.out.println(ob.lengthOfLastWord("This is a sentence"));
    }
}

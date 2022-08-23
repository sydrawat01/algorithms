package leetcode.solutions.solution234;

import ADT.LinkedList.Node;

public class Solution234 {
    /**
     * Sub-optimal performance
     * TODO: Solve in O(N) time and O(1) space
     * @param head pointer to head node
     * @return true or false if palindrome
     */
    public boolean isPalindrome1(Node head) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Node temp = head;
        while(temp !=null) {
            sb1.append(temp.data);
            sb2.append(temp.data);
            temp = temp.getNext();
        }
        sb2.reverse();
        return sb1.toString().equals(sb2.toString());
    }

    /**
     * Optimal solution in O(N) time and O(1) space
     * @param head pointer to head node
     * @return true or false if palindrome
     */
    public boolean isPalindrome(Node head) {
        return false;
    }
}

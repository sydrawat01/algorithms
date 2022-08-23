package leetcode.solutions.solution234;

import ADT.LinkedList.LinkedList;
import ADT.LinkedList.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution234Test {
    @Test
    public void palindrome1Check1() {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1, null);
        ll.insertEnd(2);
        ll.insertEnd(2);
        ll.insertEnd(1);

        Solution234 ob = new Solution234();
        assertTrue(ob.isPalindrome1(ll.head));
    }

    @Test
    public void palindrome1Check2() {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1, null);
        ll.insertEnd(2);

        Solution234 ob = new Solution234();
        assertFalse(ob.isPalindrome1(ll.head));
    }
}

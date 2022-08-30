package leetcode.solutions.solution206;

import ADT.LinkedList.LinkedList;
import ADT.LinkedList.Node;
import org.junit.Test;
import static org.junit.Assert.*;

public class Solution206Test {
    @Test
    public void testReverse() {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1, null);
        ll.insertEnd(2);
        ll.insertEnd(3);
        ll.insertEnd(4);
        ll.insertEnd(5);
        ll.insertEnd(6);
        Solution206 ob = new Solution206();
        ll.head = ob.reverseList(ll.head);
        assertEquals(ll.toString(), "6 -> 5 -> 4 -> 3 -> 2 -> 1 -> null");
    }
}

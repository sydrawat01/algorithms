package leetcode.solutions.solution206;

import ADT.LinkedList.Node;

public class Solution206 {
    public Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr!=null) {
            Node nextTemp = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}

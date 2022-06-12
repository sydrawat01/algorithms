package leetcode.solutions.solution83;
import ADT.LinkedList.Node;

public class Solution83 {
    public Node deleteDuplicates(Node head) {
        if (head == null || head.getNext() == null)
            return head;
        Node currPos = head;
        int currVal = head.data;
        while (currPos != null) {
            if (currPos.getNext() == null)
                break;
            if (currPos.getNext().data == currVal) {
                currPos.setNext(currPos.getNext().getNext());
            } else {
                currVal = currPos.getNext().data;
                currPos = currPos.getNext();
            }
        }
        return head;
    }

    public void displayList(Node list) {
        System.out.println();
        while (list != null) {
            System.out.print(list.data + " -> ");
            list = list.getNext();
        }
        if (list == null)
            System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        Solution83 ob = new Solution83();
        // List created: head = 1 -> 1 -> 2 -> 3 -> 3
        Node p4 = new Node(3, null);
        Node p3 = new Node(3, p4);
        Node p2 = new Node(2, p3);
        Node p1 = new Node(1, p2);
        Node head = new Node(1, p1);
        Node filteredList = ob.deleteDuplicates(head);
        // Should display: 1 -> 2 -> 3 -> null
        ob.displayList(filteredList);
    }
}

package ADT.LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testCreate() {
        LinkedList ll = new LinkedList();
        Node p2 = new Node(5, null);
        Node p1 = new Node(3, p2);
        ll.head = new Node(2, p1);
        assertEquals(ll.toString(), "2 -> 3 -> 5 -> null");
    }

    @Test
    public void testInsertFront() {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.insertFront(2);
        ll.insertFront(3);
        ll.insertFront(4);
        assertEquals(ll.toString(), "4 -> 3 -> 2 -> 1 -> null");
    }

    @Test
    public void testInsertAfter() {
        LinkedList ll = new LinkedList();
        Node p2 = new Node(5, null);
        Node p1 = new Node(3, p2);
        ll.head = new Node(2, p1);
        ll.insertAfter(p1, 45);
        assertEquals(ll.toString(), "2 -> 3 -> 45 -> 5 -> null");
    }

    @Test
    public void testInsertEnd() {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.insertEnd(2);
        ll.insertEnd(3);
        ll.insertEnd(4);
        assertEquals(ll.toString(), "1 -> 2 -> 3 -> 4 -> null");
    }

    @Test
    public void testDelete() {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.insertEnd(2);
        ll.insertEnd(3);
        ll.insertEnd(4);
        ll.insertEnd(5);
        ll.deleteNode(2);
        assertEquals(ll.toString(), "1 -> 3 -> 4 -> 5 -> null");
    }

    @Test
    public void testDeleteAtPos() {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.insertEnd(2);
        ll.insertEnd(3);
        ll.insertEnd(4);
        ll.insertEnd(5);
        ll.deleteNodeAtPosition(0);
        assertEquals(ll.toString(), "2 -> 3 -> 4 -> 5 -> null");
    }

    @Test
    public void testRecursiveLength() {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.insertEnd(2);
        ll.insertEnd(3);
        ll.insertEnd(4);
        ll.insertEnd(5);
        assertEquals(ll.linkedListLength(ll.head), 5);
    }

    @Test
    public void testIterativeLength() {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.insertEnd(2);
        ll.insertEnd(3);
        ll.insertEnd(4);
        ll.insertEnd(5);
        ll.deleteNodeAtPosition(0);
        assertEquals(ll.calcLength(ll.head), 4);
    }

    //TODO: Implement remaining unit tests for complete code coverage
}

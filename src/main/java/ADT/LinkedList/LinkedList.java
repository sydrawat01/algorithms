package ADT.LinkedList;

public class LinkedList {
    public Node head;

    // 1. Insert at the front of LinkedList
    public void insertFront(int value) {
        Node newNode = new Node(value, head);
        head = newNode;
    }

    // 2. Insert at a given position
    public void insertAfter(Node prev, int value) {
        if (prev == null) {
            System.out.println("Previous node cannot be null!");
            return;
        }
        Node newNode = new Node(value, prev.getNext());
        prev.setNext(newNode);
    }

    // 3. Insert at the end of the LinkedList
    public void insertEnd(int value) {
        Node temp = head;
        while (temp.getNext() != null)
            temp = temp.getNext();
        Node newNode = new Node(value, null);
        temp.setNext(newNode);
    }

    // 4. Delete a node from the LinkedList
    public void deleteNode(int value) {
        Node temp = head;
        Node prev = null;
        // 4.1 If head has the value to be deleted
        if (temp != null && temp.data == value) {
            head = temp.getNext();
            return;
        }
        // 4.2 Search for value and keep moving pointers till value is reached
        while (temp != null && temp.data != value) {
            prev = temp;
            temp = temp.getNext();
        }
        // 4.3 Value not found in LinkedList
        if (temp == null) {
            System.out.println("Could not find node to delete!");
            return;
        }
        // 4.4 Unlink node from LinkedList
        prev.setNext(temp.getNext());
        temp.setNext(null);
    }

    // 5. Delete node at given position
    public void deleteNodeAtPosition(int position) {
        if (head == null)
            return;
        Node temp = head;
        // 5.1 If 0th index is to be deleted
        if (position == 0) {
            head = temp.getNext();
            return;
        }
        // 5.2 Keep traversing the LinkedList to find position
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.getNext();
        }
        // 5.3 If node pointer (temp) points to null
        if (temp == null || temp.getNext() == null) {
            System.out.println("Position is more than number of nodes!");
            return;
        }
        // 5.4 Unlink node from LinkedList
        temp.setNext(temp.getNext().getNext());
    }

    // 6. Recursive function to find the length of a LinkedList
    public int linkedListLength(Node head) {
        if (head == null)
            return 0;
        return 1 + linkedListLength(head.getNext());
    }

    // 7. Iterative function to find length of a LinkedList
    public int calcLength(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    // 8. Search an element in the LinkedList - Iterative
    public boolean searchIterative(Node head, int x) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == x)
                return true;
            curr = curr.getNext();
        }
        return false;
    }

    // 9. Search an element in the LinkedList - Recursive
    public boolean searchRecursive(Node head, int x) {
        if (head == null)
            return false;
        if (head.data == x)
            return true;
        return searchIterative(head.getNext(), x);
    }

    // 10. Get the Nth node in a LinkedList - Recursive
    public int getNthNode(Node head, int n) {
        int count = 0;
        if (head == null)
            return -1;
        if (count == n)
            return head.data;
        return getNthNode(head.getNext(), n - 1);
    }

    // 11. Nth node in a LinkedList from the end
    public int getNthNodeFromLast(Node head, int n) {
        int length = linkedListLength(head);
        if (length < n)
            return -1;
        Node temp = head;
        for (int i = 1; i < length - n + 1; i++)
            temp = temp.getNext();
        return temp.data;
    }

    // 12. Find the middle element of a LinkedList
    /**
     * In case there are even number of elements in the LinkedList,
     * we will print the 2nd middle element.
     * Ex: 1 -> 2 -> 3 -> 4 -> 5 -> 6
     * Output: 4
     */
    public int middleElement(Node head) {
        Node slow = head;
        Node fast = head;
        while (slow.getNext() != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        return slow.data;
    }

    // 13. Count the occurrence of an integer in a LinkedList
    public int countOccurrence(Node head, int key) {
        if (head == null)
            return -1;
        if (head.data == key)
            return 1 + countOccurrence(head.getNext(), key);
        return countOccurrence(head.getNext(), key);
    }

    // 14. Loop detection in LinkedList
    public boolean loopDetection(Node head) {
        // TODO: Implementation pending
        // 14.1 Floyd's Cycle detection algorithm
        return false;
    }

    // 0. Print the LinkedList
    @Override
    public String toString() {
        Node ptr = head;
        StringBuilder ll = new StringBuilder();
        while (ptr != null) {
            ll.append(ptr.data).append(" -> ");
            ptr = ptr.getNext();
        }
        ll.append("null");
        return ll.toString();
    }
}

package ADT.LinkedList;

public class Node {
    public int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.setNext(next);
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

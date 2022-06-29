package ADT.DList;

public class DNode {
    public int data;
    public DNode prev;
    public DNode next;

    public DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

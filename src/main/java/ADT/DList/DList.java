package ADT.DList;

public class DList {
    DNode head;

    public DList() { this.head = null; }

    /**
     * Function to add data to end of doubly-linked list (DLL)
     * @param data data to be inserted into the DLL
     */
    public void append(int data) {
        //create the new node
        DNode temp = new DNode(data);
        //if LinkedList is empty
        if(isEmpty()) {
            head = temp;
            return;
        }
        //traverse till end to append the new node
        DNode last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = temp;
        temp.prev = last;
    }

    /**
     * Function to push data to front of DLL
     * @param data data to be pushed to the DLL
     */
    public void push(int data) {
        //create the new node
        DNode temp = new DNode(data);
        //if LinkedList is empty
        if(isEmpty()) {
            temp.prev = null;
            head = temp;
            return;
        }
        //change pointers to push new node in the front of the DLL
        temp.next = head;
        head = temp;
    }

    /**
     * Function to remove an element from the FRONT of a DLL
     */
    public void pop() {
        if(isEmpty()) return;
        DNode temp = head.next;
        head.next = temp.prev = null;
        head = temp;
    }

    /**
     * Function to remove an element from the BACK of a DLL
     */
    public void delete() {
        if(isEmpty()) return;
        DNode temp = head;
        while(temp.next.next != null)
            temp = temp.next;
        temp.next.prev = null;
        temp.next = null;
    }

    /**
     * Function to check if the DLL is empty
     * @return boolean true if the DLL is empty, false otherwise
     */
    public boolean isEmpty() { return this.head == null; }

    public int size() {
        if(isEmpty()) return 0;
        DNode temp = head;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    /**
     * Function to display the DLL
     */
    public void display() {
        if(isEmpty()) System.exit(1);
        else {
            DNode temp = head;
            while(temp != null) {
                System.out.printf("%d->", temp.data);
                temp = temp.next;
            }
            System.out.print("\b\b\n");
        }
    }

    public static void main(String[] args) {
        DList dll = new DList();
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.display();
        System.out.println("Size of DLL : " + dll.size());
    }
}

package ADT.API.LinkedList;

import ADT.API.APIException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Implementation of a doubly linked list
 * @param <Item>
 */
public class DList<Item> implements Iterable<Item> {

    /**
     * Constructor which seeds the DList with one item
     *
     * @param data the Item to place into the new DList.
     */
    public DList(Item data) {
        super();
        addBeforeNode(data, null);
    }

    /**
     * Constructor which creates an empty DList
     */
    public DList() { super(); }

    /**
     * Add an item immediately before the given item
     *
     * @param data the item to be added.
     * @param next may be null, in which case the item will be the only item on the list
     * @throws APIException if next item is not found
     */
    public void addBefore(Item data, Item next) throws APIException {
        if (next == null) addBeforeNode(data, null);
        else {
            Node first = findFirst(next);
            if (first != null)
                addBeforeNode(data, first);
            else
                throw new APIException("item not found: " + next);
        }
    }

    /**
     * Add an item immediately after the given item
     *
     * @param data the item to be added.
     * @param prev may NOT be null
     * @throws APIException if prev item is not found
     */
    public void addAfter(Item data, Item prev) throws APIException {
        Node last = findLast(prev);
        if (last != null)
            addAfterNode(data, last);
        else
            throw new APIException("item not found: " + prev);
    }

    /**
     * Remove the last node matching data from the linked list
     * @param data the item to be removed
     * @throws APIException if item to be removed is not found
     */
    public void remove(Item data) throws APIException {
        Node last = findLast(data);
        if (last != null)
            remove(last);
        else
            throw new APIException("item not found: " + data);
    }

    /**
     * Add an item immediately before the given Node
     *
     * @param data the item to be added.
     * @param next may be null, in which case the item will be the only item on the list
     */
    public void addBeforeNode(Item data, Node next) {
        Node temp = new Node(data);
        // if only one item in the list
        if (next == null) {
            head = tail = temp;
            head.prev = null;
            tail.next = null;
        } else {
            // insert element & update head pointer
            temp.next = head;
            temp.prev = null;
            head.prev = temp;
            head = temp;
        }
        count++;
    }

    /**
     * Function to add an item after the prev node
     *
     * @param data the item to be added
     * @param prev a pointer to the previous position where insertion needs to happen, may NOT be null
     */
    public void addAfterNode(Item data, Node prev) {
        Node temp = new Node(data);
        // update pointers of element "prev" to point to the element which is to be inserted
        temp.prev = prev;
        temp.next = prev.next;
        prev.next = temp;
        tail = temp;
        count++;
    }

    /**
     * Remove the node from the doubly-linked list
     * @param del the node to be removed
     */
    public void remove(Node del) {
        // if element to be removed is head
            if (head == del){
                if (size() == 1) {
                    head = null;
                }
                else {
                    head = del.next;
                    head.prev = null;
                }
            }
            if (del.next != null) {
                del.next.prev = del.prev;
            }
            if (del.prev != null) {
                del.prev.next = del.next;
            }
            if (del.next == null)
                tail = del.prev;
            del.prev = null;
            count--;
    }

    public Node findFirst(Item data) {
        Node temp = head;
        // traverse linked list till first instance of item is found
        while(temp != null) {
            if(temp.data == data) {
                return temp;
            }
            temp = temp.next;
        }
        // return null if not found
        return null;
    }

    public Node findLast(Item data) {
        Node temp = tail;
//        // traverse linked list in reverse till last instance of item is found
        while (temp != null) {
            if (temp.data == data)
                return temp;
            temp = temp.prev;
        }
        // return null if not found
        return null;
    }

    /**
     * Function that checks if the doubly-linked list is empty or not
     *
     * @return boolean true if linked-list is empty, false otherwise
     */
    public boolean isEmpty() { return head == null; }

    /**
     * Function that returns the size of the doubly-linked list
     *
     * @return integer that represents the length
     */
    public int size() { return count; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item i : this) sb.append(i).append(", ");
        return sb.toString();
    }

    @Override
    public Iterator<Item> iterator() {
        return head != null ? head.iterator() : Collections.emptyIterator();
    }

    class Node implements Iterable<Item> {
        Node(Item data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        Node(Item data) { this(data, null, null); }

        final Item data;
        Node prev;
        Node next;

        @Override
        public Iterator<Item> iterator() {
            Collection<Item> result = new ArrayList<>();
            Node ptr = this;
            while (ptr != null) {
                result.add(ptr.data);
                ptr = ptr.next;
            }
            return result.iterator();
        }
    }

    private Node head = null;
    private Node tail = null;
    private int count = 0;
}

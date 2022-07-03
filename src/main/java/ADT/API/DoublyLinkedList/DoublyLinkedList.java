package ADT.API.DoublyLinkedList;

import ADT.API.APIException;

import java.util.Collections;
import java.util.Iterator;

public class DoublyLinkedList<Item> implements DoublyLinkedListAPI<Item> {

    public DoublyLinkedList(Item data) {
        super();
        addBeforeNode(data, null);
    }

    public DoublyLinkedList() {super();}

    @Override
    public void addBefore(Item data, Item next) throws APIException {
        if (next == null)
            addBeforeNode(data, null);
        else {
            Node<Item> first = findFirst(next);
            if (first != null)
                addBeforeNode(data, first);
            else
                throw new APIException("data not found: " + next);
        }
    }

    @Override
    public void addBeforeNode(Item data, Node<Item> next) {
        Node<Item> temp = new Node<>(data);
        if (next == null) {
            head = tail = temp;
            head.prev = tail.next = null;
        } else {
            temp.next = head;
            temp.prev = null;
            head.prev = temp;
            head = temp;
        }
        count++;
    }

    @Override
    public void addAfter(Item data, Item prev) throws APIException {
        Node<Item> last = findLast(prev);
        if (last != null)
            addAfterNode(data, last);
        else
            throw new APIException("data not found: " + prev);
    }

    @Override
    public void addAfterNode(Item data, Node<Item> prev) {
        Node<Item> temp = new Node<>(data);
        temp.prev = prev;
        temp.next = prev.next;
        prev.next = temp;
        tail = temp;
        count++;
    }

    @Override
    public void remove(Item data) throws APIException {
        Node<Item> last = findLast(data);
        if (last != null)
            remove(last);
        else
            throw new APIException("data not found: " + data);
    }

    @Override
    public void remove(Node<Item> del) {
            if (head == del) {
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

    public int size() { return count; }

    public boolean isEmpty() { return head == null; }

    public Node<Item> findFirst(Item data) {
        Node<Item> temp = head;
        while (temp != null) {
            if (temp.data == data)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public Node<Item> findLast(Item data) {
        Node<Item> temp = tail;
        while (temp != null) {
            if (temp.data == data)
                return temp;
            temp = temp.prev;
        }
        return null;
    }

    public Item getTail() {
        return tail.data;
    }

    public Item getHead() {
        return head.data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item i : this) sb.append(i).append(", ");
//        sb.append("\b\b");
        return sb.toString();
    }

    @Override
    public Iterator<Item> iterator() {
        return head != null ? head.iterator() : Collections.emptyIterator();
    }

    private Node<Item> head = null;
    private Node<Item> tail = null;
    private int count = 0;
}

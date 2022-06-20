package ADT.API.LinkedList;

import ADT.API.APIException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class LinkedList<Item> implements LinkedListAPI<Item> {
    private Node<Item> head;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LinkedList<?> that)) return false;
        return head.equals(that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head);
    }

    public void add(Item data) {
        Node<Item> tail = head;
        head = new Node<>(data, tail);
    }

    public void insert(Item data) {
        Node<Item> temp = head;
        if (head == null) {
            head = new Node<>(data, null);
            return;
        }
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node<>(data, null);
    }

    public Item remove() throws APIException {
        if (head == null) throw new APIException("You've removed all items from the LinkedList, it's empty.");
        Item result = head.data;
        head = head.next;
        return result;
    }

    public void delete(Item value) throws APIException {
        Node<Item> temp = head;
        Node<Item> prev = null;
        // If head has the value to be deleted
        if (temp != null && temp.data == value) {
            head = temp.next;
            return;
        }
        //Search for value in the LinkedList
        while (temp != null && temp.data != value) {
            prev = temp;
            temp = temp.next;
        }
        // If value isn't present in the LinkedList
        if (temp == null) {
            throw new APIException("Value is not present in the Linked List.");
        }
        prev.next = temp.next;
        temp.next = null;
    }

    public int size(Node<Item> head) {
        if (head == null) {
            return 0;
        }
        return 1 + size(head.next);
    }

    public boolean search(Node<Item> head, Item value) {
        if(head == null) return false;
        if(head.data == value) return true;
        return search(head.next, value);
    }

    public Item middle(Node<Item> head) {
        Node<Item> fast = head;
        Node<Item> slow = head;
        while(slow.next != null && fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    public boolean cycle(Node<Item> head) {
        // Floyd's cycle detection algorithm
        Node<Item> slow = head, fast = head;
        int flag = 0;
        while(slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = 1;
                break;
            }
        }
        return flag == 1;
    }

    public boolean isEmpty() { return head == null; }

    public Node<Item> getHead() { return isEmpty() ? null : head; }

    public Item top() { return isEmpty() ? null : head.data; }

    private Iterable<Item> asItemIterable() {
        Collection<Item> result = new ArrayList<>();
        Node<Item> x = head;
        while (x != null) {
            result.add(x.data);
            x = x.next;
        }
        return result;
    }

    public Iterator<Item> iterator() { return asItemIterable().iterator(); }

    public String toString() { return asItemIterable().toString(); }
}

package ADT.API.DoublyLinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Node<Item> implements Iterable<Item> {

    Node(Item data, Node<Item> prev, Node<Item> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    Node(Item data) { this(data, null, null); }

    final Item data;
    Node<Item> prev;
    Node<Item> next;

    @Override
    public Iterator<Item> iterator() {
        Collection<Item> result = new ArrayList<>();
        Node<Item> ptr = this;
        while (ptr != null) {
            result.add(ptr.data);
            ptr = ptr.next;
        }
        return result.iterator();
    }
}

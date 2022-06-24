package ADT.API.Queue;

import java.util.Iterator;

import ADT.API.LinkedList.Node;
import util.SizedIterable;
import util.SizedIterableImpl;

public class Queue<Item> implements SizedIterable<Item>, QueueAPI<Item> {

    public Queue() {
        oldest = null;
        newest = null;
    }

    public void enqueue(Item item) {
        Node<Item> element = new Node<>(item);
        Node<Item> secondNewest = newest;
        if (isEmpty()) oldest = element;
        else {
            secondNewest.next = element;
        }
        this.newest = element;
    }

    public Item dequeue() {
        if (isEmpty())
            return null;
        else {
            Item result = oldest.data;
            oldest = oldest.next;
            if (isEmpty())
                newest = null;
            return result;
        }
    }

    public boolean isEmpty() {
        return oldest == null;
    }

    // This Node essentially begins a LinkedList of Nodes which correspond
    // to the elements that can be taken from the queue (head points to the oldest element).
    // However, it is built in manner that requires a pointer to the newest element.
    private Node<Item> oldest;

    // This Node always points to the newest (tail-most) element in the LinkedList referenced by oldest.
    private Node<Item> newest;

    @Override
    public String toString() {
        return (oldest != null ? "Queue: next: " + oldest + (oldest.next != null ? " and others..." : "") : "empty");
    }

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    @Override
    public int size() {
        return SizedIterableImpl.create(this).size();
    }

    public void clear() {
        while (!isEmpty()) dequeue();
    }

    class QueueIterator implements Iterator<Item> {
        public boolean hasNext() {
            return next != null;
        }

        public Item next() {
            Item result = next.data;
            next = next.next;
            return result;
        }

        Node<Item> next = oldest;

    }
}

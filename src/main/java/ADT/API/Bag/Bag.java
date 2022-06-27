package ADT.API.Bag;

import java.util.Iterator;
import java.util.*;

public class Bag<Item> implements BagAPI<Item>{

    public void add(Item item) {
        if (full()) grow(items, 2 * capacity());
        items[count++] = item;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public Iterator<Item> iterator() {
        return Arrays.asList(Arrays.copyOf(items,count)).iterator();
    }

    public Bag() {
        grow((Item[]) new Object[0], 32);
    }

    private void grow(Item[] source, int size) {
        items = growFrom(source, size);
    }

    private int capacity() {
        return items.length;
    }

    private boolean full() {
        return size() == capacity();
    }

    private static <T> T[] growFrom(T[] from, int size) {
        T[] result = (T[]) new Object[size];
        System.arraycopy(from , 0 , result, 0, from.length);
        return result;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                '}';
    }

    private Item[] items = null;
    private int count = 0;
}

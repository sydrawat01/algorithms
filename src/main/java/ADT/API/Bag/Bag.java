package ADT.API.Bag;

import java.util.Iterator;
import java.util.*;

public class Bag<Item> implements BagAPI<Item>{

    public void add(Item item) {
        assert items != null;
        if (full())
            grow(items, 2 * capacity());
        items[count++] = item;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void clear() {
        count = 0;
    }

    public boolean contains(Item item) {
        for (Item i : items) {
            if (i != null && i.equals(item))
                return true;
        }
        return false;
    }

//    @Override
    public int multiplicity(Item item) {
        int result = 0;
        if (isEmpty()) return 0;
        for (Item i : items) {
            if (i != null && i.equals(item))
                result++;
        }
        return result;
    }

    public Iterator<Item> iterator() {
        assert items != null; // Should be not-null any time after construction.
        // NOTE: there is no Java-defined array iterator.
        return Arrays.asList(asArray()).iterator();
    }

    public Item[] asArray() {
        return Arrays.copyOf(items, count);
    }

    public Bag() {
        //noinspection unchecked
        grow((Item[]) new Object[0], 32);
    }

    private void grow(Item[] source, int size) {
        items = growFrom(source, size);
    }

    private int capacity() {
        assert items != null; // Should be not-null any time after construction.
        return items.length;
    }

    private boolean full() {
        return size() == capacity();
    }

    /**
     * This fairly primitive grow method takes a T array called "from",
     * instantiates a new array of the given size,
     * copies all the elements of from into the start of the resulting array,
     * then returns the result.
     *
     * @param from the source array
     * @param size the size of the new array
     */
    private static <T> T[] growFrom(T[] from, int size) {
        //noinspection unchecked
        T[] result = (T[]) new Object[size];
        System.arraycopy(from , 0 , result, 0, from.length);
        return result;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "items=" + Arrays.toString(asArray()) +
                ", count=" + count +
                '}';
    }

    private Item[] items = null;
    private int count = 0;
}

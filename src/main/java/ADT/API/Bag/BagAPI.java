package ADT.API.Bag;

public interface BagAPI<Item> extends Iterable<Item> {
    void add(Item item);
    boolean isEmpty();
    int size();
}

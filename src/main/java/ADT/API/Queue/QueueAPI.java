package ADT.API.Queue;

public interface QueueAPI<Item> extends Iterable<Item> {
    void enqueue(Item item);
    Item dequeue();
    boolean isEmpty();
}

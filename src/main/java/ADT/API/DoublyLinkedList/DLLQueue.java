package ADT.API.DoublyLinkedList;

import ADT.API.APIException;
import ADT.API.Queue.QueueAPI;

import java.util.Iterator;

public class DLLQueue<Item> implements QueueAPI<Item> {

    public DLLQueue() {
        this.list = new DoublyLinkedList<>();
    }

    public DLLQueue(Item data) {
        this.list = new DoublyLinkedList<>(data);
    }

    public void enqueue(Item item) {
        if (list.size() == 0) {
            list.addBeforeNode(item, null);
        } else {
            Node<Item> last = list.findLast(list.getTail());
            list.addAfterNode(item, last);
        }
    }

    public Item dequeue() throws APIException {
        if (list.isEmpty())
            throw new APIException("list is empty!");
        else {
            Node<Item> first = list.findFirst(list.getHead());
            Item dequeue = first.data;
            list.remove(first);
            return dequeue;
        }
    }

    public boolean isEmpty() { return list.isEmpty(); }

    public int size() { return list.size(); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item i : this) sb.append(i).append(", ");
//        sb.append("\b\b");
        return sb.toString();
    }

    public Iterator<Item> iterator() { return list.iterator(); }

    private final DoublyLinkedList<Item> list;
}

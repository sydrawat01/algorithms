package ADT.API.LinkedList;

import ADT.API.APIException;

public interface LinkedListAPI<Item> extends Iterable<Item>, ListAPI<Item> {
    Item top();
    Node<Item> getHead();
    void insert(Item data);
    void delete(Item value) throws APIException;
    int size(Node<Item> head);
    boolean search(Node<Item> head, Item value);
    Item middle(Node<Item> head);
    boolean cycle(Node<Item> head);
}

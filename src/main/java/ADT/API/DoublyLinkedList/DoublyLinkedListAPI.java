package ADT.API.DoublyLinkedList;

import ADT.API.APIException;

public interface DoublyLinkedListAPI<Item> extends Iterable<Item>{
    /**
     * Function  to add an item before a given item, after searching for the next item
     * @param data the item to be added
     * @param next the item before which the data is to be inserted
     * @throws APIException throw an exception if the next item is not found
     */
    void addBefore(Item data, Item next) throws APIException;

    /**
     * Function to add an item before a given Node
     * @param data the item to be added to the list
     * @param next the Node before which the data is to be inserted
     */
    void addBeforeNode(Item data, Node<Item> next);

    /**
     * Function to add an item after a given item, after searching for the prev item
     * @param data the item to be added
     * @param prev the item after which the data is to be inserted
     * @throws APIException throw an exception if the prev item is not found
     */
    void addAfter(Item data, Item prev) throws APIException;

    /**
     * Function to add a Node after a given Node
     * @param data the item to be added to the list
     * @param prev the Node after which the data is to be inserted
     */
    void addAfterNode(Item data, Node<Item> prev);

    /**
     * Function to remove an item from the list
     * @param data the item to be removed
     * @throws APIException throw an exception if the list is empty
     */
    void remove(Item data) throws APIException;

    /**
     * Function to remove the given Node
     * @param del the Node to be deleted
     */
    void remove(Node<Item> del);

    /**
     * Function to find the item from the beginning of the list
     * @param next item to be found
     * @return the Node where the item was found
     */
    Node<Item> findFirst(Item next);

    /**
     * Function to find the item from the end of the list
     * @param prev item to be found
     * @return the Node where the item was found
     */
    Node<Item> findLast(Item prev);

    /**
     * Function that returns the size of the list
     * @return integer size of the list
     */
    int size();

    /**
     * Function to check if the list is empty
     * @return boolean true if the list is empty
     */
    boolean isEmpty();

    /**
     * Function to return the item at the head of the list
     * @return the item at the head of the list
     */
    Item getHead();

    /**
     * Function to return the item at the end of the queue
     * @return the item at the end of the queue
     */
    Item getTail();
}

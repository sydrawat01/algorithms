package ADT.API.LinkedList;

import ADT.API.APIException;

/**
 * Generic Interface to define the behaviour of a LinkedList
 * @param <Item> the data type of the LinkedList
 */

public interface LinkedListAPI<Item> extends Iterable<Item>, ListAPI<Item> {
    /**
     * Method to get the head of the LinkedList
     * @return value at the top of a stack implemented as a LinkedList
     */
    Item top();

    /**
     * Method to get the pointer to the head node in a LinkedList
     * @return the head of the LinkedList
     */
    Node<Item> getHead();

    /**
     * Method to insert data in the end of a LinkedList
     * @param data the data to be inserted into the LinkedList
     */
    void insert(Item data);

    /**
     * Method to delete data from the LinkedList
     * @param value the data to be deleted
     * @throws APIException for underflow of the LinkedList
     */
    void delete(Item value) throws APIException;

    /**
     * Method to get the length of the LinkedList
     * @param head pointer to the head of the LinkedList
     * @return Integer number that represents the length of the LinkedList
     */
    int size(Node<Item> head);

    /**
     * Method to search in the LinkedList
     * @param head pointer to the head of the LinkedList
     * @param value the value to be searched in the LinkedList
     * @return true or false based on whether the value is present in the LinkedList
     */
    boolean search(Node<Item> head, Item value);

    /**
     * Method to find the middle element in a LinkedList
     * @param head pointer to the head of the LinkedList
     * @return value of the middle element of the LinkedList
     */
    Item middle(Node<Item> head);

    /**
     * Method to find whether a LinkedList is in a loop
     * @param head pointer to the head of the LinkedList
     * @return true or false based on whether the LinkedList contains a loop
     */
    boolean cycle(Node<Item> head);
}

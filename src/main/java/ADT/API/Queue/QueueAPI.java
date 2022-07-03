package ADT.API.Queue;

import ADT.API.APIException;

public interface QueueAPI<Item> extends Iterable<Item> {
    /**
     * Function to add data to the queue
     * @param item the data to be inserted into the queue
     */
    void enqueue(Item item);

    /**
     * Function to remove the data from the queue
     * @return the first item at the top of the queue
     * @throws APIException throw an error if queue is empty
     */
    Item dequeue() throws APIException;

    /**
     * Function to check if the queue is empty
     * @return boolean true of list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Function that returns the size of the queue
     * @return integer that represents the length of the queue
     */
    int size();
}

package ADT.Queue;

public interface FIFO {
    /**
     * Function to add elements into the queue
     * @param data the integer data to be added
     */
    void enqueue(int data);

    /**
     * Function to remove the elements from the head of the queue
     */
    void dequeue();

    /**
     * Function to check if the queue is empty
     * @return boolean true if queue is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Function that prints all elements in the stack
     */
    void display();

    /**
     * Function to get the length of the stack
     * @return integer that represents the length of the stack
     */
    int size();
}

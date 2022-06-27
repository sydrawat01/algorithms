package ADT.Stack;

public interface LIFO {
    /**
     * Function to push data into the stack
     * @param data the integer data to be pushed into the stack
     */
    void push(int data);

    /**
     * Function that removes the topmost element of the stack
     */
    void pop();

    /**
     * Function that returns the top element of the stack. This does not
     * remove the element from the stack
     * @return top element in the stack
     */
    int peek();

    /**
     * Function that checks if the stack is empty
     * @return boolean true if stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Function that prints all elements in the stack
     */
    void display();
}

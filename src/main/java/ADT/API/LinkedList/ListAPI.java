package ADT.API.LinkedList;

import ADT.API.APIException;

public interface ListAPI<Item> {

    /**
     * Method to add data to the front of the List
     * @param data the data to be added to the List
     */
    void add(Item data);

    /**
     * Method to remove an item from the LinkedList
     * @return the value that is removed from the head of the List
     * @throws APIException for underflow of the List
     */
    Item remove() throws APIException;

    /**
     * Method to check if the List is empty
     * @return true or false if the list is empty
     */
    boolean isEmpty();
}

package ADT.API.LinkedList;

import ADT.API.APIException;

public interface ListAPI<Item> {
    void add(Item data);
    Item remove() throws APIException;
    boolean isEmpty();
}

package ADT.API;

public interface ListAPI<Item> {
    void add(Item data);
    Item remove() throws APIException;
    boolean isEmpty();
}

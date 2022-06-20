package ADT.API.Stack;

import ADT.API.APIException;

public interface StackAPI<Item> extends Iterable<Item> {
    void push(Item data);
    Item pop() throws APIException;
    Item peek();
    boolean isEmpty();
}

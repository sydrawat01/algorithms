package ADT.API.Stack;

import ADT.API.APIException;
import ADT.API.LinkedList.LinkedList;
import ADT.API.LinkedList.Node;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class Stack<Item> implements StackAPI<Item> {

    private final LinkedList<Item> list;

    Stack(LinkedList<Item> list) {
        this.list = list;
    }

    public Stack() { this(new LinkedList<>()); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stack<?> stack)) return false;
        return Objects.equals(list, stack.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    public void push(Item data) {
        list.add(data);

    }

    public Item pop() throws APIException {
        return list.remove();
    }

    public Item peek() {
        return list.top();
    }

    public boolean isEmpty() { return list.isEmpty(); }

    public Iterator<Item> iterator() { return list.iterator(); }

    @Override
    public String toString() {
        return list.toString();
    }
}

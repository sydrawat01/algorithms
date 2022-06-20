package ADT.API;

import java.util.Objects;

public class Node<Item> {
    Node(Item data) {
        this(data, null);
    }
    Node(Item data, Node<Item> next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node<?> node)) return false;
        return data.equals(node.data) && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }

    final Item data;
    Node<Item> next;
}

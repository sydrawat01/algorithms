package ADT.Stack;

import ADT.LinkedList.Node;

import static org.junit.Assert.assertEquals;

public class Stack implements LIFO {
    Node top;

    public Stack() { this.top = null; }

    public void push(int data) {
        Node temp = new Node(data);
        if (this.top == null)
            temp.setNext(null);
        else
            temp.setNext(this.top);
        this.top = temp;
    }

    public void pop() {
        if(isEmpty())
            return;
        this.top = this.top.getNext();
    }

    public int peek() {
        if (!isEmpty())
            return this.top.data;
        else
            return -1; //stack underflow
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public int size() {
        if (isEmpty()) return 0;
        Node temp = this.top;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public void display() {
        if(isEmpty()) System.exit(1);
        else {
            Node temp = this.top;
            while(temp != null) {
                System.out.printf("%d->", temp.data);
                temp = temp.getNext();
            }
            System.out.print("\b\b\n");
        }
    }
}

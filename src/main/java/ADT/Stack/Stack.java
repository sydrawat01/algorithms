package ADT.Stack;

import ADT.LinkedList.Node;

public class Stack implements LIFO {
    Node top;

    public Stack() { this.top = null; }

    public void push(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.setNext(top);
        top = temp;
    }

    public void pop() {
        if(isEmpty())
            return;
        top = top.getNext();
    }

    public int peek() {
        if (!isEmpty())
            return top.data;
        else
            return -1; //stack underflow
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if(isEmpty()) System.exit(1);
        else {
            Node temp = top;
            while(temp != null) {
                System.out.printf("%d->", temp.data);
                temp = temp.getNext();
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Stack ob = new Stack();
        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.push(4);
        ob.display();
        System.out.println(ob.peek());
        ob.pop();
        ob.pop();
        System.out.println(ob.peek());
        ob.display();
    }
}

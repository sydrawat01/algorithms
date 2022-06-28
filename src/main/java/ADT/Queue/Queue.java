package ADT.Queue;

import ADT.LinkedList.Node;

public class Queue implements FIFO{
    Node front, rear;

    public Queue() { this.front = this.rear = null; }

    public void enqueue(int data) {
        Node temp = new Node(data);
        if(this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.setNext(temp);
        this.rear = temp;
    }

    public void dequeue() {
        if(this.front == null)
            return; //queue underflow
        Node temp = this.front;
        this.front = this.front.getNext();
        if(this.front == null)
            this.rear = null;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public int size() {
        if (isEmpty()) return 0;
        Node temp = front;
        int count = 0;
        while(temp != rear.getNext()) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public void display() {
        if(isEmpty()) System.exit(1);
        else {
            Node temp = front;
            while(temp != rear.getNext()) {
                System.out.printf("%d<-", temp.data);
                temp = temp.getNext();
            }
            System.out.print("\b\b\n");
        }
    }
}

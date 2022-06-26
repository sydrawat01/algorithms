package ADT.API.Queue;

/**
 * In the Josephus problem from antiquity, N people are in dire straits and agree to the following strategy to reduce
 * the population. They arrange themselves in a circle (at positions numbered from 0 to N-1) and proceed around the
 * circle, eliminating every Mth person until only one person is left.Legend has it that Josephus figured out where to
 * sit to avoid being eliminated. Write a Queue client Josephus.java that takes M and N inputs and prints out the order
 * in which people are eliminated (and thus would show Josephus where to sit in the circle).
 *
 * https://algs4.cs.princeton.edu/13stacks/Josephus.java.html
 */

public class Josephus {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;

        // initialize the queue
        Queue<Integer> queue = new Queue<>();
        for (int i = 0; i < n; i++)
            queue.enqueue(i);

        while (!queue.isEmpty()) {
            for (int i = 0; i < m-1; i++)
                queue.enqueue(queue.dequeue());
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }
}

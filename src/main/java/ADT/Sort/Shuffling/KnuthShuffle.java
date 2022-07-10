package ADT.Sort.Shuffling;

import util.Helper;

import java.util.Random;

public class KnuthShuffle<T extends Comparable<T>> {

    /**
     * Rearranges an array of objects in uniformly random order
     * (under the assumption that {@code Math.random()} generates independent
     * and uniformly distributed numbers between 0 and 1).
     * @param a the array to be shuffled
     */
    public void shuffle(T[] a) {
        int n = a.length;
        Random random = new Random();
        for(int i=0; i<n; i++) {
            int r = random.nextInt(i+1);
            //System.out.println("swap indices " + i + " and " + r);
            helper.swap(a, i, r);
        }
    }

    final Helper<T> helper = new Helper<>();
}

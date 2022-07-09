package ADT.Sort.Shuffling;

import java.util.Arrays;
import java.util.Random;

public class KnuthShuffle {
    // This class should not be instantiated.
    private KnuthShuffle() {}

    /**
     * Rearranges an array of objects in uniformly random order
     * (under the assumption that {@code Math.random()} generates independent
     * and uniformly distributed numbers between 0 and 1).
     * @param a the array to be shuffled
     */
    public static void shuffle(Object[] a) {
        int n = a.length;
        Random random = new Random();
        for(int i=0; i<n; i++) {
            int r = random.nextInt(i+1);
            System.out.println("swap indices " + i + " and " + r);
            swap(a, i, r);
        }
    }

    private static void swap(Object[] a, int i, int r) {
        Object swap = a[r];
        a[r] = a[i];
        a[i] = swap;
    }

    public static void main(String[] args) {
        Object[] a = new Object[10];
        for(int i=0; i<10; i++) {
            a[i] = i;
        }
        System.out.println("Before: " + Arrays.toString(a));
        KnuthShuffle.shuffle(a);
        System.out.println("After: " + Arrays.toString(a));
    }
}

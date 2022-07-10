package util;

import ADT.Sort.Shuffling.KnuthShuffle;

public class Supplier<T extends Comparable<T>> {
    public Supplier(int seed) {
        ks = new KnuthShuffle<>();
        a = new Integer[seed];
        for(int i=0; i<seed; i++) {
            a[i] = i;
        }
    }

    public Integer[] supply() {
        ks.shuffle(a);
        return a;
    }

    private final Integer[] a;
    private final KnuthShuffle<Integer> ks;
}

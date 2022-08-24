package ADT.Sort.MergeSort;

import ADT.Sort.InsertionSort.InsertionSort;
import util.Helper;

/**
 * Highly optimized Merge sort algorithm that uses Insertion sort after
 * threshold cutoff limit is crossed.
 * @param <T> Generic type to sort any type using Merge Sort
 */
public class MergeSort<T extends Comparable<T>> {

    public MergeSort() {
        insertionSort = new InsertionSort<>();
    }

    private void merge(T[] aux, T[] a, int lo, int mid, int hi) {
        //TODO: Implementation pending
        //END
    }

    public T[] sort(T[] a, int from, int to) {
        //TODO: Implementation pending
        //END
        return a;
    }

    private T[] aux = null;
    private final Helper<T> helper = new Helper<>();
    private final InsertionSort<T> insertionSort;
}

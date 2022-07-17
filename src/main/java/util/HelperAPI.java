package util;

/**
 * Generic interface that provides basic helper util functions
 */
public interface HelperAPI<T extends Comparable<T>> {

    /**
     * Utility method to return true if a[x] < a[y]
     * @param x comparison index 1 in a
     * @param y comparison index 2 in a
     * @return true if x < y, false otherwise
     */
    boolean less(T x, T y);

    /**
     * Utility method to return true if a[x] > a[y]
     * @param x comparison index 1 in a
     * @param y comparison index 2 in a
     * @return true if x > y, false otherwise
     */
    boolean more(T x, T y);

    /**
     * Utility method to return true if a[x] == a[y]
     * @param x comparison index 1 in a
     * @param y comparison index 2 in a
     * @return true if x == y, false otherwise
     */
    boolean equal(T x, T y);

    /**
     * Utility method to help swap two numbers
     * @param a the array we are performing sort on
     * @param x the index that needs to be swapped
     * @param y the index that needs to be swapped with
     */
    void swap(T[] a, int x, int y);

    /**
     * Utility method that checks whether an array is sorted or not
     * @param a the array to check if it is sorted
     * @return true if the array is sorted in ascending order
     */
    boolean sorted(T[] a);

    /**
     * Default cutoff limit for Merge Sort. When this threshold is crossed,
     * the algorithm needs to perform insertion sort, for optimal performance.
     * @return integer value 7
     */
    default int cutoff() {
        return 7;
    }
}

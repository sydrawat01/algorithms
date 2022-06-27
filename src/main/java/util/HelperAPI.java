package util;

/**
 * Non-generic interface that works only with Arrays
 */
public interface HelperAPI {

    /**
     * Utility method to return true if a[x] < a[y]
     * @param a the array where the indexes are being compared
     * @param x comparison index 1 in a
     * @param y comparison index 2 in a
     * @return true if x < y, false otherwise
     */
    boolean less(int[] a, int x, int y);

    /**
     * Utility method to return true if a[x] > a[y]
     * @param a the array where the indexes are being compared
     * @param x comparison index 1 in a
     * @param y comparison index 2 in a
     * @return true if x > y, false otherwise
     */
    boolean more(int[] a, int x, int y);

    /**
     * Utility method to help swap two numbers
     * @param a the array we are performing sort on
     * @param x the index that needs to be swapped
     * @param y the index that needs to be swapped with
     */
    void swap(int[] a, int x, int y);

    /**
     * Utility method to print the array
     * @param a the array to be printed onto the console
     */
    void printArray(int[] a);

    /**
     * Utility method that checks whether an array is sorted or not
     * @param a the array to check if it is sorted
     * @return true if the array is sorted in ascending order
     */
    boolean sorted(int[] a);
}

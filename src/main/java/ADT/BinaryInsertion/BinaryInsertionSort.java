package ADT.BinaryInsertion;

/**
 * We can use binary search to reduce the number of comparisons in normal
 * insertion sort. Binary Insertion Sort uses binary search to find the proper
 * location to insert the selected item at each iteration.
 * In normal insertion sort, it takes O(n) comparisons (at nth iteration) in the
 * worst case. We can reduce it to O(log n) by using binary search.
 */

public class BinaryInsertionSort {
    /**
     * ASCENDING BINARY INSERTION SORT
     * @param arr               the array that is to be sorted
     * @return                  return the sorted array
     */
    public int[] ascendingBinaryInsertionSort(int[] arr) {
        int i, j, key, position;
        for (i = 1; i < arr.length; ++i) {
            key = arr[i];
            j = i - 1;
            // Ascending Binary Search Algorithm
            position = ascendingBinarySearch(arr, 0, j, key);
            while (j >= position) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    /**
     * DESCENDING BINARY INSERTION SORT
     * @param arr               the array that is to be sorted
     * @return                  return the sorted array
     */
    public int[] descendingBinaryInsertionSort(int[] arr) {
        int i, j, key, position;
        for (i = 1; i < arr.length; ++i) {
            key = arr[i];
            j = i - 1;
            // Descending Binary Search Algorithm
            position = descendingBinarySearch(arr, 0, j, key);
            while (j >= position) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    /**
     * ASCENDING BINARY SEARCH
     * @param arr               the array to be searched
     * @param lo                lower limit
     * @param hi                upper limit
     * @param value             the integer that needs to be searched in the array
     * @return                  return the index
     */
    private int ascendingBinarySearch(int[] arr, int lo, int hi, int value) {
        if (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] < value)
                return ascendingBinarySearch(arr, mid + 1, hi, value);
            return ascendingBinarySearch(arr, lo, mid - 1, value);
        }
        return lo; // ! NOTE: return lo instead of -1 here!
    }

    /**
     * DESCENDING BINARY SEARCH
     * @param arr               the array to be searched
     * @param lo                lower limit
     * @param hi                upper limit
     * @param value             the integer that needs to be searched in the array
     * @return                  return the index
     */
    private int descendingBinarySearch(int[] arr, int lo, int hi, int value) {
        if (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return descendingBinarySearch(arr, mid + 1, hi, value);
            return descendingBinarySearch(arr, lo, mid - 1, value);
        }
        return lo; // ! NOTE: return lo instead of -1 here!
    }

    /**
     *
     * @param arr           the array to be printed
     */
    private void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr1 = { 52, 1, 13, 9, 7, 32 };
        int[] arr2 = arr1.clone();
        BinaryInsertionSort ob = new BinaryInsertionSort();
        int[] ascending = ob.ascendingBinaryInsertionSort(arr1);
        int[] descending = ob.descendingBinaryInsertionSort(arr2);
        ob.printArray(ascending);
        ob.printArray(descending);
    }
}

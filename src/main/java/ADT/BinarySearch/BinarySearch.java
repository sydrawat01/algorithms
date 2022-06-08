package ADT.BinarySearch;

import java.util.*;

public class BinarySearch {
    /**
     *
     * PREREQUISITE: Array must be sorted
     * Recursive binary search algorithm
     * @param arr           the array of integers
     * @param lo            lower limit of the index where to search from
     * @param hi            upper limit of the index where to search from
     * @param value         value to search from the array
     * @return              the index where the element is found
     */
    private int binarySearch(int[] arr, int lo, int hi, int value) {
        if (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] == value)
                return mid;
        if (arr[mid] > value)
            return binarySearch(arr, lo, mid - 1, value);
        return binarySearch(arr, mid + 1, hi, value);
        }
        return -1;
    }

    /**
     *
     * Iterative binary search algorithm
     * @param arr           the array of integers
     * @param key           value to search from the array
     * @return              the index where the element is found
     */
    private int iterativeBinarySearch(int[] arr, int key) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] < key)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] arr = { 12, 3, 40, 17, 29 };
        Arrays.sort(arr);
        int value = 40;
        int result = ob.binarySearch(arr, 0, arr.length - 1, value);
        int iterativeResult = ob.iterativeBinarySearch(arr, value);
        System.out
                .println(result != -1 ? value + " is present at position: " + result : value + " is not present in the array!");
        System.out
                .println(
                        iterativeResult != -1 ? value + " is present at position: " + iterativeResult
                                : value + " is not present in the array!");
    }
}

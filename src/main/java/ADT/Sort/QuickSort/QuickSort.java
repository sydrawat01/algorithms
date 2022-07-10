package ADT.Sort.QuickSort;

import util.Helper;

public class QuickSort<T extends Comparable<T>> {

    /**
     * Method to partition the array based on the pivot
     * @param arr the array to be partitioned
     * @param low the lower index of the array to be partitioned
     * @param high the upper index of the array to be partitioned
     * @return the index of the partition within the array that is to be sorted
     */
    public int partition(T[] arr, int low, int high) {

        int i = low, j = high+1;
        //pivot
        T pivot = arr[low];
        while (true) {
            while (helper.less(arr[++i], pivot)) {
                if (i == high) break;
            }
            while (helper.less(pivot, arr[--j])) {
                if(j == low) break;
            }
            if (i >= j) break;

            helper.swap(arr, i ,j);
        }
        helper.swap(arr, low, j);
        return j;
    }

    /**
     * Method to sort an array using QuickSort
     * @param a the array to be sorted
     * @param low lower index of that array which is to be sorted
     * @param high upper index of that array which is to be sorted
     * @return the sorted array
     */
    public T[] sort(T[] a, int low, int high) {
        if (low < high) {
            int pivot = partition(a, low, high);
            sort(a, low, pivot-1);
            sort(a, pivot+1, high);
        }
        return a;
    }

    final Helper<T> helper = new Helper<>();
}

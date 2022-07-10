package ADT.Sort.InsertionSort;

import util.Helper;

public class InsertionSort<T extends Comparable<T>> {
    /**
     * Insertion Sort implementation
     * @param arr the array that is to be sorted
     * @param from starting index
     * @param to ending index
     * @return the sorted array
     */
    public T[] sort(T[] arr, int from, int to) {
        for(int i = from+1; i<to; i++) {
            for(int j=i;j>from; j--) {
                if(helper.less(arr[j], arr[j-1])){
                    helper.swap(arr, j, j-1);
                } else break;
            }
        }
        return arr;
    }

    /**
     * Insertion sort, but in descending order
     * @param arr the array to be sorted
     * @param from starting index
     * @param to ending index
     * @return the sorted array
     */
    public T[] descendingSort(T[] arr, int from, int to) {
        for(int i=from+1; i<to; i++) {
            for(int j=i; j>from; j--) {
                if(helper.more(arr[j], arr[j-1])) {
                    helper.swap(arr,j, j-1);
                }
            }
        }
        return arr;
    }

    final Helper<T> helper = new Helper<>();
}

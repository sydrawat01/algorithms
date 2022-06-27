package ADT.Sort.InsertionSort;

import util.Helper;

public class InsertionSort {
    /**
     * Insertion Sort implementation
     * @param arr the array that is to be sorted
     * @param from starting index
     * @param to ending index
     * @return the sorted array
     */
    public int[] sort(int[] arr, int from, int to) {
        for(int i = from+1; i<to; i++) {
            for(int j=i;j>from; j--) {
                if(helper.less(arr, j, j-1)){
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
    public int[] descendingSort(int[] arr, int from, int to) {
        for(int i=from+1; i<to; i++) {
            for(int j=i; j>from; j--) {
                if(helper.more(arr, j, j-1)) {
                    helper.swap(arr,j, j-1);
                }
            }
        }
        return arr;
    }

    final Helper helper = new Helper();
}

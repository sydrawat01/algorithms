package ADT.Sort.SelectionSort;

import util.Helper;

public class SelectionSort {
    /**
     * Implement selection sort algorithm
     * @param arr the array to be sorted
     * @return the sorted array
     */
    public int[] sort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            int min = i;
            for(int j=i+1; j<n; j++ ) {
                if(helper.less(arr, j, min)) {
                    min = j;
                }
            }
            helper.swap(arr, min, i);
        }
        return arr;
    }

    final Helper helper = new Helper();
}

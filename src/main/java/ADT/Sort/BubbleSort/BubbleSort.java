package ADT.Sort.BubbleSort;

import util.Helper;

public class BubbleSort {
    /**
     * Implement bubble sort
     * @param arr the array to be sorted
     * @return the sorted array
     */
    public int[] sort(int[] arr) {
        int n = arr.length;
        for(int i=0; i< n-1; i++) {
            for(int j=0; j < n-i-1; j++) {
                if(helper.more(arr,j,j+1)) {
                    helper.swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    final Helper helper = new Helper();
}

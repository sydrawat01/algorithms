package ADT.Sort.MergeSort;

import util.Helper;

public class MergeSort {

    private void merge(int[] a, int left, int mid, int right) {
        //size of the two sub arrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        //temp sub-arrays
        int[] LSubArr = new int[n1];
        int[] RSubArr = new int[n2];

        //Copy data into temp arrays
        for (int i = 0; i < n1; ++i)
            LSubArr[i] = a[left + i];
        for (int j = 0; j < n2; ++j)
            RSubArr[j] = a[mid + 1 + j];

        //MERGE THE SUB-ARRAYS
        // Initial index of the sub arrays
        int i = 0, j = 0;
        //initial index of the merged array
        int k = left;
        while(i < n1 && j < n2) {
            if(LSubArr[i] < RSubArr[j]) {
                a[k] = LSubArr[i];
                i++;
            } else {
                a[k] = RSubArr[j];
                j++;
            }
            k++;
        }
        //copy remaining elements of LSubArr
        while (i < n1) {
            a[k] = LSubArr[i];
            i++;
            k++;
        }
        //copy remaining elements of RSubArr
        while (j < n2) {
            a[k] = RSubArr[j];
            j++;
            k++;
        }
    }

    public int[] sort(int[] a, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // sort the sub arrays
            sort(a, left, mid);
            sort(a, mid + 1, right);
            //merge the arrays
            merge(a, left, mid, right);
        }
        return a;
    }

    final Helper helper = new Helper();
}

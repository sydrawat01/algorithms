package ADT.InsertionSort;

public class InsertionSort {
    /**
     *
     * @param arr           Array to be sorted in ascending order
     * @return              sorted array
     */
    public int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    /**
     *
     * @param arr               Array to be sorted in descending order
     * @return                  sorted array
     */
    public int[] descendingInsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    /**
     *
     * @param arr               Array to be printed
     */
    private void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        InsertionSort ob = new InsertionSort();
        int[] arr = { 12, 11, 13, 5, 6 };
        ob.printArray(ob.insertionSort(arr));
        ob.printArray(ob.descendingInsertionSort(arr));
    }
}

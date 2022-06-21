package ADT.Sort.SelectionSort;

public class SelectionSort {
    public int[] sort(int[] arr) {
        int n = arr.length;
        for(int i=0; i< n-1; i++) {
            int min = i;
            for(int j=i+1; j< n; j++ ) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    private void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int[] arr = { 12, 11, 13, 5, 6 };
        ob.printArray(ob.sort(arr));
    }
}

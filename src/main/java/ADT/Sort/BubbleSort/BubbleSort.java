package ADT.Sort.BubbleSort;

public class BubbleSort {

    public int[] sort(int[] arr) {
        int n = arr.length;
        for(int i=0; i< n-1; i++) {
            for(int j=0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        BubbleSort ob = new BubbleSort();
        int[] arr = { 12, 11, 13, 5, 6 };
        ob.printArray(ob.sort(arr));
    }
}

package ADT.Sort.ShellSort;

public class ShellSort {

    public int[] sort(int[] a) {
        int N = a.length;
        int h = 1;
        if( h < N/3) h = h*3 +1;
        while(h>=1) {
            for(int i=h; i<N; i++) {
                for(int j=i; j>=h; j-=h) {
                    if(a[j] < a[j-h]) {
                        int temp = a[j];
                        a[j] = a[j-h];
                        a[j-h] = temp;
                    } else {
                        break;
                    }
                }
            }
            h /= 3;
        }
        return a;
    }

    private void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        ShellSort ob = new ShellSort();
        int[] arr = { 12, 11, 13, 5, 6 };
        ob.printArray(ob.sort(arr));
    }
}

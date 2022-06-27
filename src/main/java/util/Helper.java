package util;

public class Helper implements HelperAPI {

    public boolean less(int[] a, int x, int y) {
        return a[x] < a[y];
    }

    public boolean more(int[] a, int x, int y) {
        return a[x] > a[y];
    }

    public void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public void printArray(int[] a) {
        System.out.print("[ ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public boolean sorted(int[] a) {
        for (int i = 1; i < a.length; i++) if (more(a, i-1, i)) return false;
        return true;
    }

}

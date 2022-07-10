package util;

public class Helper<T extends Comparable<T>> implements HelperAPI<T> {

    public void swap(T[] a, int x, int y) {
        T temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public boolean less(T x, T y) {
        if(x == y) return false; //optimization when reference is equal
        return x.compareTo(y) < 0;
    }

    public boolean more(T x, T y) {
        return x.compareTo(y) > 0;
    }

    public boolean sorted(T[] a) {
        for (int i = 1; i < a.length; i++) if (more(a[i-1], a[i])) return false;
        return true;
    }

}

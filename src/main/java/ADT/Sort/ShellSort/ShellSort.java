package ADT.Sort.ShellSort;

import util.Helper;

public class ShellSort<T extends Comparable<T>> {

    public T[] sort(T[] a) {
        int N = a.length;
        int h = 1;
        if( h < N/3) h = h*3 +1;
        while(h>=1) {
            for(int i=h; i<N; i++) {
                for(int j=i; j>=h; j-=h) {
                    if(helper.less(a[j], a[j-h])) {
                        helper.swap(a, j, j-h);
                    } else {
                        break;
                    }
                }
            }
            h /= 3;
        }
        return a;
    }

    final Helper<T> helper = new Helper<>();
}

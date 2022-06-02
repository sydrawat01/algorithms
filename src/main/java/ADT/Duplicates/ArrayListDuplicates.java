package ADT.Duplicates;

import java.util.*;

public class ArrayListDuplicates {
    /**
     *
     * Return an ArrayList of duplicates in an ArrayList
     * @param arr           ArrayList og Integers to find the duplicates in
     * @return              An ArrayList of integers that has all the integers that are repeated in arr
     */
    public ArrayList<Integer> printDuplicates(ArrayList<Integer> arr) {
        Set<Integer> s = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : arr) {
            if (!s.add(i))
                result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayListDuplicates ob = new ArrayListDuplicates();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(7);
        arr.add(3);
        arr.add(1);
        arr.add(5);
        System.out.println(ob.printDuplicates(arr));
    }
}

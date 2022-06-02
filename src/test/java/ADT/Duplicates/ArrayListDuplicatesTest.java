package ADT.Duplicates;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayListDuplicatesTest {
    @Test
    public void TestCase1() {
        ArrayListDuplicates ob = new ArrayListDuplicates();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 5, 7, 3, 1, 5));
        ArrayList<Integer> result = ob.printDuplicates(arr);
        assertEquals(new ArrayList<>(Arrays.asList(1,5)), result);
    }

    @Test
    public void TestCase2() {
        ArrayListDuplicates ob = new ArrayListDuplicates();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 7, 7, 3, 2, 5));
        ArrayList<Integer> result = ob.printDuplicates(arr);
        assertEquals(new ArrayList<>(List.of(7)), result);
    }
}

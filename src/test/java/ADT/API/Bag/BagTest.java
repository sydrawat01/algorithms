package ADT.API.Bag;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class BagTest {
    @Test
    public void TestBag() {
        Bag<Integer> bag = new Bag<>();
        assertEquals(0, bag.size());
        assertTrue(bag.isEmpty());
        assertFalse((bag.iterator()).hasNext());
        bag.add(1);
        assertEquals(1, bag.size());
        assertFalse(bag.isEmpty());
        assertTrue(( bag.iterator()).hasNext());
        assertEquals(new Integer(1), bag.iterator().next());
    }
}

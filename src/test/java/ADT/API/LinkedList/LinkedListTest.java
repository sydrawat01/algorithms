package ADT.API.LinkedList;

import ADT.API.APIException;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class LinkedListTest {
    @Test
    public void TestCase1() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        LinkedList<Integer> res = new LinkedList<>();
        res.add(3);
        res.add(2);
        res.add(1);
        assertEquals(res, ll);
    }

    @Test
    public void TestCase2() throws APIException {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.delete(1);
        LinkedList<Integer> res = new LinkedList<>();
        res.add(3);
        res.add(2);
        res.add(1);
        Integer x = res.remove();
        assertEquals(res, ll);
    }

    @Test
    public void TestCase3() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(7);
        ll.insert(19);
        ll.insert(5);
        ll.insert(17);
        ll.insert(8);
        assertTrue(ll.search(ll.getHead(), 17));
    }

    @Test
    public void TestCase4() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        assertEquals(6, ll.size(ll.getHead()));
    }

    @Test
    public void TestCase5() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(7);
        ll.insert(19);
        ll.insert(5);
        ll.insert(17);
        assertEquals((Integer)7, ll.middle(ll.getHead()));
    }

    @Test
    public void TestCase6() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(7);
        ll.insert(19);
        ll.insert(5);
        ll.insert(17);
        ll.insert(8);
        assertEquals((Integer)19, ll.middle(ll.getHead()));
    }

    @Test
    public void TestCase7() {
        LinkedList<Integer> ll = new LinkedList<>();
        assertTrue(ll.isEmpty());
    }

    @Test
    public void TestCase8() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        assertFalse(ll.isEmpty());
    }

    @Test
    public void TestCase9() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.getHead().next.next.next = ll.getHead();
        assertTrue(ll.cycle(ll.getHead()));
    }

    /**
     * Test method for LinkedList
     */
    @Test
    public void testLinkedList1() throws APIException {
        LinkedList<Integer> list = new LinkedList<>();
        assertTrue(list.isEmpty());
        list.add(1);
        assertEquals(new Integer(1), list.top());
        assertFalse(list.isEmpty());
        assertEquals(new Integer(1), list.remove());
    }

    /**
     * Test method for LinkedList
     */
    @Test
    public void testLinkedList2() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        Iterator<Integer> iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(new Integer(1), iterator.next());
        assertFalse(iterator.hasNext());
    }
}

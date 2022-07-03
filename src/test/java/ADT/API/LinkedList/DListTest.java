package ADT.API.LinkedList;


import ADT.API.APIException;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class DListTest {

    @Test
    public void testDList0() {
        DList<Integer> list = new DList<>();
        assertTrue(list.isEmpty());
        assertEquals(list.size(), 0);
        assertFalse(list.iterator().hasNext());
        assertTrue(list.isEmpty());
    }

    @Test
    public void testDList1() {
        DList<Integer> list = new DList<>();
        list.addBeforeNode(1, null);
        assertFalse(list.isEmpty());
        assertEquals(list.size(), 1);
        Iterator<Integer> datas = list.iterator();
        assertTrue(datas.hasNext());
        assertEquals(datas.next(), new Integer(1));
    }

    @Test
    public void testDList2() {
        DList<Integer> list = new DList<>(1);
        assertFalse(list.isEmpty());
        assertEquals(list.size(), 1);
        Iterator<Integer> datas = list.iterator();
        assertTrue(datas.hasNext());
        assertEquals(datas.next(), new Integer(1));
    }

    @Test
    public void testDList3() {
        DList<Integer> list = new DList<>();
        list.addBeforeNode(1, null);
        assertFalse(list.isEmpty());
        assertEquals(list.toString(), "1, ");
        DList<Integer>.Node first = list.findFirst(1);
        assertEquals(first.data, new Integer(1));
        list.remove(first);
        assertEquals(list.size(), 0);
    }

    @Test
    public void testDList4() throws APIException {
        DList<Integer> list = new DList<>(1);
        list.remove(1);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testDList5() {
        DList<Integer> list = new DList<>();
        list.addBeforeNode(1, null);
        assertFalse(list.isEmpty());
        DList<Integer>.Node first = list.findFirst(1);
        assertEquals(first.data, new Integer(1));
        list.addAfterNode(2, first);
        assertEquals(list.toString(), "1, 2, ");
        assertEquals(list.size(), 2);
    }

    @Test
    public void testDList6() {
        DList<Integer> list = new DList<>();
        list.addBeforeNode(1, null);
        assertFalse(list.isEmpty());
        DList<Integer>.Node first = list.findLast(1);
        assertEquals(first.data, new Integer(1));
        list.addAfterNode(2, first);
        assertEquals(list.toString(), "1, 2, ");
        assertEquals(list.size(), 2);
    }

    @Test
    public void testDList7() throws APIException {
        DList<Integer> list = new DList<>(1);
        list.addAfter(2, 1);
        assertEquals(list.toString(), "1, 2, ");
        assertEquals(list.size(), 2);
    }

    @Test
    public void testDList8() throws APIException {
        DList<Integer> list = new DList<>(1);
        list.addAfter(2, 1);
        list.addAfter(3, 2);
        list.addAfter(4,3);
        DList<Integer>.Node last = list.findLast(4);
        assertEquals(last.data, new Integer(4));
        assertEquals(list.toString(), "1, 2, 3, 4, ");
        assertEquals(list.size(), 4);
        list.remove(last);
        assertEquals(list.size(), 3);
        assertEquals(list.toString(), "1, 2, 3, ");
    }

    @Test
    public void testDList9() throws APIException {
        DList<Integer> list = new DList<>(1);
        list.addAfter(2, 1);
        list.addAfter(3, 2);
        list.addAfter(4,3);
        DList<Integer>.Node second = list.findFirst(2);
        list.remove(second);
        assertEquals(list.toString(), "1, 3, 4, ");
    }

    @Test
    public void  testDList10() throws APIException {
        DList<Integer> list = new DList<>(2);
        list.addBefore(1,2);
        assertEquals(list.toString(), "1, 2, ");
    }

    @Test
    public void testDList11() throws APIException {
        DList<Integer> list = new DList<>(1);
        list.addAfter(2,1);
        list.addAfter(3,2);
        list.addAfter(4,3);
        list.remove(list.findLast(3));
        assertEquals(list.toString(), "1, 2, 4, ");
    }

    @Test
    public void testDList12() throws APIException {
        DList<Integer> list = new DList<>(1);
        list.addAfter(2, 1);
        list.addAfter(3,2);
        list.addAfter(4,3);
        list.remove(list.findLast(1));
        list.remove(list.findFirst(4));
        list.remove(list.findFirst(2));
        list.remove(list.findFirst(3));
        assertTrue(list.isEmpty());
    }

    @Test
    public void testDList13() throws APIException {
        DList<Integer> list = new DList<>(1);
        list.addAfter(2,1);
        list.addAfter(3,2);
        list.addAfter(4,2);
        list.remove(1);
        list.remove(2);
        System.out.println(list.toString());
    }
}

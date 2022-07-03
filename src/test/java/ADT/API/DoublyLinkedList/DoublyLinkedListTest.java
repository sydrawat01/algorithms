package ADT.API.DoublyLinkedList;

import ADT.API.APIException;

import org.junit.Test;
import java.util.Iterator;
import static org.junit.Assert.*;

public class DoublyLinkedListTest {
    @Test
    public void testDList0() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertTrue(list.isEmpty());
        assertEquals(list.size(), 0);
        assertFalse(list.iterator().hasNext());
        assertTrue(list.isEmpty());
    }

    @Test
    public void testDList1() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addBeforeNode(1, null);
        assertFalse(list.isEmpty());
        assertEquals(list.size(), 1);
        Iterator<Integer> datas = list.iterator();
        assertTrue(datas.hasNext());
        assertEquals(datas.next(), new Integer(1));
    }

    @Test
    public void testDList2() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1);
        assertFalse(list.isEmpty());
        assertEquals(list.size(), 1);
        Iterator<Integer> datas = list.iterator();
        assertTrue(datas.hasNext());
        assertEquals(datas.next(), new Integer(1));
    }

    @Test
    public void testDList3() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addBeforeNode(1, null);
        assertFalse(list.isEmpty());
        assertEquals(list.toString(), "1, ");
        Node<Integer> first = list.findFirst(1);
        assertEquals(first.data, new Integer(1));
        list.remove(first);
        assertEquals(list.size(), 0);
    }

    @Test
    public void testDList4() throws APIException {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1);
        list.remove(list.findLast(1));
        assertTrue(list.isEmpty());
    }

    @Test
    public void testDList5() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addBeforeNode(1, null);
        assertFalse(list.isEmpty());
        Node<Integer> first = list.findFirst(1);
        assertEquals(first.data, new Integer(1));
        list.addAfterNode(2, first);
        assertEquals(list.toString(), "1, 2, ");
        assertEquals(list.size(), 2);
    }

    @Test
    public void testDList6() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addBeforeNode(1, null);
        assertFalse(list.isEmpty());
        Node<Integer> first = list.findLast(1);
        assertEquals(first.data, new Integer(1));
        list.addAfterNode(2, first);
        assertEquals(list.toString(), "1, 2, ");
        assertEquals(list.size(), 2);
    }

    @Test
    public void testDList7() throws APIException {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1);
        list.addAfter(2, 1);
        assertEquals(list.toString(), "1, 2, ");
        assertEquals(list.size(), 2);
    }

    @Test
    public void testDList8() throws APIException {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1);
        list.addAfter(2, 1);
        list.addAfter(3, 2);
        list.addAfter(4,3);
        Node<Integer> last = list.findLast(4);
        assertEquals(last.data, new Integer(4));
        assertEquals(list.toString(), "1, 2, 3, 4, ");
        assertEquals(list.size(), 4);
        list.remove(last);
        assertEquals(list.size(), 3);
        assertEquals(list.toString(), "1, 2, 3, ");
    }

    @Test
    public void testDList9() throws APIException {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1);
        list.addAfter(2, 1);
        list.addAfter(3, 2);
        list.addAfter(4,3);
        Node<Integer> second = list.findFirst(2);
        list.remove(second);
        assertEquals(list.toString(), "1, 3, 4, ");
    }

    @Test
    public void  testDList10() throws APIException {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>(2);
        list.addBefore(1,2);
        assertEquals(list.toString(), "1, 2, ");
    }

    @Test
    public void testDList11() throws APIException {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1);
        list.addAfter(2,1);
        list.addAfter(3,2);
        list.addAfter(4,3);
        list.remove(list.findLast(3));
        assertEquals(list.toString(), "1, 2, 4, ");
    }

    @Test
    public void testDList12() throws APIException {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1);
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
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1);
        list.addAfter(2,1);
        list.addAfter(3,2);
        list.addAfter(4,2);
        list.remove(1);
        list.remove(2);
        System.out.println(list.toString());
    }
}

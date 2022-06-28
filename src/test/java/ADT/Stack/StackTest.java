package ADT.Stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StackTest {
    @Test
    public void TestCase1() {
        Stack s = new Stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        assertEquals(5, s.size());
    }

    @Test
    public void TestCase2() {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();
        assertEquals(5, s.peek());
    }

    @Test
    public void TestCase3() {
        Stack s = new Stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.pop();
        s.pop();
        s.pop();
        s.push(6);
        assertEquals(3, s.size());
    }

    @Test
    public void TestCase4() {
        Stack s = new Stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.pop();
        s.pop();
        s.pop();
        assertFalse(s.isEmpty());
    }
}

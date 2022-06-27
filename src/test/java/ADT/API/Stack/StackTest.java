package ADT.API.Stack;

import ADT.API.APIException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class StackTest {
    @Test
    public void TestCase1() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
    }

    @Test
    public void TestCase2() throws APIException {
        Stack<Integer> stack = new Stack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        Integer item = stack.pop();
        assertEquals(item, new Integer(1));
    }
}

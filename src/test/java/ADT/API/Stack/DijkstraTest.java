package ADT.API.Stack;

import ADT.API.APIException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DijkstraTest {
    @Test
    public void TestCase1() throws APIException {
        DijkstraTwoStack twoStack = new DijkstraTwoStack("2 * ( 4 - 3 )");
        assertEquals(2, twoStack.evaluate());
    }

    @Test
    public void TestCase2() throws APIException {
        DijkstraTwoStack twoStack = new DijkstraTwoStack("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )");
        assertEquals(101, twoStack.evaluate());
    }

    @Test
    public void TestCase3() throws APIException {
        DijkstraTwoStack twoStack = new DijkstraTwoStack("( 1 + ( ( 2 ^ 3 ) * ( 4 * 5 ) ) )");
        assertEquals(161, twoStack.evaluate());
    }

    @Test
    public void TestCase4() throws APIException {
        DijkstraTwoStack twoStack = new DijkstraTwoStack("( 1 + ( ( 10 % 3 ) * ( 4 * 5 ) ) )");
        assertEquals(21, twoStack.evaluate());
    }

    /**
     * Test method for Stack
     */
    @Test
    public void testTwoStack() throws APIException {
        assertEquals(1, new DijkstraTwoStack("1").evaluate());
        assertEquals(3, new DijkstraTwoStack("1 + 2").evaluate());
        assertEquals(14, new DijkstraTwoStack("2 * ( 4 + 3 )").evaluate());
        assertEquals(2, new DijkstraTwoStack("2 * ( 4 - 3 )").evaluate());
        assertEquals(101, new DijkstraTwoStack("1 + ( ( 2 + 3 ) * ( 4 * 5 ) )").evaluate());
    }

    /**
     * Test method for Stack
     */
    @Test(expected = APIException.class)
    public void testTwoStackFail1() throws APIException {
        new DijkstraTwoStack("").evaluate();
    }


    /**
     * Test method for Stack
     */
    @Test(expected = APIException.class)
    public void testTwoStackFail2() throws APIException {
        new DijkstraTwoStack("(").evaluate();
    }

    /**
     * Test method for Stack
     */
    @Test(expected = APIException.class)
    public void testTwoStackFail3() throws APIException {
        new DijkstraTwoStack(")").evaluate();
    }

    /**
     * Test method for Stack
     */
    @Test(expected = ArithmeticException.class)
    public void testTwoStackFail4() throws APIException {
        new DijkstraTwoStack("1 / 0").evaluate();
    }
}

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
}

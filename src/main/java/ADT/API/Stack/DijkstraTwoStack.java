package ADT.API.Stack;

import ADT.API.APIException;

import java.util.StringTokenizer;

public class DijkstraTwoStack {
    private final StringTokenizer tokenizer;
    private int parenthesis = 0;
    private final StackAPI<String> opStack = new Stack<>();
    private final StackAPI<Number> valStack = new Stack<>();

    DijkstraTwoStack(String infix) {
        tokenizer = new StringTokenizer(infix);
    }

    public Number evaluate() throws APIException {
        while (tokenizer.hasMoreTokens())
            processTokens(tokenizer.nextToken());
        if (parenthesis != 0)
            throw new APIException("Parenthesis are not balanced!");
        while (!opStack.isEmpty()) operate();
        Number result = valStack.pop();
        if (!valStack.isEmpty())
            throw new APIException("There are extra values in your expression!");
        return result;
    }

    private void processTokens(String nextToken) throws APIException {
        if (nextToken.equals("("))
            parenthesis++;
        else if (nextToken.equals(")")) {
            parenthesis--;
            operate();
        }
        else if ("+-/*%^".contains(nextToken))
            opStack.push(nextToken);
        else {
            Number n = Integer.parseInt(nextToken);
            valStack.push(n);
        }
    }

    private void operate() throws APIException {
        Integer y = (Integer) valStack.pop();
        Integer x = (Integer) valStack.pop();
        switch(opStack.pop()) {
            case "+" -> valStack.push(x + y);
            case "-" -> valStack.push(x - y);
            case "*" -> valStack.push(x*y);
            case "/" -> valStack.push(x / y);
            case "%" -> valStack.push(x % y);
            case "^" -> {
                Integer temp = x;
                while (y > 1) {
                    x *= temp;
                    y--;
                }
                valStack.push(x);
            }
            default -> throw new APIException("Operator not recognized!");
        }
    }

    public static void main(String[] args) {
        try {
            DijkstraTwoStack twoStack = new DijkstraTwoStack("2 * ( 4 - 3 )");
            System.out.println(twoStack.evaluate());
        } catch(APIException e) {
            e.printStackTrace();
        }
    }
}

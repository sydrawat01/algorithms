package ADT.API;

public class LLTest {

    private static void show(LinkedList<Integer> ll) {
        for (Integer integer : ll) {
            System.out.print(integer + " -> ");
        }
        System.out.println(ll.isEmpty() ? "" : "null");
    }

    public static void main(String[] args) throws APIException {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        System.out.println(ll.middle(ll.getHead()));
        show(ll);
    }
}

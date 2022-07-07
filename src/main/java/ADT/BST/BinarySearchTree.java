package ADT.BST;

public class BinarySearchTree {
    //FIXME: Implementation pending
    class Node {
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    public BinarySearchTree() { root = null; }

    public BinarySearchTree(int value) { root = new Node(value); }

    private final Node root;
}

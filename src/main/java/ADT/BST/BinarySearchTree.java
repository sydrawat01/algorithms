package ADT.BST;

import util.Helper;
import java.util.*;

public class BinarySearchTree<Key extends Comparable<Key>, Value> implements BST<Key, Value> {

    /*================================================
                         SEARCH
     ================================================
     */
    public Value get(Key key) {
        Node x = getNode(key);
        if (x!=null)
            return x.value;
        return null;
    }

    private Node getNode(Key key) {
        Node x = root;
        while (x!=null) {
            if (helper.less(key, x.key))
                x = x.left;
            else if (helper.more(key, x.key))
                x= x.right;
            else
                return x;
        }
        return null;
    }

    /*================================================
                        INSERTION
     ================================================
     */

    public void put(Key key,Value value) {
        root = put(root, key, value);
    }

    private Node put(Node x, Key key, Value value) {
        if (x==null) return new Node(key, value, null, null, 1);
        if(helper.less(key, x.key))
            x.left = put(x.left, key, value);
        else if (helper.more(key, x.key))
            x.right = put(x.right, key, value);
        else
            x.value = value;
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    /*================================================
                         DELETION
     ================================================
     */

    public void delete(Key key) {
        root = delete(root, key);
    }

    private Node delete(Node x, Key key) {
        //FIXME: Hibbard delete implementation
        if (x==null) return null;
        if (helper.less(key, x.key))
            x.left = delete(x.left, key);
        else if (helper.more(key,x.key))
            x.right = delete(x.right, key);
        else {
            if (x.right == null) return x.left;
            if (x.left == null) return x.right;

            Node t = x;
            //FIXME
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        return x;
    }

    /*================================================
                           FLOOR
     ================================================
     */

    public Key floor(Key key) {
        Node x = floor(root, key);
        if (x==null) return null;
        return x.key;
    }

    private Node floor(Node x, Key key) {
        if (x==null) return null;
        if (helper.equal(key, x.key))
            return x;
        if (helper.less(key, x.key))
            return floor(x.left, key);

        Node t = floor(x.right, key);
        if (t!=null)
            return t;
        else
            return x;
    }

    /*================================================
                         CEILING
     ================================================
     */

    public Key ceiling(Key key) {
        Node x = ceiling(root, key);
        if (x==null) return null;
        return x.key;
    }

    private Node ceiling(Node x, Key key) {
        //FIXME: Wrong output
        if (x==null) return null;
        if (helper.equal(key, x.key))
            return x;
        if (helper.less(key, x.key))
            return ceiling(x.right, key);

        Node t = ceiling(x.left, key);
        if (t!=null)
            return t;
        else
            return x;
    }

    /*================================================
                            RANK
     ================================================
     */
    public int rank(Key key) {
        return rank(root, key);
    }

    private int rank(Node x, Key key) {
        if(x==null) return 0;
        if (helper.less(key, x.key))
            rank(x.left, key);
        if (helper.more(key, x.key))
            return 1 + size(x.left) + rank(x.right, key);
        else
            return size(x.left);
    }

    /*================================================
                          SELECT
     ================================================
     */
    public Key select(int k) {
        if (k<0 || k>=size()) return null;
        Node x = select(root, k);
        return x.key;
    }

    private Node select(Node x, int k) {
        if (x==null) return null;
        int t = size(x.left);
        if (t > k)
            return select(x.left, k);
        else if (t < k)
            return select(x.right, k);
        else // if (t==k)
            return x;
    }

    /*================================================
                         SIZE
     ================================================
     */
    public int size() {
        if (root==null)
            return 0;
        return root.size;
    }

    public int size(Node x) {
        if (x==null)
            return 0;
        return x.size;
    }

    /**
     * Check if the BST is empty
     * @return true if BST is empty, false otherwise
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Function to find the min of {@code x} node
     * @param x the node whose min node is to be found
     * @return the min node
     */
    private Node min(Node x) {
        if (x==null) throw new RuntimeException("min not implemented for null");
        else if (x.left==null) return x;
        else return min(x.left);
    }

    /**
     * Function to find the max of {@code x} node
     * @param x the node whose max node is to be found
     * @return the max node
     */
    private Node max(Node x) {
        if(x==null) throw new RuntimeException("max not implemented for null");
        else if (x.right==null) return x;
        else  return max(x.right);
    }

    /*================================================
                       DELETE MIN
     ================================================
     */
    public void deleteMin() {
        root = deleteMin(root);
    }

    private Node deleteMin(Node x) {
        if (x.left == null) return x.right;
        x.left = deleteMin(x.left);
        x.size = 1 + size(x.left) + size(x.right);
        return x;
    }

    /*================================================
                       DELETE MAX
     ================================================
     */
    public void deleteMax() {
        //FIXME
    }

    private Node deleteMax(Node x) {
        //FIXME
        return x;
    }

    /**
     * Function to get the root of the tree
     * @return root of the BST
     */
    private Node getRoot() {
        return root;
    }

    /*================================================
                     INORDER TRAVERSAL
     ================================================
     */
    public void traverse(Node x) {
        if (x==null) return;
        traverse(x.left);
        System.out.print(x.key + " ");
        traverse(x.right);
    }

    public class Node {
        public Node(Key key, Value value, Node left, Node right, int size) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
            this.size = size;
        }

        private final Key key;
        private Value value;
        private Node left;
        private Node right;
        private int size;
    }

    public BinarySearchTree() {}

    public BinarySearchTree(Map<Key, Value> map) {
        this();
        putAll(map);
    }

    public void putAll(Map<Key, Value> map) {
        List<Key> ks = new ArrayList<>(map.keySet());
        Collections.shuffle(ks);
        for (Key k : ks) put(k, map.get(k));
    }

    private Node root;
    private final Helper<Key> helper = new Helper<Key>();

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("S", 19);
        map.put("E", 5);
        map.put("X", 24);
        map.put("A", 1);
        map.put("R", 18);
        map.put("C", 3);
        map.put("H",8);
        map.put("M", 13);
        BinarySearchTree<String, Integer> bst = new BinarySearchTree<>();
        bst.putAll(map);
//        System.out.println(bst.get("A"));
//        bst.delete("E");
//        System.out.println(bst.rank("E"));
//        System.out.println(bst.select(2));
        System.out.println("Floor of G: " + bst.floor("G"));
        System.out.println("Floor of D: " + bst.floor("D"));
        //FIXME: Ceiling of Q should be R
        System.out.println("Ceiling of Q: " + bst.ceiling("Q"));
        bst.traverse(bst.getRoot());
    }
}

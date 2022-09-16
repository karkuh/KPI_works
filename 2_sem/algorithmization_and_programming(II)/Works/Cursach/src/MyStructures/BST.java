package MyStructures;

import java.util.NoSuchElementException;

public class BST<Key extends Comparable<Key>, Value> {

    private Node root;

    public boolean isEmpty() {
        return size() == 0;
    }//метод для перевірки на пустоту

    public int size() {
        return size(root);
    }//метод для виведення розміру дерева

    private int size(Node x) {
        if (x == null) return 0;
        else return x.size;
    }

    public void put(Key key, Value val) {//метод для добавлення ключа і значення
        if (key == null) throw new NullPointerException("first argument to put() is null");
        if (val == null) {
            delete(key);
            return;
        }
        root = put(root, key, val);
    }

    private Node put(Node x, Key key, Value value) {
        if (x == null) return new Node(key, value, 1);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = put(x.left, key, value);
        else if (cmp > 0) x.right = put(x.right, key, value);
        else x.value = value;
        x.size = 1 + size(x.left) + size(x.right);
        return x;
    }


    public Key select(int k) {//метод для звертання до ключа
        if (k < 0 || k >= size()) throw new IllegalArgumentException("argument to select() is bigger than size or < 0");
        Node x = select(root, k);
        return x.key;
    }

    private Node select(Node x, int k) {
        if (x == null) return null;
        int t = size(x.left);
        if (t > k) return select(x.left,  k);
        else if (t < k) return select(x.right, k-t-1);
        else return x;
    }

    public Value get(Key key){//метод який повертання значення за ключем
        return get(root,key);
    }

    private Value get(Node x , Key key){
        if(x==null) return null;
        int cmp = key.compareTo(x.key);
        if(cmp<0) return get(x.left,key);
        else if(cmp >0) return get(x.right,key);
        else return x.value;
    }

    public Key min() {//метод для звертання до мінімального ключа
        if (isEmpty()) throw new NoSuchElementException("called min() with empty symbol table");
        return min(root).key;
    }

    private Node min(Node x) {
        if (x.left == null) return x;
        else return min(x.left);
    }

    public Key max() {//метод для звертання до максимального ключа
        if (isEmpty()) throw new NoSuchElementException("called max() with empty symbol table");
        return max(root).key;
    }

    private Node max(Node x) {
        if (x.right == null) return x;
        else return max(x.right);
    }

    public void deleteMin() {//видалення мінімального елементу
        if (isEmpty()) throw new NoSuchElementException("MyStructures.BST underflow");
        root = deleteMin(root);
    }


    private Node deleteMin(Node x) {
        if (x.left == null) return x.right;
        x.left = deleteMin(x.left);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    public void deleteMax() {//видалення максимального елементу
        if (isEmpty()) throw new NoSuchElementException("MyStructures.BST underflow");
        root = deleteMax(root);
    }

    private Node deleteMax(Node x) {
        if (x.right == null) return x.left;
        x.right = deleteMax(x.right);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    public void delete(Key key) {//метод для виведення ключа
        if (key == null) throw new NullPointerException("argument to delete() is null");
        root = delete(root, key);
    }

    private Node delete(Node x, Key key) {
        if (x == null) return null;

        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left  = delete(x.left,  key);
        else if (cmp > 0) x.right = delete(x.right, key);
        else {
            if (x.right == null) return x.left;
            if (x.left  == null) return x.right;
            Node t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    public Iterable<Key> keys() {//метод для виведення ключів дерева
        return keys(min(), max());
    }

    public Iterable<Key> keys(Key lo, Key hi) {
        if (lo == null) throw new NullPointerException("first argument to keys() is null");
        if (hi == null) throw new NullPointerException("second argument to keys() is null");

        Queue<Key> queue = new Queue<Key>();
        keys(root, queue, lo, hi);
        return queue;
    }

    private void keys(Node x, Queue<Key> queue, Key lo, Key hi) {
        if (x == null) return;
        int cmplo = lo.compareTo(x.key);
        int cmphi = hi.compareTo(x.key);
        if (cmplo < 0) keys(x.left, queue, lo, hi);
        if (cmplo <= 0 && cmphi >= 0) queue.enqueue(x.key);
        if (cmphi > 0) keys(x.right, queue, lo, hi);
    }


    private class Node {
        private Key key;
        private Value value;
        private Node left, right;
        private int size;

        public Node(Key key, Value value, int size) {
            this.key = key;
            this.value = value;
            this.size = size;
        }
    }

}
package MyStructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<E> implements Iterable<E> {


    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size;

    public Queue() {
        lastNode = new Node<>(null, null);
        firstNode = new Node<>(null, null);
        size = 0;
    }

    public void enqueue(E item) {

        Node<E> oldLast = lastNode;
        lastNode = new Node(item, null);
        if (isEmpty()) firstNode = lastNode;
        else oldLast.next = lastNode;

        size++;

    }

    public E dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        E item = firstNode.getElem();
        firstNode = firstNode.next;
        size--;
        if (isEmpty()) lastNode = null;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }


    @Override
    public String toString() {

        if (size == 0) return "Queue is clear";
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node<E> current = firstNode;

        while (current != null) {
            sb.append(current.getElem());
            current = current.next;
            if (current != null) sb.append(", ");
        }

        sb.append("]");
        return sb.toString();
    }


    private class Node<E> {


        private E elem;
        private Node<E> next;


        private Node(E elem, Node<E> next) {
            this.elem = elem;

            this.next = next;
        }

        public E getElem() {
            return elem;
        }

        public void setElem(E elem) {
            this.elem = elem;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }


    }


    @Override
    public Iterator<E> iterator() {
        return new QueueIterator(firstNode);
    }

    private class QueueIterator implements Iterator<E> {
        private Node<E> current;

        public QueueIterator(Node<E> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public E next() {
            if (!hasNext()) throw new NoSuchElementException();
            E item = current.elem;
            current = current.next;
            return item;
        }
    }

}

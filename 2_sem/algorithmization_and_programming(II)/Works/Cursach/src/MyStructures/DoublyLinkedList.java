package MyStructures;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class DoublyLinkedList<E> implements Iterable<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public DoublyLinkedList() {

        lastNode = new Node<E>(null, firstNode, null);
        firstNode = new Node<E>(null, null, lastNode);
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E e) {
        Node<E> next = firstNode;
        next.setElem(e);
        firstNode = new Node<>(null, null, next);
        next.setPrev(firstNode);
        size++;
    }

    public void addLast(E e) {
        Node<E> prev = lastNode;
        prev.setElem(e);
        lastNode = new Node<E>(null, prev, null);
        prev.setNext(lastNode);
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException("List is clear");
        firstNode = firstNode.getNext();
        size--;

    }

    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException("List is clear");
        lastNode = lastNode.getPrev();
        size--;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) throw new NoSuchElementException("No element index");
        if (index == 0) {
            removeFirst();

        } else if (index == size() - 1) {
            removeLast();

        } else {

            Node<E> temp = firstNode.getNext();
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node<E> temp2 = temp.next;
            temp.setNext(temp2.next);
            temp2.next.setPrev(temp);
            temp2.setElem(null);
            size--;

        }

    }

    public void clear() {
        size = 0;
        lastNode = new Node<E>(null, firstNode, null);
        firstNode = new Node<E>(null, null, lastNode);

    }

    public E get(int index) {

        if (index < 0 || index >= size) throw new NoSuchElementException("No element index");
        Node<E> temp = firstNode.getNext();
        for (int i = 0; i < index; i++) {
            temp = getNext(temp);
        }
        return temp.getElem();
    }

    public void set(int index, E value) {
        if (index < 0 || index >= size) throw new NoSuchElementException("No element index");
        Node<E> temp = firstNode.getNext();
        for (int i = 0; i < index; i++) {
            temp = getNext(temp);
        }
        temp.setElem(value);
    }

    public int indexOf(E elem) {
        Node<E> temp = firstNode.getNext();
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elem.toString().equals(temp.getElem().toString())) {
                index = i;
                break;
            }
            temp = getNext(temp);
        }

        if (index == -1) throw new NoSuchElementException("No element index");
        return index;
    }

    @Override
    public String toString() {//Перевизначимо метод toString

        if (size == 0) return "List is clear";
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node<E> current = firstNode.getNext();

        while (current != null) {

            sb.append(current.getElem());
            if (current.next == lastNode) {
                break;
            }
            current = current.next;
            if (current != null) sb.append(", ");
        }

        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return get(counter++);
            }
        };
    }

    private Node<E> getNext(Node<E> current) {
        return current.getNext();
    }

    private class Node<E> {

        private E elem;
        private Node<E> prev;
        private Node<E> next;

        private Node(E elem, Node<E> prev, Node<E> next) {
            this.elem = elem;
            this.prev = prev;
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

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }


    }
}
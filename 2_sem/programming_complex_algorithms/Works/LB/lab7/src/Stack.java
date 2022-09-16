import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<T> implements Iterable<T> {

    private Node<T> firstNode;
    private int size = 0;

    public Stack() {//створимо конструктор
        firstNode = new Node<T>(null, null);
    }

    public int size() {//повертає розмір стека
        return size;
    }

    public T pop() {//Повертає елемент, що знаходиться у верхній частині стека, видаляючи його у процесі
        if (isEmpty()) throw new NoSuchElementException("Stack is empty");
        T removeElem = firstNode.getNext().getElem();
        firstNode.setElem(null);
        firstNode = getNext(firstNode);
        size--;
        return removeElem;
    }

    public T peek() {
        return firstNode.getNext().getElem();//Повертає елемент, що знаходиться у верхній частині стека, але не видаляє його.
    }

    public T push(T elem) {//додає елемент у стек

        Node<T> next = firstNode;
        next.setElem(elem);
        firstNode = new Node<>(null, next);
        size++;
        return elem;
    }

    public T get(int index) {//повертає елемент за індексом
        Node<T> temp = firstNode.getNext();
        for (int i = 0; i < index; i++) {
            temp = getNext(temp);
        }

        return temp.getElem();
    }

    public int search(T element) {//повертає індекс елемента у стеку
        int index = -1;
        Node<T> temp = firstNode.getNext();
        for (int i = 0; i < size(); i++) {
            if (temp.getElem() == element) {
                index = i;
                break;
            }
            temp = getNext(temp);
        }
        return index;
    }

    public boolean isEmpty() {//перевіряє чи стек пустий
        return size == 0;
    }

    @Override
    public String toString() {// Перевизначимо метод toString

        if (size == 0) return "Stack is clear";
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node<T> current = firstNode.getNext();
        while (current != null) {

            if (current.getElem() == null) {
                current = getNext(current);
                continue;
            }

            sb.append(current.getElem());
            if (current.next == null) {
                break;
            }
            current = current.next;

            if (current != null) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    private Node<T> getNext(Node<T> current) {
        return current.getNext();
    }

    private class Node<T> {

        private T elem;
        private Node<T> next;

        private Node(T elem, Node<T> next) {//створимо конструктор
            this.elem = elem;
            this.next = next;
        }

        public T getElem() {//створимо сетери і гетери
            return elem;
        }

        public void setElem(T elem) {
            this.elem = elem;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

    }

    @Override
    public Iterator<T> iterator() {//створимо ітератор
        return new Iterator() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public Object next() {
                return get(counter++);
            }
        };
    }
}

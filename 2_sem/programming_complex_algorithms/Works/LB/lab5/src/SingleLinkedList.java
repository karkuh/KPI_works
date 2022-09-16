import java.util.Iterator;
import java.util.NoSuchElementException;

public class SingleLinkedList<E> implements Iterable<E> {



    private Node<E> firstNode;
    private int size = 0;

    public SingleLinkedList() {//конструктор
        firstNode = new Node<E>(null, null);
    }

    public void clear() {//метод для очищення списку
        size = 0;
        firstNode = new Node<E>(null, null);

    }

    public void addFirst(E e) {//метод для додавання елементу до списку у початок
        Node<E> next = firstNode;
        next.setElem(e);
        firstNode = new Node<>(null, next);

        size++;
    }

    public void removeFirst() {//метод для видалення першого елементу списку
        if (isEmpty()) throw new NoSuchElementException("List is clear");

        firstNode = getNext(firstNode);
        firstNode.setElem(null);
        //firstNode = getNext(firstNode);
        size--;
    }


    public void remove(int index) {//метод для видалення елементу списку за індексом
        if (index < 0 || index >= size) throw new NoSuchElementException("No element index");
        if (index == 0) {
            removeFirst();

        } else {

            Node<E> temp = firstNode.getNext();
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node<E> temp2 = temp.next;
            temp.setNext(temp2.next);
            temp2.setElem(null);
            size--;

        }

    }

    public E get(int index) {//метод для знаходження елемента списку за заданим індексом
        if (index < 0 || index > size) throw new NoSuchElementException("No element index");
        Node<E> temp = firstNode.getNext();
        for (int i = 0; i < index; i++) {
            temp = getNext(temp);
        }

        return temp.getElem();
    }

    public void set(int index, E elem) {//метод для заміни елемента листа за заданим індексом
        if (index < 0 || index >= size) throw new NoSuchElementException("No element index");
        Node<E> temp = firstNode.getNext();
        for (int i = 0; i < index; i++) {
            temp = getNext(temp);
        }
        temp.setElem(elem);

    }

    public int size() {//метод для виведення розміру
        return size;
    }

    public boolean isEmpty() {//метод для перевірки листа на наявність елементів
        return size == 0;
    }

    public E[] toArray() {//метод для перетворення списку у масив
        int size = size();
        E[] arr = (E[]) new Comparable[size];
        Node<E> current = firstNode.getNext();
        for (int i = 0; i < size; i++) {
            arr[i] = current.getElem();
            current = getNext(current);
        }
        return arr;
    }

    @Override
    public String toString() {//Перевизначимо метод toString для виведення списку

        if (size == 0) return "List is clear";
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node<E> current = firstNode.getNext();
        while (current != null) {

            sb.append(current.getElem());
            current = current.next;
            if (current != null) sb.append(", ");
        }

        sb.append("]");
        return sb.toString();
    }

    private Node<E> getNext(Node<E> current) {
        return current.getNext();
    }

    @Override
    public Iterator iterator() {//визначимо ітератор
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

    private class Node<E> {//створимо клас Node


        private E elem;
        private Node<E> next;


        private Node(E elem, Node<E> next) {//конструктор
            this.elem = elem;
            this.next = next;
        }

        public E getElem() {
            return elem;
        }//гетери і сетери

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
}

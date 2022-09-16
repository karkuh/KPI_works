import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueMas<E> implements Iterable<E> {



    private E[] queue;
    private final int maxSize = 100;
    private int size;
    private int counter = 0;

    public QueueMas() {//конструктор
        queue = (E[]) new Object[100];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addLast(E elem) {//метод для додавання елементу до списку

        if (size == 100) throw new NoSuchElementException("the queue is crowded");
        queue[counter++] = elem;
        size++;
    }

    public void removeFirst() {//метод для видалення першого елементу списку

        E[] data = (E[]) new Object[maxSize];
        for (int i = 1; i < size; i++) {
            data[i - 1] = queue[i];
        }
        queue = data;
        size--;
        this.counter--;
    }


    public void removeByIndex(int index) {//метод для видалення елементу за індексом
        E[] data = (E[]) new Object[maxSize];

        for (int i = 0; i < index; i++) {
            data[i] = queue[i];
        }
        for (int i = index; i < size-1; i++) {
            data[i] = queue[i + 1];
        }
        queue = data;
        size--;
        this.counter--;

    }

    public E get(int index) {//метод для знаходження елемента списку за заданим індексом

        if (index < 0 || index >= size) throw new NoSuchElementException("No element index");
        return queue[index];

    }


    public void print(){
        if (size == 0) {
            System.out.println("Queue is clear");
        }else{
            System.out.print("[");
            for (int i = 0; i < size-1; i++) {
                System.out.print(queue[i] + ", ");
            }
            System.out.println(queue[size-1] + "]");

        }

    }


    @Override
    public Iterator<E> iterator() {//визначимо ітератор
        return new Iterator() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return queue[counter++];
            }
        };
    }
}

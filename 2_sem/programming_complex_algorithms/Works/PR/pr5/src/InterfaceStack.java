

public interface InterfaceStack<T> extends Iterable<T> {
    int size();//метод для виведення розміру стеку

    T pop();//Повертає елемент, що знаходиться у верхній частині стека, видаляючи його у процесі

    T peek();//Повертає елемент, що знаходиться у верхній частині стека, але не видаляє його.

    T push(T elem);//додає елемент у стек

    T get(int index);//повертає елемент за індексом

    int search(T element);//повертає індекс елемента у стеку

    boolean isEmpty();//Перевіряє, чи стек є порожнім.


}

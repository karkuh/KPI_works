import java.util.Scanner;//імпортуємо сканер

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//викликаємо сканер

        System.out.println("Завдання 1 ");
        SingleLinkedList<Integer> sList = new SingleLinkedList<>();

        System.out.print("Введіть розмір листа: ");
        int length1 = sc.nextInt();//вводимо довжину списку

        System.out.print("Введіть шукане значення: ");
        int search1 = sc.nextInt();

        for (int i = 0; i < length1; i++) {
            sList.addFirst((int) (Math.random() * 10 - 5));//заповняємо лист числами
        }
        System.out.println(sList);

        System.out.println("Завдання згідно варіанту");
        taskVar1(sList);//викликаємо метод згідно з варіантом

        System.out.println("Спільне завдання");
        task1(sList, search1);//викликаємо метод завдання
        System.out.println(sList);


        System.out.println("\nЗавдання 2 ");
        DoublyLinkedList<Integer> dList = new DoublyLinkedList<>();
        System.out.print("Введіть розмір листа: ");
        int length2 = sc.nextInt();//вводимо довжину списку


        System.out.print("Введіть шукане значення: ");
        int search2 = sc.nextInt();

        for (int i = 0; i < length2; i++) {
            dList.addLast((int) (Math.random() * 10 - 5));
        }
        System.out.println(dList);

        System.out.println("Завдання згідно варіанту");
        taskVar2(dList);//викликаємо метод згідно з варіантом

        task2(dList, search2);//викликаємо метод завдання
        System.out.println(dList);


        System.out.println("\nЗавдання 3 ");
        System.out.print("Введіть розмір стека: ");
        int length3 = sc.nextInt();//вводимо довжину стеку
        Stack<Integer> myStack = new Stack<>();//створюємо стек

        for (int i = 0; i < length3; i++) {
            myStack.push((int) (Math.random() * 10 - 5));
        }
        System.out.println(myStack);//виводимо стек
        System.out.println("Завдання згідно варіанту");
        taskVar(myStack);//викликаємо метод згідно з варіантом


    }


    public static void task1(SingleLinkedList<Integer> list, Integer key) {//метод для першого спільного завдання

        for (int i = 1; i < list.size() - 1; i++) {

            if (list.get(i).equals(key)) {
                if (list.get(i + 1).equals(key)) {


                    int j = i;

                    while (list.get(j).equals(key)) {
                        if (j == list.size() - 1) break;

                        list.remove(j);

                    }
                    i--;
                } else if (!list.get(i - 1).equals(key)) {
                    int temp = list.get(i - 1);
                    list.set(i - 1, list.get(i + 1));
                    list.set(i + 1, temp);
                    list.remove(i);
                    i--;

                } else {
                    list.remove(i);
                    i--;
                }
            }

        }

        if (list.get(0).equals(key)) {
            list.removeFirst();
        }
        if (list.get(list.size() - 1).equals(key)) {
            list.remove(list.size() - 1);
        }


    }

    public static void task2(DoublyLinkedList<Integer> list, Integer key) {//метод для другого спільного завдання

        int size = list.size();
        for (int i = 0; i < size; i++) {

            if (list.get(i).equals(key)) {
                list.remove(i);
                i--;
                size--;
            }

        }

    }

    public static void taskVar1(SingleLinkedList<Integer> list) {//метод для першого завдання згідно з варіантом
        int plus = 0;
        int minus = 0;

        for (int i : list) {
            if (i > 0) {
                plus += i;
            } else {
                minus -= i;
            }
        }

        System.out.println("Сума додатних чисел: " + plus);
        System.out.println("Модуль суми від'ємних чисел: " + minus);

        if (plus > minus) {
            System.out.print("\u001B[32m");
            System.out.println("Сума додатних більша за модуль суми від'ємних чисел");
        } else if (plus == minus) {
            System.out.print("\u001B[33m");
            System.out.println("Сума додатних дорівнює  модулю  від'ємних чисел");
        } else {
            System.out.print("\u001B[31m");
            System.out.println("Модуль суми від'ємних більший за сума додатних чисел");
        }
        System.out.print("\u001B[0m");

    }

    public static void taskVar2(DoublyLinkedList<Integer> list) {//метод для другого завдання згідно з варіантом
        int plus = 0;
        int minus = 0;

        for (int i : list) {
            if (i > 0) {
                plus += i;
            } else {
                minus -= i;
            }
        }

        System.out.println("Сума додатних чисел: " + plus);
        System.out.println("Модуль суми від'ємних чисел: " + minus);
        if (plus > minus) {
            System.out.print("\u001B[32m");
            System.out.println("Сума додатних більша за модуль суми від'ємних чисел");
        } else if (plus == minus) {
            System.out.print("\u001B[33m");
            System.out.println("Сума додатних дорівнює  модулю  від'ємних чисел");
        } else {
            System.out.print("\u001B[31m");
            System.out.println("Модуль суми від'ємних більший за сума додатних чисел");
        }
        System.out.print("\u001B[0m");
    }


    public static void taskVar(Stack<Integer> stack) {//метод для третього завдання згідно з варіантом

        int plus = 0;
        int minus = 0;

        for (int i : stack) {
            if (i > 0) {
                plus += i;
            } else {
                minus -= i;
            }
        }

        System.out.println("Сума додатних чисел: " + plus);
        System.out.println("Модуль суми від'ємних чисел: " + minus);
        if (plus > minus) {
            System.out.print("\u001B[32m");
            System.out.println("Сума додатних більша за модуль суми від'ємних чисел");
        } else if (plus == minus) {
            System.out.print("\u001B[33m");
            System.out.println("Сума додатних дорівнює  модулю  від'ємних чисел");
        } else {
            System.out.print("\u001B[31m");
            System.out.println("Модуль суми від'ємних більший за сума додатних чисел");
        }
        System.out.print("\u001B[0m");

    }
}


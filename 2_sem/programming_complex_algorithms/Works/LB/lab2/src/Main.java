import java.util.Scanner;//імпортуємо сканер

public class Main {

    public static void main(String[] args) {
        System.out.print("\u001B[32m");
        Task task = new Task();

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть крайнє число діапазону: ");
        int n = sc.nextInt();


        System.out.printf("Обчислюємо добуток ряда {2*j} з діапазоном 1 --> %d з використанням рекурсивної функції...\n", n);
        long start = System.nanoTime();//розпочинаємо вимір часу
        System.out.println( "Результат : " + Task.recursion(n));
        long finish = System.nanoTime();//закінчуємо вимір часу
        System.out.printf( "%d nanoseconds\n", finish-start);//виведення


        System.out.printf("Обчислюємо добуток ряда {2*j} з діапазоном 1 --> %d без використання рекурсивної функції...\n", n);
        long start1 = System.nanoTime();//розпочинаємо вимір часу
        System.out.println(  "Результат : " + Task.not_recursion(n));
        long finish1 = System.nanoTime();//закінчуємо вимір часу
        System.out.printf( "%d nanoseconds\n", finish1-start1);//виведення часу

    }
}

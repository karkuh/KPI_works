import java.util.Arrays;
public class Kr_Main {

    public static void main(String[] args) {

        Kr_Task myObj = new Kr_Task() ;

        // Завдання 1
        System.out.println("\n-------------Завдання 1--------------\n");
        int[] first = {1,2,1,1,1,5,2,5};
        int[] second = {1,2,1,1,5,2,5};
        int[] third = {1,2,1,1,1,5};
        System.out.println("Початковий масив : " + Arrays.toString(first));
        System.out.println("Результат : "+myObj.noTriples(first));
        System.out.println("\nПочатковий масив : " + Arrays.toString(second));
        System.out.println("Результат : "+myObj.noTriples(second));
        System.out.println("\nПочатковий масив : " + Arrays.toString(third));
        System.out.println("Результат : "+myObj.noTriples(third));

        // Завдання 2
        System.out.println("\n-------------Завдання 2--------------\n");
        double x = 0.4;
        System.out.printf("Сума ряду при х= 0.4  дорівнює: %.4f\n" , myObj.task2(x ,6) );

    }
}

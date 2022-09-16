import java.util.Arrays;
import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {

        task myobj = new task();

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть слово : ");
        String base = sc.nextLine();
        System.out.print("Введіть елемент який потрібно забрати зі слова : ");
        String remove = sc.nextLine();




        System.out.println("Результат : " + myobj.withoutString(  base,remove));








    }
}

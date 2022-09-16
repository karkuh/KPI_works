import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {

        task res = new task();
        System.out.print("Введіть слово:  ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(res.catDog(str));
    }

}

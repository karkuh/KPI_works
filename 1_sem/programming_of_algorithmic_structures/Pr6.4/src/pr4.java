import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        task myobj = new task();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть перше слово : ");
        String word1 = sc.next();
        System.out.print("Введіть друге слово :");
        String word2 = sc.next();
        System.out.println(myobj.endOther(word1,word2));
    }
}

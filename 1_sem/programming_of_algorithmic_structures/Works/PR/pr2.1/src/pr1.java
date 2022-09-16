import java.util.Scanner;
public class pr1 {
    public static void main(String[] args) {

        System.out.println("Введіть будь яке число");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(diff21(n));

    }

    public static int diff21(int n) {

        if(n<21){
            System.out.print("Різниця числа 21 і вашого введеного числа =  ");
            return (21 - n) ;
        }

        else {
            System.out.print("Подвійна різниця числа 21 і вашого введеного числа = ");
            return 2*(21 - n);
        }

    }
}

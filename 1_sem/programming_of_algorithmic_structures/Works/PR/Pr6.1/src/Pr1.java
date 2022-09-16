import java.lang.reflect.Array;
import java.util.*;
public class Pr1 {

    public static void main(String[] args) {

        System.out.print("Введіть слово:  ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Введене слово : " + str);
        System.out.print("Подвоєне слово: " + doubleChar(str));

    }

    public static String doubleChar(String str){

        int n = str.length();
        char[] res = str.toCharArray();
        char [] result = new char[2*n];

        int k = 2 * n ;

        int i = 0 ;
        for(int j = 0 ; j < k; j = j + 2 ) {
            result[j] =res[i];
            result[j+1] = res[i];
            i++;
        }
        str = String.copyValueOf(result);


        return str ;
    }
}

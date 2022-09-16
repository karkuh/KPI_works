import java.util.Scanner;

import java.util.*;
public class pr2 {
    public static void main(String[] args) {


        System.out.print("Введіть слово:  ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Введене слово : " + str);

        System.out.println(sumDigits(str));
    }


    public static int sumDigits(String str){
    int y = 0 ;
    char[] res = str.toCharArray();
        for(int i = 0 ; i < res.length ; i++) {

           if(Character.isDigit(res[i])){
               y += Integer.parseInt(String.valueOf(res[i]));
           }
        }
        return y ;

    }

}

import java.util.Scanner;

public class Pr5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть довжину рядків");
        int n = sc.nextInt();
        System.out.println("Введіть довжину стовпців");
        int m = sc.nextInt();


        int a [][] = table(n,m);
        for(int i = 1 ; i < a.length; i++){
            for(int j = 1 ; j < a[0].length ; j++){
                System.out.print(a[i][j] + " ");

            }
            System.out.println(" ");
        }
    }

    public static int [][] table (int n , int m ){
        int [][] a = new int[n+1][m+1];
        for(int i = 1 ; i < n+1 ; i++){
            for(int j = 1; j < m+1 ; j++){
                a[i][j] = i*j;


            }
        }

        return a ;
    }
}

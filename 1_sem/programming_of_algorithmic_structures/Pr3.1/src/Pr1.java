import java.util.*;
public class Pr1 {

    public static void main(String[] args) {
        int [] a= new int[3] ;
        int [] b = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть значення масива a");
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        System.out.println("Введіть значення масива b");
        b[0]=sc.nextInt();
        b[1]=sc.nextInt();
        b[2]=sc.nextInt();
        System.out.print("Масив с: ");

        
      int[] c = middleWay(a,b);
        System.out.println(Arrays.toString(c));
    }
    public static int[] middleWay( int[] a, int[] b) {

        int[] c = new int[2];

        c[0] = a[1];
        c[1] = b[1];
        return c;


    }





}

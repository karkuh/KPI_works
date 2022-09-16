
    import java. util.Scanner;
    public class Pr4 {
        public static void main(String[] args) {
            while(true) {
                int a, b, c;
                Scanner sc = new Scanner(System.in);
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                System.out.println(isInRange(a, b, c));
            }




        }

        public static boolean isInRange(int a, int b, int c) {


            if (a>=13 && a<=19||b>=13 && b<=19||c>=13 && c<=19){
                return true;
            }
              return false ;

        }
    }


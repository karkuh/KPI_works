
    import java.util.Scanner;

    public class pr2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
            System.out.println(nearHundred(n));

        }

        public static boolean nearHundred(int n) {
            if (n>=90 && n<=110 || n>=190 && n<=210){
                return true;
            }
                else {
                    return false;
            }



        }


    }

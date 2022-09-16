public class Pr5 {
    public static void main(String[] args) {

       int c = 0 ;
        int d = 20;
        int a = c + (int) (Math.random() * d);
        System.out.println("1-ое случайное число: " + a);
        int b = c + (int) (Math.random() * d);
        System.out.println("2-ое случайное число: " + b);
        System.out.println(close10( a,b));

        //int k = close10();
    }




   public static int close10(int a, int b) {
        int f = 10 ;
        int k;
            if (Math.abs(f-a) < Math.abs(f-b)) {
                k = a;
            }else if(Math.abs(f-a)==Math.abs(f-b)) {
                k = 0;
            }else{
                 k = b;
            }
        return k;
    }
}

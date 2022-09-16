
public class pr3 {
    public static  void main(String[] args) {

        System.out.println("Можна спати = true, не можна спати = false");
        System.out.println("Будній день + немає канікул = " + sleepIn(true,false));
        System.out.println("Будній день + канікули = " + sleepIn(true,true));
        System.out.println("Вихідні + канікули = "+ sleepIn(false,true));
        System.out.println("Вихідні + немає канікул = " + sleepIn(false,false));
    }




   public  static boolean sleepIn( boolean weekday, boolean vacation) {
        boolean b = false;
        if (!weekday || vacation)
            b = true;
        return b;


    }








    }
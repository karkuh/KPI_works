
import static java.lang.Math.*;

public class main {
    public static void main(String[] args) {

        Circle kolo1 = new Circle(0, 0, 12);
        Circle kolo2 = new Circle(3, 5, 11);

        kolo1.info();
        kolo2.info();

        kolo1.ps(kolo2);

    }

}
class Circle{
    int x;//координата х
    int y;//координата у
    int r;//радіус кола
    double area;//площа кола

    Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

     public double area() {
        return (PI * pow(r, 2));
    }

    public void info() {
        System.out.print("Координати центра кола (" + this.x + ";" + this.y + "), радіус кола : " + this.r);
        System.out.printf(", площа = %.2f\n", this.area());
    }

    public  void ps(Circle  a) {
        if (area()  == a.area() ) {
            System.out.println("Площі рівні");
        } else {
            System.out.println("Площі не рівні");
        }
    }


}




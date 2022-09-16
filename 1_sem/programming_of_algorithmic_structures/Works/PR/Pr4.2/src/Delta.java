import static java.lang.Math.*;
public class Delta {

    int a;
    int b;
    float c;

    public Delta(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static double P(int a, int b, double c) {
        return a + b + c;
    }


    public static double S(int a, int b) {
        return (a * b) / 2f;
    }

    void info() {
        System.out.printf("Сторони трикутника : a = %d,  b = %d, c = %.2f \n", this.a, this.b, this.c);
        System.out.printf("Периметр першого трикутника\nP = %.2f\n", Delta.P(this.a, this.b, this.c));
        System.out.printf("Площа першого трикутника\nS = %.2f\n", Delta.S(this.a, this.b));

    }

    public void c() {
        this.c = (float) sqrt((pow(this.a, 2) + pow(this.b, 2)));
    }

/*
    public void similarityy(Delta delta2) {
        if (this.a / delta2.a == this.b / delta2.b && (float) this.a / delta2.a == this.c / delta2.c && (float) this.b / delta2.b == this.c / delta2.c) {
            System.out.println("Трикутники подібні ");
        } else {
            System.out.println("Трикутники не подібні");
        }
    }
*/
    boolean similarity(Delta delta2) {
        return (this.a / delta2.a == this.b / delta2.b && (float)this.a / delta2.a == this.c / delta2.c && (float)this.b / delta2.b == this.c / delta2.c);
    }
}




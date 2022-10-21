/*
 * Лабораторна робота №2
 * Завдання: Ознайомитись з рекурсивним викликом функції.
 *  Розробити алгоритмом розрахунку значення функції за її розкладенням у ряд за умови отримання результату
 *  з заданою точністю. Врахувати діапазон дозволених значень для змінної x.
У якості індивідуального завдання необхідно написати програмний код,
*  що реалізує алгоритм розрахунку значень функцій за їх розкладенням в ряд із заданою користувачем точністю.
*  Використати математичні моделі геометричних фігур з Додатку В-2. Завдання обрати згідно свого варіанта.

 * Індивідуальне завдання:
 * 16) Слимак Паскаля
 * x = a * cos^2(φ) + b * cos(φ)
 * y = a * sin(φ) * cos(φ) + b * cos(φ)
 * p = 2 * a * cos(φ) + b - полярне рівняння,
 * де φ Є (-∞; +∞),
 *
 * Виконав студент групи ТР-12
 * Каркушевський Владислав
 * Номер варіанту: 16
 * */

import java.util.Scanner;

public class Main {

    private static final double PI = Math.PI;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть сторону а: ");
        double a = sc.nextDouble();

        System.out.print("Введіть сторону b: ");
        double b = sc.nextDouble();

        System.out.print("Введіть кут β: ");
        int beta = sc.nextInt();

        System.out.print("Введіть точність e: ");
        double e = sc.nextDouble();

        double [] firstRes = pascalsSlug(a, b, beta, e);

        double [] secondRes = pascalsSlugMath(a, b, beta);
        accuracy(firstRes, secondRes);

        comparison();
    }

    public static long factorial(long n) {
        if (n < 0) {
            throw new NullPointerException("factorial only positive numbers");
        }
        if (n == 0) return 1;
        return n * (factorial(n - 1));
    }

    public static double mySin(int x, double e) {
        boolean minus = false;
        x %= 360;
        if ((double) x / 180 >= 1) {
            minus = true;
        }
        x %= 180;
        double xR = (x) * PI / 180, res = xR;
        double sum = 1;
        int k;
        for (k = 1; Math.abs(sum) > e; k++) {
            sum = Math.pow(-1, k) * Math.pow(xR, (2 * k) + 1) / factorial((2L * k + 1));
            res += sum;
        }

        return minus ? 0 - res : res;
    }

    public static double myCos(int x, double e) {
        boolean minus = false;
        x %= 360;
        if ((double) x / 180 >= 1) {
            minus = true;
        }
        x %= 180;
        double xR = (x) * PI / 180;
        double res = 1, sum = 1;
        int k;
        for (k = 1; Math.abs(sum) > e; k++) {
            sum = Math.pow(-1, k) * Math.pow(xR, 2 * k) / factorial(2L * k);
            res += sum;
        }

        return minus ? 0 - res : res;
    }

    public static double[] pascalsSlug(double a, double b, int alpha, double e) {


        System.out.println("\nЗавдання згідно варіанту виконано за допомогою власноруч написаних синусів та косинусів");
        double [] res = new double[3];

        res[0] = a * Math.pow(myCos(alpha, e), 2) + b * myCos(alpha, e);
        res[1] = a * mySin(alpha, e) * myCos(alpha, e) + b * myCos(alpha, e);
        res[2] = 2 * a * myCos(alpha, e) + b;

        System.out.printf("x = %.5f\n", res[0]);
        System.out.printf("y = %.5f\n", res[1]);
        System.out.printf("p = %.5f\n", res[2]);

        return res;
    }

    public static double[] pascalsSlugMath(double a, double b, int alpha) {

        System.out.println("\nЗавдання згідно варіанту виконано за допомогою бібліотеки Math");
        double [] res = new double[3];

        double alphaR = (alpha % 360) * PI / 180;
        res[0] = a * Math.pow(Math.cos(alphaR), 2) + b * Math.cos(alphaR);
        res[1] = a * Math.sin(alphaR) * Math.cos(alphaR) + b * Math.cos(alphaR);
        res[2] = 2 * a * Math.cos(alphaR) + b;

        System.out.printf("x = %.5f\n", res[0]);
        System.out.printf("y = %.5f\n", res[1]);
        System.out.printf("p = %.5f\n", res[2]);
        return res;

    }

    public static void accuracy(double [] firstRes, double [] secondRes){
        System.out.println("\ncalculation accuracy...");
        System.out.printf("Δx = %.5f\n", (Math.abs(firstRes[0] - secondRes[0])));
        System.out.printf("Δy = %.5f\n", (Math.abs(firstRes[1] - secondRes[1])));
        System.out.printf("Δp = %.5f\n", (Math.abs(firstRes[2] - secondRes[2])));
    }

    public static void comparison() {
        System.out.println("\nПорівняльна таблиця синусів та косинусів");
        double e = 0.0001;
        int alpha = 0;
        System.out.println("_________________________________________________________________");
        System.out.println("| angle |   |  MyCos  |   |Math.Cos |   |  MySin  |   |Math.sin |");
        System.out.println("|-------|---|---------|---|---------|---|---------|---|---------|");
        while (alpha <= 360) {
            System.out.printf("|%5d  |   |%8.5f |   |%8.5f |   |%8.5f |   |%8.5f |\n", alpha, myCos(alpha, e), Math.cos((alpha % 360) * PI / 180), mySin(alpha, e), Math.sin((alpha % 360) * PI / 180));
            if (alpha != 360){
                System.out.println("|-------|---|---------|---|---------|---|---------|---|---------|");

            }
            alpha += 15;
        }
        System.out.println("-----------------------------------------------------------------");
    }

}

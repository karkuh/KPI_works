import java.util.Arrays;

public class task {

    public static double[][] task11(double[][]a) {
        int n = a.length;
        for (int k = 1; k < a.length; k++) {
            for (int j = k; j < a.length; j++) {
                double m = a[j][k - 1] / a[k - 1][k - 1];

                for (int i = 0; i < n + 1; i++) {
                    a[j][i] = a[j][i] - m * a[k - 1][i];
                }
            }
        }
        return a;
    }

    public static double[][]task12(double [][]a2){
        int  n = a2.length;
        double [][]x=new double[n][1];
        for(int  i = n-1;i>=0;i--){
            x[i][0]=a2[i][n] / a2[i][i];
            for(int c = n-1;c>i;c--){
                x[i][0]=x[i][0]-a2[i][c]*x[c][0]/a2[i][i];
            }
        }
        return x;
    }

    public static void printMatrix(double[][] a) {

        // Виведення матриці в консоль
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] % 1 == 0) {
                    System.out.printf("%8.0f", a[i][j]);
                } else {
                    System.out.printf(" %8.3f", a[i][j]);
                }
            }
            System.out.println("\n");
        }
    }








    public static void main(String[] args) {


        double[][] b= {
                {-8, -4, 2, -9, 9, 76.9},
                {5, -3, -2, -10, -6, -76},
                {-7, -5, 6, -10, 8, 90.4},
                {7, 8, 0, 6, -3, -32.8},
                {1, -3, 10, 7, -7, 34.3}
        };
        System.out.println("Початкова матриця:\n");
        printMatrix(b);
        double[][]c = task11(b);
        System.out.println("Матриця зведенна до трикутного вигляду:\n");
        printMatrix(c);
        double [][]v = task12(c);
        System.out.println("Кінцева матриця :\n");
        printMatrix(v);


    }
}
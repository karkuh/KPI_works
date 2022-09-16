
public class pr2 {
    public static void main(String[] args) {

        int a[][] = randomMatrix(4, 4, -5, 5);

        int b[][] = randomMatrix(4, 4, -5, 5);

        int c[][] = multMatrix(a, b);

        print3Matrix(a,b,c);
    }

    public static int[][] randomMatrix(int n, int m, int min, int max) {

        int[][] matrix = new int[n][m];
        int a = (int) (Math.random() * (2 * max + 1)) + min;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * (2 * max + 1)) + min;
            }

        }

        return matrix;
    }


    public static int[][] multMatrix(int a[][], int b[][]) {
        int[][] c = new int[a.length][b[0].length];
        if (a[0].length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    c[i][j] = multRowCol(a, b, i, j);
                }
            }
            return c;

        } else {
            System.out.println("Розмірність матриць не відповідає операції множення матриць");
        }


        return c;
    }

    public static int multRowCol(int[][] matrixa, int[][] matrixb, int row, int col) {
        int result = 0;
        for (int k = 0; k < matrixa[0].length; k++) {
            result += matrixa[row][k] * matrixb[k][col];
        }
        return result;
    }

    static void print3Matrix(int[][] a, int[][] b, int[][] c) {
        System.out.println("1 матриця\t\t\t2 матриця\t\t\t3 матриця");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a [i][j] + " ");

            }
            System.out.print("         ");
            for(int k = 0; k < b[0].length; k++){

            System.out.print(  b [i][k] + " ");

            }System.out.print("         ");
            for(int l = 0; l < c[0].length; l++){
                System.out.print(  c [i][l] + " ");

            }
            System.out.println(" ");
        }

    }
}

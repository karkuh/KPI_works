public class Main {

    public static void main(String[] args) {

        DilutedMatrix table = new DilutedMatrix(15);//створимо нерозріджену матрицю з 11 ненульовими елементами

        table.addElem(1, 1, 48);//додамо елементи
        table.addElem(1, 2, 32);
        table.addElem(4, 7, 43);
        table.addElem(2, 2, 51);
        table.addElem(6, 5, 76);
        table.addElem(7, 7, 20);
        table.addElem(2, 3, 47);
        table.addElem(4, 5, 90);
        table.addElem(5, 8, 75);
        table.addElem(7, 6, 83);
        table.addElem(4, 2, 71);
        table.addElem(3, 4, 97);
        table.addElem(5, 2, 12);
        table.addElem(3, 7, 63);
        table.addElem(6, 1, 45);

        System.out.print("\u001B[34m");
        System.out.println("\tНерозріджена матриця");
        System.out.print("\u001B[0m");
        System.out.println(table);//виведемо нерозріджену матрицю


        table.sort();//відсортуємо нерозріджену матрицю
        System.out.print("\u001B[33m");
        System.out.println("\tНерозріджена відсортована матриця");
        System.out.print("\u001B[0m");
        System.out.println(table);//виведемо нерозріджену матрицю

        int[][] res = table.makeMatrix();//створимо розріджену матрицю
        System.out.print("\u001B[35m");
        System.out.println("\tРозріджена матриця");
        System.out.print("\u001B[0m");
        outputMatrix(res);//виведемо розріджену матрицю


        table.task();//викличемо метод із завданням згідно з варіантом

        System.out.print("\u001B[33m");
        System.out.println("\tНерозріджена відсортована матриця");
        System.out.print("\u001B[0m");
        System.out.println(table);//виведемо нерозріджену матрицю

        System.out.print("\u001B[35m");
        System.out.println("\tРозріджена матриця");
        System.out.print("\u001B[0m");
        outputMatrix(res);//виведемо розріджену матрицю


    }

    public static void outputMatrix(int[][] b) {//створюємо метод для виведення матриці

        for (int[] ints : b) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.printf("%4d ", ints[j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}

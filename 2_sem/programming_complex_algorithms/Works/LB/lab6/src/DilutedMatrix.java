public class DilutedMatrix {

    private int size;
    private int k = 0;

    private int[][] dilutedMatrix;//нерозріджена матриця
    private int[][] res;//розріджена матриця


    public DilutedMatrix(int size) {//створимо конструктор(в параметр будемо передавати кількість ненульових елементів)
        this.size = size;
        dilutedMatrix = new int[3][size];
    }

    public void addElem(int i, int j, int elem) {//створимо метод для додавання елемента до нерозрідженої матриці
        int l = 0;
        dilutedMatrix[l][k] = i;
        l++;
        dilutedMatrix[l][k] = j;
        l++;
        dilutedMatrix[l][k] = elem;
        this.k++;
    }


    public void task() {//створимо метод з завданням

        for (int i = 0; i < res.length; i++) {//спочатку додамо до розрідженої матриці до другого рядку елементи зі значенням 100
            for (int j = 0; j < res[0].length; j++) {
                if (i == 1) {
                    res[i][j] = 100;
                }
            }
        }


        int p = 0;
        for (int i = 0; i < dilutedMatrix[0].length; i++) {
            if (dilutedMatrix[0][i] == 2) {
                p++;
            }

        }

        this.size = size + res[0].length - p;//змінимо розмір нерозрідженої матриці

        dilutedMatrix = new int[3][size];

        this.k = 0;

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                if (res[i][j] != 0) {
                    addElem(i + 1, j + 1, res[i][j]);
                }
            }
        }

        sort();

    }

    public void sort() {//метод для сортування нерозрідженої матриці

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < dilutedMatrix[0].length - 1; i++) {
                if (dilutedMatrix[0][i] > dilutedMatrix[0][i + 1]) {

                    set(i, i + 1);
                    needIteration = true;

                }
            }
        }

        needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < dilutedMatrix[0].length - 1; i++) {
                if (dilutedMatrix[0][i] == dilutedMatrix[0][i + 1]) {
                    if (dilutedMatrix[1][i] > dilutedMatrix[1][i + 1]) {

                        set(i, i + 1);
                        needIteration = true;

                    }
                }
            }
        }


    }

    public void set(int i, int j) {//метод для зміни елементів нерозрідженої матриці

        for (int l = 0; l < 3; l++) {

            int pr = dilutedMatrix[l][i];
            dilutedMatrix[l][i] = dilutedMatrix[l][j];
            dilutedMatrix[l][j] = pr;
        }


    }

    public int[][] makeMatrix() {//метод для створення нерозрідженої матриці
        sort();

        int rowMax = dilutedMatrix[0][0];
        for (int i = 1; i < dilutedMatrix[0].length; i++) {

            if (dilutedMatrix[0][i] > rowMax) {
                rowMax = dilutedMatrix[0][i];
            }
        }

        int colmMax = dilutedMatrix[1][0];
        for (int i = 1; i < dilutedMatrix[0].length; i++) {
            if (dilutedMatrix[1][i] > colmMax) {
                colmMax = dilutedMatrix[1][i];
            }
        }

        int[][] res = new int[rowMax][colmMax];


        int row = dilutedMatrix[0][0] - 1;
        int colm = dilutedMatrix[1][0] - 1;
        int k = 0;
        for (int i = 0; i < res.length; i++) {

            for (int j = 0; j < res[0].length; j++) {

                if (k != size) {
                    row = dilutedMatrix[0][k] - 1;
                    colm = dilutedMatrix[1][k] - 1;
                }

                if (i == row && j == colm) {
                    res[i][j] = dilutedMatrix[2][k];
                    k++;
                } else {
                    res[i][j] = 0;
                }

            }
        }

        this.res = res;

        return res;

    }

    @Override
    public String toString() {//Перевизначимо метод toString для виведення нерозрідженої матриці


        if (size == 0) return "matrix is clear";
        StringBuilder sb = new StringBuilder();
        sb.append("rows: [");
        for (int i = 0; i < dilutedMatrix[0].length - 1; i++) {
            sb.append(dilutedMatrix[0][i]).append(", ");
        }
        sb.append(dilutedMatrix[0][dilutedMatrix[0].length - 1]).append("]\n");

        sb.append("colm: [");
        for (int i = 0; i < dilutedMatrix[0].length - 1; i++) {
            sb.append(dilutedMatrix[1][i]).append(", ");
        }
        sb.append(dilutedMatrix[1][dilutedMatrix[0].length - 1]).append("]\n");

        sb.append("elem: [");
        for (int i = 0; i < dilutedMatrix[0].length - 1; i++) {
            sb.append(dilutedMatrix[2][i]).append(", ");
        }
        sb.append(dilutedMatrix[2][dilutedMatrix[0].length - 1]).append("]\n");


        return sb.toString();
    }
}


//    @Override
//    public String toString() {//Перевизначимо метод toString для виведення нерозрідженої матриці
//
//
//        if (size == 0) return "matrix is clear";
//        StringBuilder sb = new StringBuilder();
//        sb.append("rows: [");
//        for (int i = 0; i < dilutedMatrix[0].length - 1; i++) {
//            sb.append(dilutedMatrix[0][i]).append(", ");
//        }
//        sb.append(dilutedMatrix[0][dilutedMatrix[0].length - 1]).append("]\n");
//
//        sb.append("colm: [");
//        for (int i = 0; i < dilutedMatrix[0].length - 1; i++) {
//            sb.append(dilutedMatrix[1][i]).append(", ");
//        }
//        sb.append(dilutedMatrix[1][dilutedMatrix[0].length - 1]).append("]\n");
//
//        sb.append("elem: [");
//        for (int i = 0; i < dilutedMatrix[0].length - 1; i++) {
//            sb.append(dilutedMatrix[2][i]).append(", ");
//        }
//        sb.append(dilutedMatrix[2][dilutedMatrix[0].length - 1]).append("]\n");
//
//
//        return sb.toString();
//    }



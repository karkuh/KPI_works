import java.util.Scanner;//імпортуємо сканер

public class lab1 {
    public static void main(String[] args) {//викликаємо головний метод main

        Scanner sc = new Scanner(System.in);//викликаємо сканер

        System.out.print("\u001B[32m");
        System.out.println("\t\t\ttask1\n");
        System.out.println("choose array size(1-4):\n1.10x10\n2.50x50\n3.100x100\n4.500x500");

        int size = sc.nextInt();//за допомогою сканера вибираємо розмір матриці

        size = info(size);
        int[][] a = makeMatrix(size);//викликаємо метод для створення матриці
        outputMatrix(a);//виводимо матрицю
        task1(a);//викликаємо метод з 1 завданням


        System.out.println("\n\t\t\ttask2\n");
        System.out.println("choose array size(1-4):\n1.10x10\n2.50x50\n3.00x100\n4.500x500");

        int size1 = sc.nextInt();//за допомогою сканера вибираємо розмір матриці

        size1 = info(size1);
        int[][] b = makeMatrix(size1);//викликаємо метод для створення матриці
        outputMatrix(b);//виводимо матрицю
        task2(b);//викликаємо метод з 2 завданням

    }

    public static int[][] task1(int[][] a) {
        long start = System.nanoTime();//розпочинаємо вимір часу

        int res = a.length;
        int indexR = 0;
        int k ;

        for (int i = 0; i < a.length; i++) {//створюємо цикл для знаходження рядка у якому найиенше нульових елементів
            k = 0;
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 0) {
                    k++;
                }
            }
            if(k==0){
                res = k;
                indexR = i;
                break;
            }
            if (k < res) {
                res = k;
                indexR = i;
            }
        }

        System.out.printf(" з найменшою кількістю нульових елементів рядок : %d\n", indexR+1);

        int res1 = a.length+1;
        int indexS = 0;
        int k1;
        for (int i = 0; i < a.length; i++) {//створюємо цикл для знаходження стовпця у якому найбільше нульових елементів

            k1 = 0;
            for (int j = 0; j < a[0].length; j++) {
                if (a[j][i] != 0) {
                    k1++;
                }
            }
            if (k1 < res1) {
                res1 = k1;
                indexS = i;
            }
        }
        System.out.printf(" з найбільшою кількістю нульових елементів стовпець : %d\n\n" ,indexS+1);

        for (int i = 0; i < a.length; i++) {//створюємо цикл для заміни знайдених рядка зі стовпцем
            int c = a[indexR][i];
            a[indexR][i] = a[i][indexS];
            a[i][indexS] = c;

        }
        long finish = System.nanoTime();//закінчуємо вимір часу

        for(int i = 0 ; i < a.length ; i++){//створюємо цикл для різнобарвного виведення матриці(червоний колір-змінені елементи )
            for(int j = 0 ; j < a[0].length ; j++){
                if( i == indexR || j == indexS){
                    System.out.print("\u001B[31m");
                }else{
                    System.out.print("\u001B[32m");
                }
                System.out.printf("%3d",a[i][j]);


            }
            System.out.println();
        }

        System.out.print("\u001B[32m");

        System.out.printf( "%d nanoseconds", finish-start);//виведення часу перестановки матриці

        return a ;

    }

    public static int [][] task2(int[][] b){
        long start1 = System.nanoTime();//розпочинаємо вимір часу

        int limLeft = (b.length/2)-1;
        int limRight = b.length/2 ;

        for(int i = 0 ; i< b.length/2;i++){//створення циклу для перестановки елементів згідно з варіантом

            for(int j = 0 ; j< b[0].length/2;j++){
                if(i == j){
                    break;
                }else {
                    int mov = b[limLeft- i][limLeft-j];
                    b[limLeft- i][limLeft-j] = b[limLeft- j][limLeft-i];
                    b[limLeft- j][limLeft-i] = mov;

                    int lol = b[limRight + i][limRight + j];
                    b[limRight + i][limRight + j]=b[limRight + j][limRight + i];
                    b[limRight + j][limRight + i] = lol;
                }

            }
        }
        long finish1 = System.nanoTime();//закінчуємо вимір часу

        for(int i = 0 ; i < b.length/2;i++){//створюємо цикл для різнобарвного виведення матриці(червоний колір-змінені елементи )
            for(int j = 0 ; j < b[0].length/2;j++ ){
                if(i==j){
                    System.out.print("\u001B[32m");
                }else {
                    System.out.print("\u001B[31m");
                }
                System.out.printf("%3d", b[i][j]);
            }
            for(int k = b[0].length/2; k < b[0].length; k++){
                System.out.print("\u001B[32m");
                System.out.printf("%3d", b[i][k]);
            }
            System.out.println();
        }

        for(int q =  b.length/2 ; q < b.length;q++){
            for(int r = 0; r < b[0].length/2; r++){
                System.out.print("\u001B[32m");
                System.out.printf("%3d", b[q][r]);
            }
            for(int w = b[0].length/2 ; w < b[0].length;w++ ){
                if(q==w){
                    System.out.print("\u001B[32m");
                }else {
                    System.out.print("\u001B[31m");
                }
                System.out.printf("%3d", b[q][w]);
            }
            System.out.println();
        }


        System.out.printf( "%d nanoseconds", finish1-start1);//виведення часу перестановки матриці
        return b;
    }

    public static void outputMatrix(int[][] b){//створюємо метод для виведення матриці

        for(int i = 0 ; i< b.length;i++){
            for(int j = 0 ; j< b[0].length;j++ ){
                System.out.printf("%3d", b[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] makeMatrix( int size ){//створюємо метод для створення матриці

        int[][] a = new int [size][size];


        for(int i = 0 ; i< a.length; i++){
            for(int j = 0 ; j< a[0].length;j++){
                a[i][j] = -5 + (int) (Math.random() * 10);//заповнюємо матрицю числами в діапазоні [-5;5]
            }
        }

        return a;
    }

    public static int info(int size ){//створюємо метод для вибору розміру матриці

        if(size == 1){
            size = 10;
            System.out.println("\nGenerating 10x10 array ...\n");
        }else if(size == 2 ){
            size = 50;
            System.out.println("\nGenerating 50x50 array ...\n");
        }else if(size == 3 ){
            size = 100;
            System.out.println("\nGenerating 100x100 array ...\n");
        }else if(size == 4 ){
            size = 500;
            System.out.println("\nGenerating 500x500 array ...\n");
        }else{
            System.out.println("error");
            System. exit(0);
        }

        return size;
    }
    public static void info(int b [][]){
        for(int i = 0 ; i < b.length/2;i++){//створюємо цикл для різнобарвного виведення матриці(червоний колір-змінені елементи )
            for(int j = 0 ; j < b[0].length/2;j++ ){
                if(i==j){
                    System.out.print("\u001B[32m");
                }else {
                    System.out.print("\u001B[31m");
                }
                System.out.printf("%3d", b[i][j]);
            }
            for(int k = b[0].length/2; k < b[0].length; k++){
                System.out.print("\u001B[32m");
                System.out.printf("%3d", b[i][k]);
            }
            System.out.println();
        }

        for(int q =  b.length/2 ; q < b.length;q++){
            for(int r = 0; r < b[0].length/2; r++){
                System.out.print("\u001B[32m");
                System.out.printf("%3d", b[q][r]);
            }
            for(int w = b[0].length/2 ; w < b[0].length;w++ ){
                    System.out.print("\u001B[31m");
                System.out.printf("%3d", b[q][w]);
            }
            System.out.println();
        }


    }


}


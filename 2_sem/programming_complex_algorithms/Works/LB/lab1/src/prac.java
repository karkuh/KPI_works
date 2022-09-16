
import java.util.Scanner;
public class prac {

    public static void main(String[] args) {

        System.out.println("----Task1----\n");
        System.out.println("Виберіть розмір матриці:\n1.10x10\n2.50x50\n3.100x100\n4.500x500");
        Scanner scanner=new Scanner(System.in);
        int number1 =scanner.nextInt();
        number1= choose_size(number1);
        int[][] matrix = filling_matrix(number1);
        output_matrix(matrix);
        System.out.println();
        output_matrix(task1(matrix));

        System.out.println("----Task2----\n");
        System.out.println("Виберіть розмір матриці:\n1.10x10\n2.50x50\n3.100x100\n4.500x500");
        int number2 =scanner.nextInt();
        number2= choose_size(number2);
        int[][] matrix1 = filling_matrix(number2);
        color1(matrix1);
        color2(task2(matrix1));
//        output_matrix(matrix1);
//        System.out.println();
//        output_matrix(task2(matrix1));
    }
    public static int[][] filling_matrix(int N){
        int a [][]=new int[N][N];
        ;        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[0].length; j++){
                a[i][j]=(int)(Math.random()*20)-10;// Заповнення масива елементами  числами від -10 до 10
            }
        }
        return a;
    }
    public static void output_matrix(int [][] b){
        for(int i =0;i<b.length; i++){
            for(int j =0;j<b[0].length; j++) {
                System.out.printf("%4d" ,b[i][j]);//Вивід  елементів масиву
            }
            System.out.println();
        }

    }

    public static int choose_size(int N){
        if(N==1){
            N=10;
            System.out.println("Генеруємо матрицю 10х10");
        }else if(N==2){
            N=50;
            System.out.println("Генеруємо матрицю 50х50");
        }else if(N==3){
            N=100;
            System.out.println("Генеруємо матрицю 100х100");
        }else if(N==4){
            N=500;
            System.out.println("Генеруємо матрицю 500х500");
        }
        return N;

    }


    public static int[][] task1(int[][] matrix){//метод для  виконання 1 завдання
        long start = System.nanoTime();//розпочинаємо вимір часу
        int min,max;
        int index_min = 0;
        int index_max = 0;
        for(int i=0; i<matrix.length;i++){
            min = matrix[0][i];
            max = matrix[0][i];
            for(int j=0; j<matrix[0].length;j++){
                if(min>matrix[j][i]){
                    min =matrix[j][i];//знаходження мініального значення
                    index_min =j;//запам'ятовуємо індекс мінімального значення
                }if(max<matrix[j][i]){
                    max =matrix[j][i];//знаходження максимального значення
                    index_max =j;//запам'ятовуємо індекс максимального  значення
                }
            }
            if(index_min >index_max){//у випадку якщо мінімальний індекс більше за максимальне зініюємо мін на макс
                int a = index_min ;
                index_min  = index_max;
                index_max = a;
            }
            for(int k = index_min +1; k<index_max ; k++){
                matrix[k][i]=3;//у визначеному діапазоні мін та макс індексів замініює числа на 3
            }
            index_min = 0;//анульовуємо індекси для наступного стовбця
            index_max = 0;
        }
        long finish = System.nanoTime();//закінчуємо вимір часу
        System.out.printf( "Часова складність: %d nanoseconds\n\n", finish-start);//виведення часу перестановки матриці
        return matrix;
    }//15x^2 = O(x^2)


    public static  int [][] task2( int[][] matrix ){//метод для  виконання 2 завдання
        long start = System.nanoTime();//розпочинаємо вимір часу
        for(int i = 0; i<matrix.length/2; i++){
            for(int j=0;j<matrix[0].length/2;j++){
                int mov = matrix[i][j];
                matrix[i][j]=matrix[matrix.length-1-j][matrix[0].length-1-i];
                matrix[matrix.length-1-j][matrix[0].length-1-i] =mov;
            }
        }
        long finish = System.nanoTime();//закінчуємо вимір часу
        System.out.print("\u001B[0m");
        System.out.printf( "Часова складність: %d nanoseconds\n\n", finish-start);//виведення часу перестановки матриці
        return matrix;
    }//x/2*x/2*9 = 9/2*x^2 = O(X^2)

    public static void color1(int b [][]){
        for(int i = 0 ; i < b.length/2;i++){//створюємо цикл для різнобарвного виведення матриці(червоний колір-змінені елементи )
            for(int j = 0 ; j < b[0].length/2;j++ ){

                System.out.print("\u001B[33m");
                System.out.printf("%3d", b[i][j]);
            }
            for(int k = b[0].length/2; k < b[0].length; k++){
                System.out.print("\u001B[0m");
                System.out.printf("%3d", b[i][k]);
            }
            System.out.println();
        }

        for(int q =  b.length/2 ; q < b.length;q++){
            for(int r = 0; r < b[0].length/2; r++){
                System.out.print("\u001B[0m");
                System.out.printf("%3d", b[q][r]);
            }
            for(int w = b[0].length/2 ; w < b[0].length;w++ ){
                System.out.print("\u001B[34m");
                System.out.printf("%3d", b[q][w]);
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void color2(int b [][]){
        for(int i = 0 ; i < b.length/2;i++){//створюємо цикл для різнобарвного виведення матриці(червоний колір-змінені елементи )
            for(int j = 0 ; j < b[0].length/2;j++ ){

                System.out.print("\u001B[34m");
                System.out.printf("%3d", b[i][j]);
            }
            for(int k = b[0].length/2; k < b[0].length; k++){
                System.out.print("\u001B[0m");
                System.out.printf("%3d", b[i][k]);
            }
            System.out.println();
        }

        for(int q =  b.length/2 ; q < b.length;q++){
            for(int r = 0; r < b[0].length/2; r++){
                System.out.print("\u001B[0m");
                System.out.printf("%3d", b[q][r]);
            }
            for(int w = b[0].length/2 ; w < b[0].length;w++ ){
                System.out.print("\u001B[33m");
                System.out.printf("%3d", b[q][w]);
            }
            System.out.println();
        }

        System.out.println();
    }


}
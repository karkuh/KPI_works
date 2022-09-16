import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Початок програми\n");
        System.out.println("Завдання 1");
        System.out.println("Виберіть розмір матриці(1-4):\n1.10x10             2.20x20\n3.50x50            4.100x100");

        Scanner sc = new Scanner(System.in);//створюємо сканер

        int size = sc.nextInt();//за допомогою сканера вибираємо розмір матриці
        System.out.print("Виберіть число від 1 до 50: ");
        int key = sc.nextInt();

        size = info(size);
        int[][] matrixStart = makeMatrix(size);//викликаємо метод для створення матриці
        print1(matrixStart, key);
        task1(matrixStart,key);

        System.out.println("\nЗавдання 2");
        System.out.print("Введіть послідовність(через пробіл): ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        insertionSort(matrixStart);
        print2(matrixStart,str);
        task2(matrixStart,str);
        System.out.println("\nКінець програми");

    }

    public static int barrier(int key, int[] num) {

        int finaly = num[num.length - 1];//зберігаємо останній елемент масиву у змінній finaly
        num[num.length - 1] = key;//в останній елемент масиву розміщуємо шукане значення
        int j;
        for (j = 0; num[j] != key; j++);//за допомогою циклу шукаємо значення у масиві

        num[num.length - 1] = finaly;
        if (j != num.length - 1 || key == finaly) {//якщо значення знайдено повертаємо його індекс
            return j;
        }

        return -1;//якщо ні повертаємо -1
    }

public static void task1(int [][] matrix,int key){//створюємо метод для першого завдання
    long start = System.nanoTime();//розпочинаємо вимір часу
    boolean var = false;
    for (int i = 0; i < matrix.length; i++) {

        int j = barrier(key,matrix[i]);
        if( j != -1) {
            System.out.printf("Рядок: %d  Стовпець: %d\n", i + 1, j + 1);
            var = true;
        }
    }
    if(!var){
        System.out.print("\u001B[31m");
        System.out.println("Елементів не знайдено");
        System.out.print("\u001B[0m");
    }
    long finish = System.nanoTime();//закінчуємо вимір часу
    System.out.printf( "times: %d nanoseconds\n", finish-start);//виведення часу перестановки матриці
}

    public static void insertionSort(int[][] matrix) {//створюємо метод для сортування вставками

        int [] nums ;
        for (int[] ints : matrix) {
            nums = ints;
            int j;
            for (int i = 1; i < nums.length; i++) {
                int x = nums[i];
                j = i;
                while (j > 0 && nums[j - 1] > x) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    j--;
                }
                nums[j] = x;
            }

        }


    }

    public static int sequence(String str, int [] arr ){//створюємо метод пошуку послідовності елементів в масиві

        String[] strMassive = str.split(" ");//через сканер передаємо рядок, і розміщуємо значення задані через пробіл в масив рядків
        int [] numMassive = new int[strMassive.length];//створюємо масив чисел з довжиною масиву рядків
        for(int i = 0; i < strMassive.length; i++){
            numMassive[i] = Integer.parseInt(strMassive[i]);//переміщуємо з масиву рядків в масив чисел наші дані
        }

        //проводимо операції для знаходження послідовності елементів в масиві
        for (int i = 0; i < arr.length - (numMassive.length - 1) ; i++) {
            if (arr[i] == numMassive[0]) {
                boolean bool = true;
                for (int j = i + 1, k = 1; j < arr.length && k < numMassive.length; j++, k++) {
                    if (arr[j] != numMassive[k]) {
                        bool = false;
                        break;
                    }
                }
                if (bool) return i;//якщо значення знайдено повертаємо індекс першого елемента
            }
        }
        return -1;//якщо ні повертаємо -1

    }


public static void task2(int [][] matrix,String str){//створюємо метод для другого завдання
    long start = System.nanoTime();//розпочинаємо вимір часу
    String[] strMassive = str.split(" ");

    boolean var = false;
    for (int i = 0; i < matrix.length; i++) {

        int j = sequence(str,matrix[i]);
        if( j != -1) {
            System.out.printf("Рядок: %d  Стовпець: %d --> %d\n", i + 1, j + 1,j+strMassive.length);
            var = true;
        }
    }
    if(!var){
        System.out.print("\u001B[31m");
        System.out.println("Елементів не знайдено");
        System.out.print("\u001B[0m");
    }
    long finish = System.nanoTime();//закінчуємо вимір часу
    System.out.printf( "times: %d nanoseconds\n", finish-start);//виведення часу перестановки матриці
}

    public static int[][] makeMatrix( int size ){//створюємо метод для створення матриці

        int[][] a = new int [size][size];

        for(int i = 0 ; i< a.length; i++){
            for(int j = 0 ; j< a[0].length;j++){
                a[i][j] = (int) (Math.random()*49+1);//заповнюємо матрицю числами в діапазоні [1;50]
            }
        }
        return a;
    }



    public static int info(int size ){//створюємо метод для вибору розміру матриці

        if(size == 1){
            size = 10;
            System.out.println("\nГенеруємо матрицю 10x10  ...\n");
        }else if(size == 2 ){
            size = 20;
            System.out.println("\nГенеруємо матрицю 20x20  ...\n");
        }else if(size == 3 ){
            size = 50;
            System.out.println("\nГенеруємо матрицю 50x50  ...\n");
        }else if(size == 4 ){
            size = 100;
            System.out.println("\nГенеруємо матрицю 100x100  ...\n");
        }else{
            System.out.print("\u001B[31m");
            System.out.println("error");
            System. exit(0);
        }

        return size;
    }
    public static void print1(int [][] matrix,int var){//створюємо метод для різнобарвного виведення матриці для першого завдання


        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] == var) {
                    System.out.print("\u001B[31m");
                } else {
                    System.out.print("\u001B[0m");
                }
                System.out.printf("%3d", ints[j]);
            }

            System.out.println();
        }

        System.out.println("\u001B[0m");
    }

    public static void print2(int [][] matrix,String var){//створюємо метод для різнобарвного виведення матриці для другого завдання


        String[] strMassive = var.split(" ");

        for (int[] ints : matrix) {
            int k = sequence(var, ints);

            if (k == -1) {
                for (int m = 0; m < matrix.length; m++) {
                    System.out.print("\u001B[0m");
                    System.out.printf("%3d", ints[m]);
                }
            } else {
                for (int j = 0; j < k; j++) {
                    System.out.print("\u001B[0m");
                    System.out.printf("%3d", ints[j]);
                }
                for (int p = k; p < k + strMassive.length; p++) {
                    System.out.print("\u001B[31m");
                    System.out.printf("%3d", ints[p]);
                }
                for (int l = k + strMassive.length; l < matrix.length; l++) {
                    System.out.print("\u001B[0m");
                    System.out.printf("%3d", ints[l]);
                }

            }
            System.out.println();
        }

        System.out.println("\u001B[0m");
    }

}

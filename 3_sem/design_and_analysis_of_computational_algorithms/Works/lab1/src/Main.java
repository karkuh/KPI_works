/*
* Лабораторна робота №1
* Завдання: Ознайомитись з алгоритмами сортування масивів та способами їхньої реалізації.
* У якості індивідуального завдання необхідно написати програмний код, у
* якому реалізується сортування масивів методами бульбашки, вставок, вибору,
* сортуванням Шелла, Гоара, швидкого сортування та сортування гребінцем. Виконати порівняння
* ефективності вказаних методів сортування.
* Індивідуальне завдання:
* Протабулювати функцію y = cos (x^2 + 2) на відрізку [-π, π] з кроком
* h = π / 10 і впорядкувати значення функції за зростанням.
*
*
* Виконав студент групи ТР-12
* Каркушевський Владислав
* Номер варіанту: 16
* */

import java.util.Scanner;

public class Main {

    public static int iteration = 0;

    public static void main(String[] args) {

        System.out.println("Початок програми\n");
        Scanner sc = new Scanner(System.in);

        double[] array = new double[21];
        double x = -Math.PI;
        double h = Math.PI / 10;

        for (int i = 0; i < array.length; i++) {
            double temp = Math.pow(x, 2) + 2;
            array[i] = Math.cos(temp);
            x += h;
        }

        System.out.println("Початковий масив");
        System.out.println("Елементами масиву є значення, про табульовані функцією cos(2+x^2), де х є [-π;π] з кроком h=Pi/10");
        print_array_num(array);

        boolean choise = true;
        while (choise) {

            System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Виберіть тип сортування (введіть число)\n1.bubbleSort           2.insertionSort\n3.selectionSort        4.shellSort\n5.quickSort            6.quickGoaraSort\n7.combSort ");
            System.out.print("Ваш вибір: ");
            int par = sc.nextInt();

            if (par == 1) {
                System.out.print("\u001B[34m");
                System.out.println("_________________________");
                System.out.println("| Сортування бульбашкою |");
                System.out.println("-------------------------");
                System.out.print("\u001B[0m");

                double[] array_bubble = new double[array.length];
                System.arraycopy(array, 0, array_bubble, 0, 21);
                long start = System.nanoTime();
                bubbleSort(array_bubble);
                long finish = System.nanoTime();
                all_print(array, array_bubble, start, finish);

            } else if (par == 2) {
                System.out.print("\u001B[33m");
                System.out.println("_______________________");
                System.out.println("| Сортування вставкою |");
                System.out.println("-----------------------");
                System.out.print("\u001B[0m");

                double[] array_insertion = new double[array.length];
                System.arraycopy(array, 0, array_insertion, 0, 21);
                long start = System.nanoTime();
                insertionSort(array_insertion);
                long finish = System.nanoTime();
                all_print(array, array_insertion, start, finish);

            } else if (par == 3) {
                System.out.print("\u001B[34m");
                System.out.println("______________________");
                System.out.println("| Сортування вибором |");
                System.out.println("----------------------");
                System.out.print("\u001B[0m");

                double[] array_selection = new double[array.length];
                System.arraycopy(array, 0, array_selection, 0, 21);
                long start = System.nanoTime();
                selectionSort(array_selection);
                long finish = System.nanoTime();
                all_print(array, array_selection, start, finish);

            } else if (par == 4) {
                System.out.print("\u001B[33m");
                System.out.println("____________________________");
                System.out.println("| Сортування методом Шелла |");
                System.out.println("----------------------------");
                System.out.print("\u001B[0m");

                double[] array_shell = new double[array.length];
                System.arraycopy(array, 0, array_shell, 0, 21);
                long start = System.nanoTime();
                shellSort(array_shell);
                long finish = System.nanoTime();
                all_print(array, array_shell, start, finish);

            } else if (par == 5) {
                System.out.print("\u001B[34m");
                System.out.println("_____________________");
                System.out.println("| Швидке сортування |");
                System.out.println("---------------------");
                System.out.print("\u001B[0m");

                double[] array_quick = new double[array.length];
                System.arraycopy(array, 0, array_quick, 0, 21);
                long start = System.nanoTime();
                quickSort(array_quick, 0, array_quick.length - 1);
                long finish = System.nanoTime();
                all_print(array, array_quick, start, finish);

            } else if (par == 6) {

                System.out.print("\u001B[33m");
                System.out.println("___________________________");
                System.out.println("| Швидке сортування Гоара |");
                System.out.println("---------------------------");
                System.out.print("\u001B[0m");


                double[] array_goara = new double[array.length];
                System.arraycopy(array, 0, array_goara, 0, 21);
                long start = System.nanoTime();
                quickGoaraSort(array_goara, 0, array_goara.length - 1);
                long finish = System.nanoTime();
                all_print(array, array_goara, start, finish);

            } else if (par == 7) {
                System.out.print("\u001B[34m");
                System.out.println("________________________");
                System.out.println("| Сортування гребінцем |");
                System.out.println("------------------------");
                System.out.print("\u001B[0m");

                double[] array_comb = new double[array.length];
                System.arraycopy(array, 0, array_comb, 0, 21);
                long start = System.nanoTime();
                combSort(array_comb);
                long finish = System.nanoTime();
                all_print(array, array_comb, start, finish);

            } else {
                System.out.print("\u001B[31m");
                System.out.println("error");
                System.exit(0);
            }

            System.out.println("1.Продовжити\n2.Завершити");
            int end = sc.nextInt();
            if (end == 2) {
                choise = false;
            } else if (end == 1) {
                continue;
            } else {
                System.out.print("\u001B[31m");
                System.out.println("error");
                System.exit(0);
            }
        }
        System.out.println("Кінець програми");
    }

    public static void all_print(double[] start_array, double[] sort_array, long start, long finish) {
        System.out.println("Початковий масив");
        print_array_num(start_array);
        System.out.println("Відсортований масив");
        print_array_num(sort_array);
        System.out.printf("Час: %d наносекунд\n", finish - start);
        System.out.println("Ітерацій: " + iteration);
        iteration = 0;

    }

    static void print_array_num(double[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%.3f ", num[i]);
        }
        System.out.println();
    }

    public static void swap(double[] nums, int x, int y) {//створюємо метод для зміни елементів масиву місцями
        double temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
        iteration++;
    }

    public static void bubbleSort(double[] nums) {//створюємо метод для сортування бульбашкою
        boolean bool = true;
        while (bool) {
            bool = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);

                    bool = true;
                }
            }
        }
    }

    public static void insertionSort(double[] nums) {//створюємо метод для сортування вставками
        int j;
        for (int i = 1; i < nums.length; i++) {
            double x = nums[i];
            j = i;
            while (j > 0 && nums[j - 1] > x) {
                swap(nums, j, j - 1);
                j--;
            }
            nums[j] = x;
        }
    }

    public static void selectionSort(double[] nums) {//створюємо метод для сортування вибором
        for (int i = 0; i < nums.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            swap(nums, index, i);
        }
    }

    public static void shellSort(double[] nums) {//створюємо метод для сортування методом Шелла

        int h = 1;
        int n = nums.length;
        while (h < n / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < nums.length; i++) {
                for (int j = i; j >= h && nums[j - h] > nums[j]; j -= h) {
                    swap(nums, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void quickSort(double[] nums, int lowElem, int highElem) {//створюємо метод для швидкого сортування
        int middleElem = lowElem + (highElem - lowElem) / 2;
        double opora = nums[middleElem];
        int i = lowElem, j = highElem;
        while (i <= j) {
            while (nums[i] < opora) {
                i++;
            }

            while (nums[j] > opora) {
                j--;
            }

            if (i <= j) {
                swap(nums, i, j);
                i++;
                j--;
            }
        }

        if (lowElem < j) {
            quickSort(nums, lowElem, j);
        }
        if (highElem > i) {
            quickSort(nums, i, highElem);
        }
    }

    public static void quickGoaraSort(double[] nums, int lowElem, int highElem) {//створюємо метод для сортування методом Гоара
        if (lowElem < highElem) {
            int splitPoint = partition(nums, lowElem, highElem);
            quickGoaraSort(nums, lowElem, splitPoint);
            quickGoaraSort(nums, splitPoint + 1, highElem);
        }
    }

    public static int partition(double[] nums, int lowElem, int highElem) {
        double pivot = nums[lowElem];
        int i = lowElem - 1, j = highElem + 1;
        while (true) {
            do {
                i++;
            } while (nums[i] < pivot);
            do {
                j--;
            } while (nums[j] > pivot);
            if (i < j) swap(nums, i, j);
            else return j;
        }
    }

    public static void combSort(double[] nums) {//створюємо метод для сортування гребінцем
        int gap_length = nums.length;
        float shrinkFactor = 1.3f;
        boolean swapped = false;

        while (gap_length > 1 || swapped) {
            if (gap_length > 1) {
                gap_length = (int) (gap_length / shrinkFactor);
            }

            swapped = false;

            for (int i = 0; gap_length + i < nums.length; i++) {
                if (nums[i] > nums[i + gap_length]) {
                    swap(nums, i, i + gap_length);
                    swapped = true;
                }
            }
        }

    }

}

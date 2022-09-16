import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);//створюємо сканер
        System.out.print("Введіть число: ");
        long size = sc.nextLong();//вводимо число


        int [] array_start = task(size);//викликаємо метод для створення масиву
        int[] array_1 = new int[array_start.length];//створюємо масив для методу сортування вставками
        int[] array_2 = new int[array_start.length];//створюємо масив для методу сортування Шелла

        for(int i = 0 ; i < array_start.length ; i++){//заповняємо їх тими самими числами
            array_1[i] = array_start[i];
            array_2[i] = array_start[i];
        }

        System.out.println("Початковий масив");
        System.out.println((Arrays.toString(array_start)));//виводимо початковий масив
        System.out.println("Відсортований масив за дапомогою метода вставками");
        System.out.println(Arrays.toString(insertionSort(array_1)));//виводимо відсортований масив за дапомогою метода вставками
        System.out.println("Відсортований масив за дапомогою метода Шелла");
        System.out.println(Arrays.toString(shellSort(array_2)));//виводимо відсортований масив за дапомогою метода Шелла


    }

    public static int[] insertionSort(int[] nums) {//створюємо метод для сортування вставками
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
        return nums;
    }

    public static int[] shellSort(int[] nums) {//створюємо метод для сортування методом Шелла

        int h = 1;
        int n = nums.length;
        while (h < n / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < nums.length; i++) {
                for (int j = i; j >= h && nums[j - h] > nums[j]; j -= h) {
                    int temp = nums[j];
                    nums[j] = nums[j - h];
                    nums[j - h] = temp;
                }
            }
            h = h / 3;
        }
        return nums;
    }


    public static int[] task(long number) {

        String num = Long.toString(number);

        int[] res = new int[num.length()];
        for (int i = num.length() - 1; i >= 0; i--) {
            res[i] = (int) (number % 10);
            number /= 10;
        }
        return res;
    }

}

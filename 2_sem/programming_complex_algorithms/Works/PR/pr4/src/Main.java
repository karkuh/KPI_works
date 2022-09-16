import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Завдання 1 ");
        int[] arrForTask1 = new int[14];//стовримо масив з довжиною 14
        int []res1 = task1(randomNumbersForTask1(arrForTask1));//заповнимо його рандомними числами і викличемо метод task1
        rainbowPrintForTask1(arrForTask1,res1[1]);//виведемо початковий масив
        //виведемо результати
        if(res1[1]== -1){
            System.out.println("У масиві немає від'ємних чисел");
        }else{
            System.out.println("Сума чисел розташовних до першого від'ємного: " + res1[0] + "\nКількість елементів: " + res1[1]);
        }

        System.out.println("\nЗавдання 2 ");

        int[][] matrixForTask2 = new int[5][7];//створимо матрицю з довжиною 5х7
        randomNumbersForTask2(matrixForTask2);//заповнимо рандомними числами
        rainbowPrintForTask2(matrixForTask2);//виведемо матрицю
        System.out.println("Сума абсолютних значень від'ємних елементів масиву : " + task2(matrixForTask2));//виведемо результати

    }

    public static int[] task1(int[] a ){//створимо метод для 1 завдання

        int index = 0;
        int res[] = new int[2];//створимо масив в який будем розміщувати наші результати, такі як:
        // res[0] = Сума чисел розташовних до першого від'ємного, res[1] = кількість елементів
        int var = 0;
        for(int i = 0 ; i < a.length;i++){//за допомогою циклу знайдемо перше від'ємне значення елемента
            if(a[i] <0){
                index = i;
                res[1] = index;
                break;
            }else{//якщо його немає присвоюємо змінній index значення -1
                index = -1;
                res[1] = index;
            }
        }

      if(index!= -1 ) {//якщо index НЕдорівнює -1, то знайдемо суму чисел які розташовані до index
          for (int j = 0; j < index; j++) {
              var += a[j];
          }
      }
        res[0] = var;
        return res;//повернемо результат

    }

    public static int task2(int [][] a ){//створимо метод для 2 завдання
        int res = 0 ;
        for(int[] ints : a){
           for ( int j : ints){//за допомогою циклів переберемо всі значення елемента і знайдемо суму абсолютних значень від'ємних елементів масиву
               if(j<0){
                   res -= j;
               }
           }
        }
        return res;//повернемо результат
    }

    public static int[] randomNumbersForTask1(int[] a ){//метод для заповнення масиву рандомними числами в заданому діапазоні
        for(int i = 0 ; i < a.length;i++){
            a[i] = (int) (Math.random()*11 - 2);
        }
        return a;
    }

    public static void randomNumbersForTask2(int [][] a ){//метод для заповнення матриці рандомними числами в заданому діапазоні

        for(int i = 0 ; i < a.length;i++){
            for(int j = 0 ; j < a[0].length;j++){
                a[i][j] = (int) (Math.random()*10 - 5);
            }
        }
    }

    public static void rainbowPrintForTask1(int[] a , int index){//створимо метод для різнобарвного виведення масиву

        if(index !=-1) {
            System.out.print("[");
            for (int i = 0; i < a.length-1; i++) {
                if (i == index) {
                    System.out.print("\u001B[31m");
                    System.out.printf("%d, ", a[i]);
                    System.out.print("\u001B[0m");
                } else {
                    System.out.printf("%d, ", a[i]);
                }
            }
            if(index == a.length-1){
                System.out.print("\u001B[31m");
            }
            System.out.printf("%d",a[a.length-1]);
            System.out.print("\u001B[0m");
            System.out.print("]\n");
        }else{
            System.out.println(Arrays.toString(a));
        }

    }

    public static void rainbowPrintForTask2(int[][] a ){//створимо метод для різнобарвного виведення матриці

        for(int i = 0 ; i < a.length;i++){
            for(int j = 0 ; j < a[0].length;j++){
                if(a[i][j]<0){
                    System.out.print("\u001B[31m");
                    System.out.printf("%3d", a[i][j]);
                    System.out.print("\u001B[0m");
                }else{
                    System.out.printf("%3d", a[i][j]);
                }

            }
            System.out.println();
        }
    }
}

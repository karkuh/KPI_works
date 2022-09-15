import java.util.Arrays;//імпортуємо клас Arrays для роботи з масивами
import java.util.Scanner;//імпортуємо Scanner для введення даних з клавіатури

import static java.lang.Math.*;//імпортування бібліотеки для математичних обчислень
public class Lr3 {

    public static void main(String[] args) {//Створення головного метода "main"

        System.out.println("\t\t\tЗавдання 1\n");
        task1();//виклик методу task1
        System.out.println("\n\t\t\tЗавдання 2\n");
        double [] a = { -0.2,-0.3,1,8,5,2,-0.5,-0.8,4,6,-1,-2,};
        double [] b = {-2,7,6,4,2,0,-1,-9,2,0,4,3,-5};//створення двох різних послідовностей
        System.out.println(Arrays.toString(a));//виведення першої послідовності


        double dupa[] = task2(a);

        System.out.printf("Сума від'ємних: %.4f \n кількість додатніх елементів : %.4f\n",dupa[0],dupa[1]);//виклик методу task2 для першої послідовності
        System.out.println(Arrays.toString(b));//виведення другої послідовності
        double pisia []= task2(b);
        System.out.printf("Сума від'ємних: %.4f \n кількість додатніх елементів : %.4f\n",pisia[0],pisia[1]);//виклик методу task2 для першої послідовності


        System.out.println("\n\t\t\tЗавдання 3\n");
        Scanner sc = new Scanner(System.in);//створюємо сканер

        System.out.print("Введіть перше значення х: ");
        float x1 = sc.nextFloat();//надання значення змінній "x1" з клавіатури
        System.out.printf("Сума ряду : %.4f\n",task31(x1));//виклик методу task31 для першого значення х

        System.out.print("Введіть друге значення х: ");
        float x2 = sc.nextFloat();//надання значення змінній "x2" з клавіатури
        System.out.printf("Сума ряду : %.4f\n",task32(x2));//виклик методу task32 для другого значення х

    }


    public static  void task1 (){//створення метода task1
        float y ,z ;
        float h = (float) 0.2;//крок приросту
        float x = -2 ;//початкова границя діапазону
        float last = 5 ;//кінцева границя діапазону

        while(x <= last ){//створення циклу while
            y = (float) (2.5 * sin(x/2));
            z = (float) (sin(x) / log(x+4));
            System.out.printf("При х = %.1f, у = %.4f, z = %.4f\n",x,y,z);
            x += h ;
        }
    }


    public static double[] task2 (double []a ){//створення методу task2 в якому ми обраховуємо суму від'ємних та кількість додатних елементів
        double k = 0 ;
        double j = 0 ;
        //використаємо циклічний оператор for
        for (int i = 0 ; i < a.length ; i++){
            if(a[i]< 0){
                k += a[i];//від'ємні елементи
            }
            if(a[i]>0){
                j++ ;//кількість додатних елементів
            }
        }

        double bar [] = {k,j};




        return bar;
    }

    public static double task31 (double x){//створення метода task31 в якому будемо шукати суму ряда за допомогою оператора циклу while

        double y =  0 ;
        int k = 1 ;

        while ( k <= 5 ){//створення оператора while
            y += pow(-1,k) * getFactorial(2*k)/(4.5 * pow(x,2 * k - 1 )) ;
            k++;
        }
        return y ;
    }


    public static double task32 (double x){//створення метода task32 в якому будемо шукати суму ряда за допомогою оператора циклу for

        double y =  0 ;
        double z = 5 ;
        for (int k = 1 ; k < z+1 ; k++ ){//створення оператора for
            y += pow(-1,k) * getFactorial(2*k)/(4.5 * pow(x,2 * k - 1 ));

        }

        return y ;
    }
    public static int getFactorial(int f) {//створення метода для обчислення факторіалу
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }


}
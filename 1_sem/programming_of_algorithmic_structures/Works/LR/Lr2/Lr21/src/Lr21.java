import static java.lang.Math.*;//імпортування бібліотеки для математичних обчислень
public class Lr21 {

    public static void main(String[] args) {//Створення головного метода "main"
         System.out.print("---------------------------ЗАДАЧА 1---------------------------\n");
       double   a, b, z, x1,x2,x3;

          a = 0.2 ;
          b = 12.5;
        z =  pow(2.5 + b,2);
        x1 = -2.3;
        x2 = 0.6 ;
        x3 = 4.8;//Присвоєння значень змінним за умовою

        System.out.printf("При x1 = %.1f \n\tПри умові а = %.1f, b = %.1f, z = %.0f\n",x1, a,b,z); //Виведення на екран значення змінних
        System.out.printf("\ty = %.4f\n\n", task1(a,b,z,x1));//Виведення результату на екран

        System.out.printf("При x2 = %.1f \n\tПри умові а = %.1f, b = %.1f, z = %.0f\n",x2, a,b,z); //Виведення на екран значення змінних
        System.out.printf("\ty = %.4f\n\n", task1(a,b,z,x2));//Виведення результату на екран

        System.out.printf("При x3 = %.1f \n\tПри умові а = %.1f, b = %.1f, z = %.0f\n",x3, a,b,z);  //Виведення на екран значення змінних
        System.out.printf("\ty = %.4f\n\n",task1 (a,b,z,x3));//Виведення результату на екран

        System.out.println("---------------------------ЗАДАЧА 2---------------------------");
        double x []  = {-2.3, 0.6, 4.8};//Створимо масив зі значенням "х", які нам дані за умовою
        for( int i = 0;  i<3;i++)//Створимо цикл щоб перебирати елементи масива " x [ ] "
        {
            System.out.printf("\nПри х%d =  %.1f\n", i+1,x[i]);
            for (int j = 0; j < 3; j++) {//Створимо цикл для перебору виразу для вибору кейса
                switch (j) {//Створимо оператор "switch"
                    case 0:
                        a = -1.2;
                        b = 0.75;
                        z = log(abs(tan(b*x[i])));//Присвоєння значення змінним за умовою
                        System.out.printf("\tПри умові a = %.4f\t b =  %.4f\t z = %.4f\n", a, b, z);//Виведення на екран значення змінних
                        System.out.printf("\ty = %.4f\n", task2 (a, b, z,x[i] ));//Виведення результату на екран
                        break;//Вихід з блока
                    case 1:
                        a = 0.4;
                        b = 2.4;
                        z = log(abs(tan(b*x[i])));//Присвоєння значення змінним за умовою
                        System.out.printf("\tПри умові a = %.4f\t b =  %.4f\t z = %.4f\n", a, b, z);//Виведення на екран значення змінних
                        System.out.printf("\ty = %.4f\n", task2 (a, b, z,x[i] ));//Виведення результату на екран
                        break;//Вихід з блока
                    case 2:
                        a = 1.1;
                        b = 6.1;
                        z = log(abs(tan(b*x[i])));//Присвоєння значення змінним за умовою
                        System.out.printf("\tПри умові a = %.4f\t b =  %.4f\t z = %.4f\n", a, b, z);//Виведення на екран значення змінних
                        System.out.printf("\ty = %.4f\n", task2( a, b, z,x[i] ));//Виведення результату на екран
                        break;//Вихід з блока
                }
            }
        }
    }

    public static double task1 (double a, double b, double z, double x) {//Створення метода "task1"

       double result1 = 0;//створення змінної "result1" типу "double" і присвоєння їй значення
        if (x<=a) {//задання умови
            result1 =  a + sin(b*x) + cos(pow(x,2));//присвоєння математичного приклада

        } else if(x > a && x < log(b)) {//задання умови
            result1 = sqrt(a + b*x) + sin(z*x);//присвоєння математичного приклада

        }else if(x >= log(b)){//задання умови
            result1 = log(a + b * x + z);//присвоєння математичного приклада
        }
        return result1 ;
    }

    public static double task2 (double a, double b, double z, double x) {//Створення метода "task2"

        double result2 = 0;//створення змінної "result2" типу "double" і присвоєння їй значення
        if (x<=a) {//задання умови
            result2 =  a + sin(b*x) + cos(pow(x,2));//присвоєння математичного приклада

        } else if(x > a && x < log(b)) {//задання умови
            result2 = sqrt(a + b*x) + sin(z*x);//присвоєння математичного приклада

        }else if(x >= log(b)){//задання умови
            result2 = log(a + b * x + z);//присвоєння математичного приклада
        }
        return result2 ;
    }
}
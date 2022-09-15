import java.util.Scanner;//імпортування бібліотеки для введення інформації з клавіатури

public class Lr22 {
    public static void main(String[] args) {//Створення головного метода "main"
        Scanner sc = new Scanner(System.in);//Команда для створення сканера

        System.out.println("----------------Задача 3----------------");
        double x,y,z;//оголошення змінних типу "double"

        System.out.println("Введіть координати точки А");
        System.out.print("x = ");
        x = sc.nextInt();//надання значення змінній "x" з клавіатури
        System.out.print("y = ");
        y = sc.nextInt();//надання значення змінній "y" з клавіатури
        task3(x,y);//Виконання метода "task3"


        System.out.println("----------------Задача 4----------------");
        x = -2 ;
        y = 1.2 ;
        z = 9.5;//надання значення методом приcвоєння
        System.out.printf("Числа які менші за середнє арифметичне чисел х = %.0f , y = %.1f, z = %.1f \n",x,y,z);
        task4(x,y,z);//Виконання метода "task4"

        x = 0.5 ;
        y = 2 ;
        z = 0.15 ;//надання значення методом приcвоєння
        System.out.printf("Числа які менші за середнє арифметичне чисел х = %.1f , y = %.0f, z = %.2f \n",x,y,z);
        task4(x,y,z);//Виконання метода "task4"

        x = 0.4 ;
        y = 2.2 ;
        z = 9.5 ;//надання значення методом приcвоєння
        System.out.printf("Числа які менші за середнє арифметичне чисел х = %.1f , y = %.1f, z = %.1f \n",x,y,z);
        task4(x,y,z);//Виконання метода "tas4"


    }
    public static double task3(double x, double y) {//створення метода "task3"

        double result = 0;
        //задаємо умови згідно варіанту
        if( x == 0 && y == 0 ){
            System.out.println("Точка А є початком координат");

        }else if(x >= 0 && y >= 0 ){
            System.out.println("Точка А лежить в першій чверті");

        }else if( x <= 0 && y >= 0){
            System.out.println("Точка А лежить в другій чверті");

        }else if(x <= 0 && y <= 0 ){
            System.out.println("Точка А лежить в третій чверті");

        }else if(x >=0 && y <= 0 ){
            System.out.println("Точка А лежить в четвертій чверті");
        }
        return result;//повертаємо результат
    }

    public static double task4(double x, double y, double z) {//створення метода "task4"

        double middle ;
        middle =( x + y + z )/ 3 ;//знайходимо середнє арифметичне значення чисел

        //задаємо умови згідно варіанту
        if(x < middle){
            System.out.println("x =  " + x);
        }
        if(y < middle) {
            System.out.println("y =  " + y);
        }
        if(z < middle){
            System.out.println("z =  " + z);
        }

        return middle;//повертаємо результат
    }
}


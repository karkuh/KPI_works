
            import java.util.Date; // імпортування бібліотеки для роботи з часом
            import static java.lang.Math.*;// імпортування бібліотеки для математичних обчислень
            import java.util.Scanner;//імпортування бібліотеки для зчитування даних з клавіатури

    public class Lb1 {

        public static void main(String[] args) {//Створення головного метода "main"

            double y,z;
            double a,b,x;//надання змінним тип "double"
            a=1.1;
            b=0.004;
            x=0.2;//Присвоєння значень змінним


            System.out.println("When a = "+ a + ", b = " + b +", x = " + x + " then");//Виведення змінних


            y = CalcY(a,b,x);//Присвоєння значення метода "CalcY" змінній "y"
            z = CalcZ(a,b,x);//Присвоєння значення метода "CalcZ" змінній "z"


            System.out.printf("y = %f\n", y);//Виведення результату математичного рівнння
            System.out.printf("z = %.4f\n", z);//Виведення результату математичного рівнння


            System.out.print("enter a number to change a = ");
            a = Scanner();//Надання значення зміній "a" за допомогою клавіатури
            System.out.print("enter a number to change b = ");
            b = Scanner();//Надання значення зміній "b" за допомогою клавіатури
            System.out.print("enter a number to change x = ");
            x = Scanner();//Надання значення зміній "x" за допомогою клавіатури


            y = CalcY(a,b,x);//Присвоєння значення метода "CalcY" змінній "y"
            z = CalcZ(a,b,x);//Присвоєння значення метода "CalcZ" змінній "z"


            System.out.printf("y = %.4f\n", y);//Виведення результату математичного рівнння за данними введеними з клавіатури
            System.out.printf("z = %.4f\n", z);//Виведення результату математичного рівнння за данними введеними з клавіатури

            outputDate();//Виведення поточної дати і часу в певному форматі
        }

        public static double CalcY (Double a, Double b, Double x) {//Створення метода "CalcY" для розрахунку математичного рівняння
            double sum = pow(sin(pow((x*x+a),2)),3) - sqrt(x/b);
            return sum;
        }


        public static double CalcZ (Double a, Double b, Double x) {//Створення метода "CalcZ" для розрахунку математичного рівняння
            double sum = x*x/a + cos(pow((x+b),3));
            return sum;
        }


        public static void outputDate() {//Створення метода "outputDate" для виведення поточної дати і часу в певному форматі
            Date d = new Date();
            System.out.printf("%1$tA %1$te %1$tB\n", d);
        }


        public static double Scanner() {//Створення метода "Scanner" для вводу даних з клавіатури
            Scanner sc = new Scanner(System.in);
            double s = sc.nextDouble();
            return s ;
        }
        // Іноді мені здається, що компілятор ігнорує всі мої коментарі :)



    }


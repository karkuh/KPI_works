import java.util.Scanner;//імпортуємо сканер

public class Main {
    public static void main(String[] args) {//створюємо метод main


        System.out.print("Введіть ключ пошуку - ціле число: ");
        Scanner sc = new Scanner(System.in);//викликаємо сканер
        int key = sc.nextInt();
        int[] arr = new int[10];//створюмо масив цілих чисел з довжиною в 10 елементів

        for(int i = 0 ; i< arr.length;i++){//створюємо цикл для заповнення значень
            arr[i]=i;
        }

        int res = task(arr,key);//викликаємо метод task і присвоємо результат змінній res
        if(res==-1){
            System.out.println("Значення у масиві не знайдено");
        }else{
            System.out.println("Знайденно значення в елементі "+ res);
        }

    }
    public static int task(int[]a,int key){//створюємо метод для визначення індекса шуканого числа

        for(int i = 0 ; i < a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
}

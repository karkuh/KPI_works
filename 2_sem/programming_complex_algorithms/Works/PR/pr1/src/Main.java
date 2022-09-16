import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введіть ключ пошуку - ціле число: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int [] a = {1,2,3,4,5,6,5,7,8,9,10,11,10,12};
        ArrayList<Integer> res = task(a,key);
        if(res.isEmpty()){
            System.out.println("Значень не знайдено");
        }else{
            System.out.println("Знайденно значення в елементі "+ res);

        }

    }

    public static ArrayList<Integer> task(int[]arr, int key){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < arr.length;i++){
            if(arr[i]==key)
            {
                list.add(i);
            }
        }
        return list;
    }
}

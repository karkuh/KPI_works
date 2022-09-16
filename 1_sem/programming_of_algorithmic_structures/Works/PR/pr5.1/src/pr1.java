import java.util.Arrays;

public class pr1 {
    public static void main(String[] args) {
        System.out.println("початковий масив");
        int [] a = {20,60,80,120,40,180,100,200,160,140};
        System.out.println(Arrays.toString(a));
        System.out.println("відсортований масив");

        bubbleSort(a);
        isProgress(a);
    }

    public static int[] bubbleSort (int[] a ){
    boolean sorted = false ;
    char temp ;
    while (!sorted){
        sorted = true ;
        for(int i = 0 ; i < a.length-1;i++){
            if(a[i]>a[i+1]){
                temp = a[i];
                a[i]=a[i+1];
                a[i+1]= temp;
                sorted = false ;

            }

        }


    }
        System.out.println(Arrays.toString(a));
        return a;
    }


    public static void  isProgress(int[]a){
        int d = a[1]-a[0];
        int k = 0;
        for(int i = 0 ; i < a.length - 1 ; i ++){

            if(a[i+1]-a[i]==d) {
                k++;
            }
        }
        if(k==a.length-1){
            System.out.println("прогресія арифметична, різниця : " + d );
        }else{
            System.out.println("прогресія не арифметична");
        }



    }
}

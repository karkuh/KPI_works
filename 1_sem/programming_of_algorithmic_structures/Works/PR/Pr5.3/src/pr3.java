import java.util.Arrays;

public class pr3 {
    public static void main(String[] args) {
        int[][] a = {{5, 2, 3,5},
                    {22, 5, 6,8},
                    {18, 30, 9,14},
                     {58,12,9,0}
        };
        System.out.println("Матриця");
        for(int i = 0 ; i < a.length; i++ ){
            for(int j = 0 ; j < a.length; j++){
                System.out.print(a[i][j] + " ");

            }
            System.out.println(" ");
        }
        System.out.println("Масив до сортування");
        int[] b = matrica(a);
        System.out.println(Arrays.toString(b));


        System.out.println("Масив після сортування");
        bubbleSort(b);

    }

    public static int[] matrica(int[][] a) {
        int n = a.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            k += i;
        }

        int b[] = new int[k];
        k = 0;



        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                b[k] = a[i][j];
                k++;
            }
        }

        return b;
    }


    public static int[] bubbleSort (int[] a ){
        boolean sorted = false ;
        int temp ;
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
}



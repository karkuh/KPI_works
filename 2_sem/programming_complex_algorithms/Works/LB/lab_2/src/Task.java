public class Task {//створимо окремий клас task для методів обчислення завдання

    public static long recursion (int n ){//створимо метод з використанням рекурсії
        if( n < 0 ){
            System.out.print("\u001B[31m");
            System.out.println("error");
            System.exit(0);
        }
        if(n ==0 ) {
            return 1;
        }
        else {
            return 2 * n * recursion(n - 1);
        }
    }

    public static long not_recursion (int n ){//створимо метод без використання рекурсії
        long result = 1 ;

        for(int j = 1 ; j <= n ; j++ ){
           result *= 2 * j ;
        }
        return result ;
    }

}

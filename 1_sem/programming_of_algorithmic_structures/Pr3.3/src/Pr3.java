public class Pr3 {
    public static void main(String[] args) {
        int [] nums = {3,2,5,4,3};
        System.out.println(countEvens(nums));
    }
    public static  int countEvens(int[] nums) {
      int a = 0 ;
      for(int i = 0; i< nums.length ; i++){
          if( (nums [i] %2) == 0)
              a++;

      }
        return a ;



    }
}

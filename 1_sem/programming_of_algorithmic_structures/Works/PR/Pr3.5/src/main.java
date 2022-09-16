import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        int[] nums = {0,1,1,0,1,5,7,0,4,55,0,1,0,1,};

        nums = zeroFront(nums);
        System.out.println(Arrays.toString(nums));

    }



    public static  int[] zeroFront(int[] nums) {
        int k = 0;
        int [] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                k++;
            }
        }

        for(int h = 0 ; h < k; h++){
            result[h] = 0 ;
        }

        int i  = k ;
        for(int j = 0  ; j < nums.length; j++ ){
            if(nums[j] != 0){
                  result[i] = nums [j]  ;
                  i++;
            }
        }



return result ;
    }
}

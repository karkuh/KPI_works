

public class Pr4 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 2, 3, 1, 4, 6, 4, 3};
        if (haveThree(nums) == true)
            System.out.println("TRUE");
        else {
            System.out.println("FALSE");
        }

    }

    public static boolean haveThree(int[] nums) {
        boolean Three = false;
        int k = 0;

        if (nums[0] == 3) {
            k++;
        }

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == 3) {
                k++;
            }

            if (nums[i] == 3 && nums[i - 1] == 3) {
                return Three;
            }
        }

            if (k == 3) {
                return true;

            }return Three;



    }
}

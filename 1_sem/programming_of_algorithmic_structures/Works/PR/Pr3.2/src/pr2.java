public class pr2 {
    public static void main(String[] args) {

        int[] nums = {11, 2, 7, 4, 5, 9, 10};
        System.out.println(maxTriple(nums));

    }


    public static int maxTriple(int[] nums) {


        int el1 = nums[0];
        int el2 = nums[(nums.length - 1) / 2];
        int el3 = nums[nums.length - 1];
        if (el1 > el2 && el1 > el3) {
            return el1;
        } else if (el2 > el1 && el2 > el3) {
            return el2;

        } else if (el3 > el1 && el3 > el2) {
            return el3;
        }
        return 0;
    }
}


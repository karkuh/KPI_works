import static java.lang.Math.*;

public class Kr_Task {
    public boolean noTriples(int[] nums) {
        boolean a = true;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                a = false;
            }
        }
        return a;
    }

    public static double task2(double x, int lim) {
        double result = 0;
        for (int k = 1; k <= lim; k++) {
            if (k == 2) {
                result += 0;
            } else {
                result += (pow(-2, k) * pow(x, k + 1)) / (fact(k - 1) * cos((k + 1) * x));
            }
        }
        return result;
    }

    //Метод для обчислення факторіалу
    public static int fact(int fact) {
        if (fact < 2) return 1;
        int j = fact - 1;
        while (j >= 2) {
            fact *= j;
            j--;
        }
        return fact;
    }
}


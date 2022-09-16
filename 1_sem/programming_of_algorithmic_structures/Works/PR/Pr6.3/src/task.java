public class task {
    public static boolean catDog(String str)
    {

        int cat_result = 0;
        int dog_result = 0;
        for (int i=0; i< str.length()-2; i++) {

            String sub = str.substring(i, i+3);

            if (sub.equals("cat")) {
                cat_result++;

            }
            if (sub.equals("dog")) {
                dog_result++;

            }
        }
        if(dog_result == cat_result ) {
            return true;
        }
        else {
            return false;
        }
    }
}

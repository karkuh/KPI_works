public class task {
    public static  boolean endOther(String a, String b) {

        String a1 = a.toLowerCase ();
        String b1 = b.toLowerCase ();

        char A []  = a1.toCharArray();
        char B []  = b1.toCharArray();

        int c =  A.length; ;
        int d = B.length;



        boolean result = false;
        if(c<3 | d<3){

        }else {
            for (int i = 0; i < c; i++) {
                if (A[c - 1] == B[d - 1] & A[c - 2] == B[d - 2] & A[c - 3] == B[d - 3]) {
                    result = true;


                }
            }
        }
        return result ;
    }
}

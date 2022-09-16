public class task {

    public String withoutString(String base, String remove) {

        String result = null;

        String newbase = base.toLowerCase ();
        String newremove = remove.toLowerCase ();

        int r =  remove.length();//4
        for(int i = 0 ; i < base.length() -remove.length()  ; i++ ) {

            String sub = newbase.substring(i, i + r);

            if (sub.equals(newremove)){
                result = base.replace(newremove, "");
            }
        }

return result ;

    }


}

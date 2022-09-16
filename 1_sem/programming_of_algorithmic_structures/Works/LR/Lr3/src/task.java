import java.util.Arrays;

public class task {

    public static void main(String[] args) {
        int [] sequence = {-5,8,0,7,31,-39,0,11,-1,10};
        System.out.println("----Task1----");
        task1();
        System.out.println(Arrays.toString(sequence));
        System.out.println(Arrays.toString(task2(sequence)));
    }
    public static void task1(){
        double x;
        for(x=3.5;x<=10.5;x+=0.2){
            double y = Math.pow(Math.E,1/Math.sqrt(x))*Math.sin(x);
            double z = Math.tan(Math.sqrt(x))*Math.sin(x-Math.PI/2);
            System.out.printf("|x=%.2f|\t |y=%.4f| \t|z=%.4f|\n",x,y,z);
        }
    }


    public static int[] task2(int [] a){
        int neg=0,pos=0,zero=0;
        for(int i=0; i < a.length; i++){
            if(a[i]>0){
                pos+=1;
            }
            else if(a[i]<0){
                neg+=1;
            }
            else{
                zero+=1;
            }
        }
        return new int[] {neg,pos,zero};
    }
}
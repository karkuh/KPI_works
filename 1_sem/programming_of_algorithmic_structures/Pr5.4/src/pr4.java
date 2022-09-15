import java.util.Arrays;

public class pr4 {
    public static void main(String[] args) {

        String [] students = new String[25];
        students[0] = "Стельмащук";
        students[1] = "Скиба";
        students[2] = "Шахрайчук";
        students[3] = "Парубій";
        students[4] = "Кузьменко";
        students[5] = "Кравець";
        students[6] = "Остапишин";
        students[7] = "Яремчук";
        students[8] = "Жолудєва";
        students[9] = "Панько";
        students[10] = "Карпин ";
        students[11] = "Матюшко";
        students[12] = "Коваль";
        students[13] = "Михальчук";
        students[14] = "Любченко";
        students[15] = "Кравчук";
        students[16] = "Кухарчук";
        students[17] = "Гнатюк";
        students[18] = "Могилевський ";
        students[19] = "Лановий";
        students[20] = "Пасічка";
        students[21] = "Гончаренко";
        students[22] = "Барабаш";
        students[23] = "Ляшко";
        students[24] = "Малаєнко";



        float [] results = new float[25];
        random(results);

        String [] info = new String[25];

        System.out.println("Результат  Прізвище\n");
        for(int i = 0 ; i < results.length ; i++){
            info[i] =results[i] + "  " + students[i];
            System.out.println(info[i]);
        }
        System.out.println(" \n\n\n");


        Arrays.sort(info);
        for(int j = 0 ; j < info.length; j++){
            System.out.println(info[j]);
        }
        System.out.println("\n\n\n");

        System.out.println(" ");


        int k = 1 ;
        for(int i = 0 ; i < 4 ; i++){
            System.out.printf("%d місце: %s\n",k, info[i]);
            k++;

        }

    }

    public static float  [] random (float[]a ){

    for (int i = 0 ; i < a.length; i++){
        a [i] = (float) (12 + Math.random()*3);
    }

    return  a ;
    }




}

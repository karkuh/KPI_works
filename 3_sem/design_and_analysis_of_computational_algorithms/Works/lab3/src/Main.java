import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        MyOS os = new MyOS();
        FileReader fr = new FileReader("info.txt");
        Scanner scan = new Scanner(fr);
        System.out.println("Зміст файлу info.txt");


        while (scan.hasNextLine()) {
            String name = scan.nextLine();
            String format = scan.nextLine();
            String size = scan.nextLine();
            os.addFile(name,Float.parseFloat(size),format);
            System.out.println(name + "\n" + format + "\n" + size);
            System.out.println(scan.nextLine());
        }



        System.out.println(os);
        os.deleteFile(2);
        System.out.println(os);
        os.renameFile(3,"photo10");
        System.out.println(os);
        os.changeFormat(5,"word");
        System.out.println(os);
        os.changeSize(6,99.9f);
        System.out.println(os);
        os.searchName("photo1");
        os.searchFormat("jpg");
        os.searchSize(30,50);


    }
}

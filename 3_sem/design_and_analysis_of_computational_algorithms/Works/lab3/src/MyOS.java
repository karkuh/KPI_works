import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyOS {
    public DoublyLinkedList<MyFile> Files;
    public Date date ;
    DateFormat df = new SimpleDateFormat("dd.MM.y k:mm:ss");
    public MyOS() {
        System.out.println("Welcome to my OS");
        Files = new DoublyLinkedList<>();
    }


    public void addFile(String name, float size,String format ) throws InterruptedException {
        date = new Date();
        Files.addLast(new MyFile(name,size,df.format(date),format));
        Thread.sleep(1000);
    }

    public void deleteFile(int position ) throws Exception {
        if (position < 1 || position > Files.size()) throw new Exception("position error");
        System.out.println("delete " + position + " file");
        Files.removeByIndex(position-1);
    }

    public void renameFile(int position, String name) throws Exception {
        if (position < 1 || position > Files.size()) throw new Exception("position error");
        System.out.println("rename " + position + " file on: " + name);
        date = new Date();
        MyFile temp = Files.get(position-1);
        temp.setName(name);
        temp.setDate(df.format(date));
        Files.set(position-1,temp);
    }

    public void changeFormat(int position, String format) throws Exception {
        if (position < 1 || position > Files.size()) throw new Exception("position error");
        System.out.println("change format " + position + " file on: " + format);
        date = new Date();
        MyFile temp = Files.get(position-1);
        temp.setFormat(format);
        temp.setDate(df.format(date));
        Files.set(position-1,temp);
    }

    public void changeSize(int position, float size) throws Exception {
        if (position < 1 || position > Files.size()) throw new Exception("position error");
        System.out.println("change size " + position + " file on: " + size);
        date = new Date();
        MyFile temp = Files.get(position-1);
        temp.setSize(size);
        temp.setDate(df.format(date));
        Files.set(position-1,temp);
    }

    public void searchName(String name){
        System.out.println("Name: " + name);
        int i = 0;
        System.out.println("_____________________________________________________________");
        System.out.println("|Name File|     | Date of creation  |     |Format|     |Size|");
        System.out.println("|---------|-----|-------------------|-----|------|-----|----|");
        for (MyFile temp: Files) {
            if (name.equals(temp.Name)){
                System.out.print(temp);
                i++;
            }
        }
        if (i==0){
            System.out.println("No files found");
        }
        System.out.println("-------------------------------------------------------------\n");
    }

    public void searchFormat(String format){
        System.out.println("Format: " + format);
        int i = 0;
        System.out.println("_____________________________________________________________");
        System.out.println("|Name File|     | Date of creation  |     |Format|     |Size|");
        System.out.println("|---------|-----|-------------------|-----|------|-----|----|");
        for (MyFile temp: Files) {
            if (format.equals(temp.Format)){
                System.out.print(temp);
                i++;
            }
        }
        if (i==0){
            System.out.println("No files found");
        }
        System.out.println("-------------------------------------------------------------\n");

    }

    public void searchSize(float size){
        System.out.println("Size: " + size);
        int i = 0;
        System.out.println("_____________________________________________________________");
        System.out.println("|Name File|     | Date of creation  |     |Format|     |Size|");
        System.out.println("|---------|-----|-------------------|-----|------|-----|----|");

        for (MyFile temp: Files) {
            if (size == (temp.Size)){

                System.out.print(temp);
                i++;
            }
        }
        if (i==0){
            System.out.println("No files found");
        }
        System.out.println("-------------------------------------------------------------\n");
    }


    public void searchSize(float startSize,float finishSize){
        System.out.printf("Size: [%.1f , %.1f]\n",startSize,finishSize);
        int i = 0;
        System.out.println("_____________________________________________________________");
        System.out.println("|Name File|     | Date of creation  |     |Format|     |Size|");
        System.out.println("|---------|-----|-------------------|-----|------|-----|----|");

        for (MyFile temp: Files) {

            if (temp.Size >= startSize && temp.Size <= finishSize){

                System.out.print(temp);
                i++;
            }
        }
        if (i==0){
            System.out.println("No files found");
        }
        System.out.println("-------------------------------------------------------------\n");
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        int i = 1 ;
        sb.append("______________________________________________________________________\n");
        sb.append("|№ |     |Name File|     | Date of creation  |     |Format|     |Size|\n");
        sb.append("|--|-----|---------|-----|-------------------|-----|------|-----|----|\n");

        for (MyFile temp: Files) {
            sb.append("|").append(String.format("%-2d", i)).append("|     ").append(temp);
            i++;
        }
        sb.append("----------------------------------------------------------------------\n");

        return sb.toString();
    }
}

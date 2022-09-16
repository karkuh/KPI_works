public class Main {
    public static void main(String[] args) {
        Delta delta1 = new Delta(3, 4);
        Delta delta2 = new Delta(6, 8);

        delta1.c();
        delta2.c();


        delta1.info();
        delta2.info();

      // delta1.similarityy(delta2);

            boolean f = delta1.similarity(delta2);
            if (f) {
                System.out.println("Трикутники подібні ");
            }else {
                System.out.println("Трикутники не подібні");
            }


    }
}
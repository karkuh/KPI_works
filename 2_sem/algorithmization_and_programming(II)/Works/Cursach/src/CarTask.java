import Graph.Graph;
import Graph.Edge;
import MyStructures.BST;
import MyStructures.DoublyLinkedList;

public class CarTask<E> {


    private final float massCar;
    private final float maxLoad;
    private final float fuelDiesel;
    private float fuelMass;
    private final float k;
    private DoublyLinkedList<Float> listSum;
    private Graph<E> graph;
    private BST<String, Integer> bst;

    public CarTask(float massCar, float maxLoad, float fuelDiesel, Graph<E> graph, BST<String, Integer> bst) {
        this.massCar = massCar;
        this.maxLoad = maxLoad;
        this.fuelMass = massCar + maxLoad;
        this.fuelDiesel = fuelDiesel;
        this.graph = graph;
        this.bst = bst;
        this.listSum = new DoublyLinkedList<>();
        this.k = fuelDiesel / (massCar + maxLoad);
    }

    public float getDisel(float S, float mass) {

        if (fuelMass - mass < massCar) throw new NullPointerException("Вантаж закінчився");
        float res = (S / 100) * k * fuelMass;
        fuelMass -= mass;
        listSum.addLast(res);
        return res;

    }

    public void printBaggage(){
        int counter = 0;
        System.out.print("\u001B[33m");
        System.out.print("Вантаж: ");
        System.out.print("\u001B[0m");
        for (String i :bst.keys()) {
            if (counter%3==0) System.out.println();
            System.out.print(bst.select(counter) + " --> ");
            System.out.print(bst.get(i) + " кг;\t");
            counter++;
        }
        System.out.println();


    }

    public float getDisel(DoublyLinkedList<E> list) {
        System.out.print("\u001B[34m");
        System.out.print("\nПрокладаємо маршрут: ");

        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " --> ");
        }
        System.out.println(list.get(list.size() - 1));
        System.out.print("\u001B[0m");

        DoublyLinkedList<Edge<E>> edges = new DoublyLinkedList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            edges.addLast(graph.getEdge(list.get(i), list.get(i + 1)));
        }


        for (Edge<E> e : edges) {


            float S = (float) e.getWeight();
            float mass = (float) bst.get(e.getVer2().getObject().toString());
            System.out.printf("%s --> %s : %.2f км пройдено , %.2f кг вигружено,  %.2f л витрачено\n", e.getVer1().getObject(), e.getVer2().getObject(), S, mass, getDisel(S, mass));
        }

        System.out.printf("Всього бензину: %.2f л\n", sumDiesel());
        return sumDiesel();

    }

    public void info() {
        System.out.print("\u001B[34m");
        System.out.println("\n\tHYNDAI HD78");
        System.out.print("\u001B[0m");
        System.out.println("Маса автомобіля: " + massCar + " кг");
        System.out.println("Допустима маса вантажу: " + maxLoad + " кг");
        System.out.println("Обсяг дизелю на 100 км при повному завантажені: " + fuelDiesel + " л\n");

    }


    public void resetDiesel() {
        listSum.clear();
    }


    public float sumDiesel() {
        float res = 0;
        for (int i = 0; i < listSum.size(); i++) {
            res += listSum.get(i);
        }
        return res;
    }

}

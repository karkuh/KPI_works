package Graph;

public class Edge<E> {

    private final Vertex<E> ver1, ver2;
    private int weight;

    public Edge(E one, E two, int weight) {

        ver1 = new Vertex<>(one);
        ver2 = new Vertex<>(two);
        this.weight = weight;
    }

    public Vertex<E> getVer1() {
        return ver1;
    }

    public Vertex<E> getVer2() {
        return ver2;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "(" + ver2.getObject() + ", " + weight + " км)";
    }

}

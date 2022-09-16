package Graph;

import MyStructures.DoublyLinkedList;

public class Graph<E> {

    private final Vertex<E>[] vertices;
    private final DoublyLinkedList<Edge<E>> edges;
    private DoublyLinkedList<E> data;


    public Graph(DoublyLinkedList<E> data) {
        this.data = data;
        vertices = new Vertex[data.size()];
        for (int i = 0; i < data.size(); i++) {
            vertices[i] = new Vertex<>(data.get(i));
        }
        edges = new DoublyLinkedList<>();

    }


    public int sizeVertex() {
        return vertices.length;
    }

    public int sizeEdges() {
        return edges.size();
    }

    public void addEdge(E one, E two, int weight) {
        Edge<E> e = new Edge<>(one, two, weight);
        edges.addLast(e);
        vertices[data.indexOf(one)].connectVertex(vertices[data.indexOf(two)]);

    }

    public void deleteEdge(E one, E two) {

        edges.remove(edges.indexOf(getEdge(one, two)));
        vertices[data.indexOf(one)].disconnectVertex(vertices[data.indexOf(two)]);

    }

    public Vertex<E> getVertex(E e) {
        for (Vertex<E> v : vertices) {
            if (String.valueOf(v.getObject()).equals(String.valueOf(e)))
                return vertices[data.indexOf(e)];
        }
        throw new NullPointerException("Вершини " + e.toString() + " не існує");
    }


    public Edge<E> getEdge(E one, E two) {
        for (Edge<E> e : edges) {
            if (one.toString().equals(e.getVer1().toString()) && two.toString().equals(e.getVer2().toString())) {
                return e;
            }
        }
        throw new NullPointerException("ребра " + one + " --> " + two + " не существует");
    }

    public boolean edgeSubsist(E one, E two) {

        for (int i = 0; i < edges.size(); i++) {
            if (one.toString().equals(edges.get(i).getVer1().toString()) && two.toString().equals(edges.get(i).getVer2().toString())) {
                return true;
            }
        }
        return false;
    }

    public int getDistance(E one, E two) {
        if (edgeSubsist(one, two))
            return getEdge(one, two).getWeight();
        return 1000000;
    }

    public Vertex<E>[] getVertices() {
        return vertices;
    }

    public DoublyLinkedList<E> getData() {
        return data;
    }

    public DoublyLinkedList<Edge<E>> getEdges() {
        return edges;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (int i = 0; i < sizeVertex(); i++) {
            if (vertices[i].getVertices().size() == 0) continue;
            if (vertices[i] == null) continue;
            sb.append(vertices[i] + " --> ");
            int j;

            for (j = k; j < edges.size(); j++) {
                if (String.valueOf(edges.get(j).getVer1()).equals(String.valueOf(vertices[i]))) {
                    sb.append(edges.get(j).toString() + "; ");
                } else {
                    break;
                }
            }
            k = j;
            sb.append(System.lineSeparator());
        }
        return sb.toString();

    }


}

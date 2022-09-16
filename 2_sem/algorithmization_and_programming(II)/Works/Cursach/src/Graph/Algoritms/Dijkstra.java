package Graph.Algoritms;

import Graph.Graph;
import Graph.Vertex;
import MyStructures.DoublyLinkedList;

import static java.lang.Integer.min;

public class Dijkstra<E> {
    private DoublyLinkedList<E> data;
    private Graph graph;

    private Vertex<E>[] vertices;
    private DoublyLinkedList<Integer> tarryingVertices;
    private int[] D;

    private E startElem;

    public Dijkstra(Graph graph) {
        this.graph = graph;
        this.data = graph.getData();
        this.vertices = graph.getVertices();
        this.D = new int[graph.getVertices().length];
    }


    public void dijkstraRes(E startElem, E elemFinish) {

        this.startElem = startElem;

        dijkstra(startElem);
        dijkstraTo(elemFinish);
        System.out.println(searchDist(startElem, elemFinish));

    }


    public void dijkstra(E startElem) {
        DoublyLinkedList<E> start = saveData();
        changeData(startElem);

        D[0] = 0;
        tarryingVertices = new DoublyLinkedList<>();

        for (Vertex<E> v : vertices) {
            tarryingVertices.addLast(data.indexOf(v.getObject()));
        }

        tarryingVertices.remove(data.indexOf(data.get(0)));

        for (int i = 1; i < vertices.length; i++) {
            D[i] = graph.getDistance(data.get(0), data.get(i));
        }

        while (!tarryingVertices.isEmpty()) {
            int minD = 1000000;
            int minV = 0;

            for (Integer v : tarryingVertices) {
                if (D[v] < minD) {
                    minD = D[v];
                    minV = v;
                }
            }

            tarryingVertices.remove(data.indexOf(data.get(tarryingVertices.indexOf(minV))));

            for (int v : tarryingVertices) {
                D[v] = min(D[v], D[minV] + graph.getDistance(data.get(v), data.get(minV)));
            }

        }

        data = start;
    }



    public void dijkstraTo(E elemFinish) {
        DoublyLinkedList<E> start = saveData();
        changeData(startElem);
        System.out.print("\u001B[33m");
        System.out.println("\nНайкоротший шлях від " + startElem + " до " + elemFinish);
        System.out.print("\u001B[0m");
        System.out.println(startElem + " --> " + elemFinish + " : " + D[data.indexOf(elemFinish)] + " км");
        data = start;
    }


    public DoublyLinkedList<E> saveData() {
        DoublyLinkedList<E> save = new DoublyLinkedList<>();
        for (int i = 0; i < data.size(); i++) {
            save.addLast(data.get(i));
        }
        return save;
    }

    public void changeData(E elem) {
        DoublyLinkedList<E> res = new DoublyLinkedList<>();

        for (int i = data.indexOf(elem); i < vertices.length; i++) {
            res.addLast(data.get(i));
        }
        for (int j = 0; j < data.indexOf(elem); j++) {
            res.addLast(data.get(j));
        }
        for (int i = 0; i < data.size(); i++) {
            this.data.set(i, res.get(i));
        }

    }

    public DoublyLinkedList<E> searchDist(E startE, E finishE) {

        DoublyLinkedList<E> start = saveData();
        changeData(startElem);
        int result = D[data.indexOf(finishE)];
        data = start;


        DoublyLinkedList<E> res = new DoublyLinkedList<>();
        res.addLast(startE);
        Vertex<E> one = graph.getVertex(startE);

        for (Vertex<E> temp : one.getVertices()) {
            int w1 = graph.getEdge(one.getObject(), temp.getObject()).getWeight();

            if (w1 == result) {
                res.addLast(temp.getObject());
                return res;
            }
            for (Vertex<E> temp1 : temp.getVertices()) {
                int w2 = graph.getEdge(temp.getObject(), temp1.getObject()).getWeight();
                if (w1 + w2 == result && temp1.getObject().equals(finishE)) {
                    res.addLast(temp.getObject());
                    res.addLast(temp1.getObject());
                    return res;
                }
                for (Vertex<E> temp2 : temp1.getVertices()) {
                    int w3 = graph.getEdge(temp1.getObject(), temp2.getObject()).getWeight();
                    if (w1 + w2 + w3 == result && temp2.getObject().equals(finishE)) {
                        res.addLast(temp.getObject());
                        res.addLast(temp1.getObject());
                        res.addLast(temp2.getObject());
                        return res;
                    }

                    for (Vertex<E> temp3 : temp2.getVertices()) {
                        int w4 = graph.getEdge(temp2.getObject(), temp3.getObject()).getWeight();
                        if (w1 + w2 + w3 + w4 == result && temp3.getObject().equals(finishE)) {
                            res.addLast(temp.getObject());
                            res.addLast(temp1.getObject());
                            res.addLast(temp2.getObject());
                            res.addLast(temp3.getObject());
                            return res;
                        }
                    }

                }

            }
        }
        return res;
    }
}
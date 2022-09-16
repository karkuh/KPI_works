package Graph.Algoritms;

import Graph.Graph;
import Graph.Vertex;
import MyStructures.DoublyLinkedList;

public class DepthFirstSearch<E> {

    private Graph<E> graph ;
    private final boolean[] marked;
    private final DoublyLinkedList<Vertex<E>> result;
    private DoublyLinkedList<E> data;
    private E firstly;
    int k = 0;


    public DepthFirstSearch(Graph<E> graph) {
        this.graph = graph;
        data = graph.getData();
        marked = new boolean[graph.sizeVertex()];
        result = new DoublyLinkedList<>();

    }


    public void dfs( E item) {

        if (k==0){
            firstly = item;
        }
        k++;

        marked[data.indexOf(item)] = true;
        result.addLast(graph.getVertex(item));
        for (Vertex<E> w : graph.getVertex(item).getVertices()) {
            if (!marked[data.indexOf(w.getObject())]) {
                dfs( w.getObject());
            }
        }
    }

    public void printRes() {
        System.out.print("\u001B[34m");
        System.out.print("DFS з вершини " + firstly + " : ");
        System.out.print("\u001B[0m");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + ", ");
        }
        System.out.println();
    }

}

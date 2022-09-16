package Graph.Algoritms;

import Graph.Graph;
import Graph.Vertex;
import MyStructures.DoublyLinkedList;
import MyStructures.Queue;

public class BreadthFirstSearch<E> {

    private final boolean[] marked;
    private Graph<E> graph ;
    private DoublyLinkedList<E> data;
    private final DoublyLinkedList<Vertex<E>> result;
    private E firstly;

    public BreadthFirstSearch(Graph<E> graph) {

        this.graph = graph;
        data = graph.getData();
        marked = new boolean[graph.getVertices().length];
        result = new DoublyLinkedList<>();

    }


    public void bfs(E item) {
        this.firstly = item;
        Queue<Vertex<E>> deque = new Queue<>();
        marked[data.indexOf(item)] = true;
        Vertex<E> currentV = new Vertex(item);
        deque.enqueue(currentV);
        while (!deque.isEmpty()) {
            E v = deque.dequeue().getObject();
            result.addLast(graph.getVertex(v));
            for (Vertex<E> w : graph.getVertex(v).getVertices()) {
                if (!marked[data.indexOf(w.getObject())]) {
                    deque.enqueue(w);
                    marked[data.indexOf(w.getObject())] = true;
                }
            }
        }
    }

    public void printRes() {
        System.out.print("\u001B[33m");
        System.out.print("BFS з вершини " + firstly + " : ");
        System.out.print("\u001B[0m");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + ", ");
        }
        System.out.println();
    }
}


import Graph.Algoritms.BreadthFirstSearch;
import Graph.Algoritms.DepthFirstSearch;
import Graph.Algoritms.Dijkstra;
import Graph.Graph;
import MyStructures.BST;
import MyStructures.DoublyLinkedList;


public class Main {
    public static void main(String[] args) {


        ReadInfoForFile read = new ReadInfoForFile();
        DoublyLinkedList<String> cities = read.readCities();
        BST<String,Integer> bst = read.fillingBST();

        Graph<String> graph = new Graph<>(cities);
        read.fillingGraph(graph);


        System.out.print("\u001B[33m");
        System.out.println("\t\tГраф міст заходу України");
        System.out.print("\u001B[0m");
        System.out.println(graph);


        BreadthFirstSearch<String > bfs = new BreadthFirstSearch<String>(graph);
        bfs.bfs("Lutsk");
        bfs.printRes();

        DepthFirstSearch<String > dfs = new DepthFirstSearch<String>(graph);
        dfs.dfs("Kyiv");
        dfs.printRes();

        Dijkstra<String >  dijkstra = new Dijkstra<String >(graph);
        dijkstra.dijkstraRes("Lutsk","Kyiv");

        System.out.print("\u001B[34m");
        System.out.println("\nВидалимо ребро Lutsk --> Rivne");
        System.out.print("\u001B[0m");
        graph.deleteEdge("Lutsk","Rivne");


        dijkstra.dijkstraRes("Lutsk","Kyiv");


        CarTask<String > car = new CarTask<String>(7500,5000,18,graph,bst);
        car.info();
        car.printBaggage();
        car.getDisel(dijkstra.searchDist("Lutsk","Kyiv"));


    }


}
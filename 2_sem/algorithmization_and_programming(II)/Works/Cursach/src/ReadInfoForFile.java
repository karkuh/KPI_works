import Graph.Graph;
import MyStructures.BST;
import MyStructures.DoublyLinkedList;

import java.io.File;
import java.util.Scanner;


public class ReadInfoForFile {

    public BST<String, Integer> fillingBST() {
        BST<String, Integer> bst = new BST<>();
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\Cursach\\src\\resours\\info.csv"));
            sc.useDelimiter("\n");
            sc.next();

            while (sc.hasNext()) {
                String[] list = sc.next().split(",");

                bst.put(list[0], Integer.parseInt(list[1]));
            }
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bst;
    }


    public DoublyLinkedList<String> readCities() {

        DoublyLinkedList<String> cities = new DoublyLinkedList<>();

        try {
            Scanner sc = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\Cursach\\src\\resours\\info.csv"));
            sc.useDelimiter("\n");
            sc.next();

            while (sc.hasNext()) {
                String[] list = sc.next().split(",");
                cities.addLast(String.valueOf(list[0]));

            }

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return cities;
    }

    public void fillingGraph(Graph<String> graph) {

        try {
            Scanner sc = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\Cursach\\src\\resours\\info.csv"));
            sc.useDelimiter("\n");
            sc.next();


            while (sc.hasNext()) {
                String[] list = sc.next().split(",");

                String firstCity = list[0];

                if (!list[2].equals("null")) {

                    String[] connectedCities = list[2].split(";");

                    String[] distance = list[3].split(";");

                    for (int i = 0; i < connectedCities.length; i++) {
                        graph.addEdge(String.valueOf(firstCity), String.valueOf(connectedCities[i]), Integer.parseInt(distance[i]));
                    }

                }
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

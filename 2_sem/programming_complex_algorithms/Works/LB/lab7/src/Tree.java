import java.util.NoSuchElementException;

public class Tree {

    private Node root;

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {//метод для виведення розміру дерева
        return size(root);

    }

    private int size(Node temp) {
        if (temp == null) return 0;
        else return temp.size;
    }

    public void put(int value) {//метод для добавлення ключа
        root = put(root, value);
    }

    private Node put(Node temp, int value) {
        if (temp == null) return new Node(value, 1);
        int cmp = value - temp.getValue();
        if (cmp < 0) temp.left = put(temp.left, value);
        else if (cmp > 0) temp.right = put(temp.right, value);
        temp.size = 1 + size(temp.left) + size(temp.right);
        return temp;
    }

    public String findNodeByValue(int value) { // поиск узла по значению
        Node currentNode = root; // начинаем поиск с корневого узла
        while (currentNode.getValue() != value) { // поиск покуда не будет найден элемент или не будут перебраны все
            if (value < currentNode.getValue()) { // движение влево?
                currentNode = currentNode.getLeft();
            } else { //движение вправо
                currentNode = currentNode.getRight();
            }
            if (currentNode == null) { // если потомка нет,
                return null; // возвращаем null
            }
        }
        return currentNode.toString(); // возвращаем найденный элемент
    }

    public int min() {//метод для звертання до мінімального ключа
        if (isEmpty()) throw new NoSuchElementException("called min() with empty symbol table");
        return min(root).getValue();
    }

    private Node min(Node temp) {
        if (temp.left == null) return temp;
        else return min(temp.left);
    }


    public void deleteMin() {//видалення мінімального елементу
        if (isEmpty()) throw new NoSuchElementException("MyStructures.BST underflow");
        root = deleteMin(root);
    }

    private Node deleteMin(Node temp) {
        if (temp.left == null) return temp.right;
        temp.left = deleteMin(temp.left);
        temp.size = size(temp.left) + size(temp.right) + 1;
        return temp;
    }


    public void delete(int value) {//метод для виведення ключа
        root = delete(root, value);
    }

    private Node delete(Node temp, int value) {
        if (temp == null) return null;

        int cmp = value - temp.getValue();
        if (cmp < 0) temp.left = delete(temp.left, value);
        else if (cmp > 0) temp.right = delete(temp.right, value);
        else {
            if (temp.right == null) return temp.left;
            if (temp.left == null) return temp.right;
            Node t = temp;
            temp = min(t.right);
            temp.right = deleteMin(t.right);
            temp.left = t.left;
        }
        temp.size = size(temp.left) + size(temp.right) + 1;
        return temp;
    }

    public int select(int k) {//метод для звертання до ключа
        if (k < 0 || k >= size()) throw new IllegalArgumentException("argument to select() is bigger than size or < 0");
        Node x = select(root, k);
        return x.value;
    }

    private Node select(Node x, int k) {
        if (x == null) return null;
        int t = size(x.left);
        if (t > k) return select(x.left,  k);
        else if (t < k) return select(x.right, k-t-1);
        else return x;
    }


    public void task1() {//завдання №1
        preorderForTask1(root);
    }

    public void preorderForTask1(Node temp) {

        if (temp == null)
            return;

        if (temp.getValue() < 0) {
            temp.setKey(0);
        }
        preorderForTask1(temp.getLeft());
        preorderForTask1(temp.getRight());

    }

    public void task2() {//завдання №2
        preorderForTask2(root);
    }

    public void preorderForTask2(Node temp) {

        if (temp == null)
            return;

        if (temp.getRight() != null && temp.getLeft() != null) {
            if ((temp.getRight().getValue() + temp.getLeft().getValue()) % 2 == 0) {
                System.out.println(temp);
                System.out.printf("  %2d  \n", temp.getValue());
                System.out.println("  /\t\\  \n / \t \\ ");
                System.out.printf("%d    %2d\n\n", temp.getLeft().getValue(), temp.getRight().getValue());
            }
        }
        preorderForTask2(temp.getLeft());
        preorderForTask2(temp.getRight());

    }

//    public void pp(){
//        int gg = 16;
//        String symbol = " ";
//        while (){
//
//
//        }
//
//    }


    public void printTree() { // метод для виведення дерева
        Stack<Node> globalStack = new Stack<>();
        globalStack.push(root);
        int gaps = 32;
        boolean isRowEmpty = false;
        // String separator = "-----------------------------------------------------------------";
        String separator = "/////////////////////////////////////////////////////////////////";
        System.out.println(separator);
        while (!isRowEmpty) {
            Stack<Node> localStack = new Stack<>();
            isRowEmpty = true;

            for (int j = 0; j < gaps; j++)
                System.out.print(' ');
            while (!globalStack.isEmpty()) {
                Node temp = globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.getValue());
                    localStack.push(temp.getLeft());
                    localStack.push(temp.getRight());
                    if (temp.getLeft() != null ||
                            temp.getRight() != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("  ");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps /= 2;
            while (!localStack.isEmpty())
                globalStack.push(localStack.pop());
        }
        System.out.println(separator);
    }



//    public void printTree() { // метод для виведення дерева
//        Stack<Node> globalStack = new Stack<>();
//        globalStack.push(root);
//        int gaps = 32;
//        boolean isRowEmpty = false;
//       // String separator = "-----------------------------------------------------------------";
//        String separator = "/////////////////////////////////////////////////////////////////";
//        System.out.println(separator);
//        while (!isRowEmpty) {
//            Stack<Node> localStack = new Stack<>();
//            isRowEmpty = true;
//
//            for (int j = 0; j < gaps; j++)
//                System.out.print(' ');
//            while (!globalStack.isEmpty()) {
//                Node temp = globalStack.pop();
//                if (temp != null) {
//                    System.out.print(temp.getValue());
//                    localStack.push(temp.getLeft());
//                    localStack.push(temp.getRight());
//                    if (temp.getLeft() != null ||
//                            temp.getRight() != null)
//                        isRowEmpty = false;
//                } else {
//                    System.out.print("  ");
//                    localStack.push(null);
//                    localStack.push(null);
//                }
//                for (int j = 0; j < gaps * 2 - 2; j++)
//                    System.out.print(' ');
//            }
//            System.out.println();
//            gaps /= 2;
//            while (!localStack.isEmpty())
//                globalStack.push(localStack.pop());
//        }
//       System.out.println(separator);
//    }


    private static class Node {

        private int value;
        private Node left, right;
        private int size;

        public Node(int value, int size) {
            this.value = value;
            this.size = size;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setKey(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            String left = String.valueOf(getLeft().getValue());
            String right = String.valueOf(getRight().getValue());
            return "Node{" +
                    "value=" + value +
                    ", leftChild value =" + left +
                    ", rightChild value =" +right +
                    '}';
        }

    }

}
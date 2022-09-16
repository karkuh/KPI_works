public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.put(10);
        tree.put(-2);
        tree.put(28);
        tree.put(-6);
        tree.put(5);
        tree.put(20);
        tree.put(32);
        tree.put(-10);
        tree.put(-3);
        tree.put(-1);
        tree.put(8);
        tree.put(19);
        tree.put(21);
        tree.put(30);
        tree.put(35);
        System.out.println("Початкове дерево");
        tree.printTree();
        System.out.println("Завдання 1 ");
        tree.task1();
        tree.printTree();
        System.out.println("Завдання 2 ");
        tree.task2();

    }

}

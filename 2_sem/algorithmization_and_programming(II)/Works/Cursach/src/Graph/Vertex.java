package Graph;

import MyStructures.DoublyLinkedList;

public class Vertex<E>  {

    private E object;
    private DoublyLinkedList<Vertex<E>> vertices;

    public Vertex(E object) {
        this.object = object;
        vertices = new DoublyLinkedList<>();
    }

    public E getObject() {
        return object;
    }

    public void setObject(E object) {
        this.object = object;
    }


    public DoublyLinkedList<Vertex<E>> getVertices() {
        return vertices;
    }

    public void setVertices(DoublyLinkedList<Vertex<E>> vertices) {
        this.vertices = vertices;
    }

    public void connectVertex(Vertex<E> v) {
        vertices.addLast(v);
    }

    public void disconnectVertex(Vertex<E> v) {
        vertices.remove(this.getVertices().indexOf(v));
    }

    public String toString() {
        return String.valueOf(object);
    }


}

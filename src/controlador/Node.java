package controlador;

public class Node {
    public Nivel data;
    public Node next;
    
    public Node(Nivel data, Node next) {
        this.data = data;
        this.next = next;
    }
}

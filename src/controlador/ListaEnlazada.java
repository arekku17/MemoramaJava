package controlador;

import java.util.LinkedList;


public class ListaEnlazada {
    Node head;
    Node tail;
    int size = 0;
    
    public void addFirst(Nivel data) {
        
        head = new Node(data, head); 
        //Because head is the pointer to the first node   

        // Traversing the list
        Node temp = head;
        while (temp != null) {
            tail = temp;
            temp = temp.next;
        }
        size++;
    }

    //Adding at the end of the list

    public void addLast(Nivel data) {
        if (head == null) {
            addFirst(data);
            //When the list is empty, i.e, head points to null
        } else {//When list is populated
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
                temp.next = new Node(data, null);
            }
        }
    }
    
    
    public void shift(int shiftAmount) {
    int normalizedShift = (shiftAmount % size + size) % size;
    if (normalizedShift != 0) {
        tail.next = head;
        for (int i = 0; i < size - normalizedShift - 1; i++)
            head = head.next;
        tail = head;
        head = head.next;
        tail.next = null;
    }
}
    
    public LinkedList<Nivel> obtenerLista()
    {
        LinkedList<Nivel> lista = new LinkedList<>();
        Node aux = head;
    
        // Traverse through the LinkedList
        while (aux != null) {
            // Print the data at current node
            lista.add(aux.data);
    
            // Go to next node
            aux = aux.next;
        }
        return lista;
    }
    
}

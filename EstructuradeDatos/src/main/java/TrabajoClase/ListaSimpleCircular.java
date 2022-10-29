/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoClase;

/**
 *
 * @author yulien
 */
public class ListaSimpleCircular {

    private node<Persona> head;
    private node<Persona> tail;

    public ListaSimpleCircular() {

    }

    public void insertar(Persona value) {
        node<Persona> nuevoNodo = new node<Persona>(value);
        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setNext(head);
        } else if (head.getValue().getId() > value.getId()) {
            nuevoNodo.setNext(head);
            head = nuevoNodo;
            tail.setNext(head);
        } else if (tail.getValue().getId() <= value.getId()) {
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(head);
        } else {

            node<Persona> aux = tail;
            while (aux.getNext().getValue().getId() < value.getId()) {
                aux = aux.getNext();
            }

            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }

    public void imprimirLista() {
        node<Persona> aux = head;
        while (aux != tail) {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }
        System.out.println(tail.getValue().toString());
    }
}

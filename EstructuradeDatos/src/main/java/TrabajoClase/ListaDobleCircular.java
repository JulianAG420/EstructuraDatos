/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoClase;

/**
 *
 * @author yulien
 */
public class ListaDobleCircular {
     private node<Persona> head;
    private node<Persona> tail;

public ListaDobleCircular() {

}
public void insertar(Persona value) {
        node<Persona> nuevoNodo = new node<Persona>(value);
        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setNext(head);
            head.setBack(tail);
        } else if (head.getValue().getId() > nuevoNodo.getValue().getId()) {
            nuevoNodo.setNext(head);
            head = nuevoNodo;
            tail.setNext(head);
            head.setNext(tail);
        } else if (tail.getValue().getId() <= value.getId()) {
            nuevoNodo.setBack(tail);
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(head);
            head.setBack(tail);
        } else {
            node<Persona> aux = head;
            while (aux.getNext().getValue().getId() < value.getId()) {
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
            nuevoNodo.setBack(aux);
            
            aux.getNext().setBack(nuevoNodo);
            nuevoNodo.setBack(aux);
        }
}
          public boolean existe (int id){
             boolean Julian =false;
            node<Persona> aux = head; 
            while(aux!=tail){
               
            
            if(id==aux.getValue().getId()){
              Julian = true;
              aux=tail;
            } else {
                 aux=aux.getNext();
            }
            }
        return Julian;
        
    }
          
    public void modifica (Persona p){
         node<Persona> aux = head;
            if(head==null){
                System.out.println("No hay datos en la lista");
                
          }else{
                while(aux.getValue().getId() !=p.getId()&& aux.getNext() != head){
                aux=aux.getNext();
    }
                if(p.getId()==aux.getValue().getId()){
                    aux.getValue().setNombre(p.getNombre());
                }else{
                    System.out.println("El id ingresado no se encuentra en la lista");
                }
            }
    }
    
    public void elimina (int id){
          node<Persona> aux = head;
            if(head==null){
                System.out.println("No hay datos en la lista");
                
          }else{
                while(aux.getValue().getId() !=id && aux.getNext() != head){
                aux=aux.getNext();
            }
                if(aux.getValue().getId() == id){
                    aux=aux.getNext();
                    aux.setBack(aux.getBack().getBack());
                    aux=aux.getBack();
                    aux.setNext(aux.getNext().getNext());
                }else{
                    System.out.println("El id no se encuentra en la lista");
                }
    }
    }
    
    public Persona extrae(int id){
          
            node<Persona> aux = head;
                
            if(head==null){
          System.out.println("No hay datos en esta lista");
          return null;
             
            
            } else {
               while(aux.getValue().getId() !=id && aux.getNext() != head){
                   aux=aux.getNext();
               }
               if(aux.getValue().getId() == id){
                    node<Persona> temp = aux;
                    aux=aux.getNext();
                    aux.setBack(aux.getBack().getBack());
                    aux=aux.getBack();
                    aux.setNext(aux.getNext().getNext());
                    return temp.getValue();
               
            
            
                }     else{
                        System.out.println("El id no se encuentra en la lista");
                        return null;
                        }   
       
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
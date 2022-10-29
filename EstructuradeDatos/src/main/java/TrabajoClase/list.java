/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoClase;

/**
 *
 * @author yulien
 */
public class list {
    private node<Persona> cabeza;
    
    public list(){
        
    }
    public void insertar(Persona value){
    node <Persona> nuevoNodo = new node <Persona>(value);
        if (cabeza==null){
            cabeza= nuevoNodo;
        }
        else if(cabeza.getValue().getId()>nuevoNodo.getValue().getId()){
            nuevoNodo.setNext(cabeza);
            cabeza=nuevoNodo;
        }
        else if(cabeza.getValue().getId()<nuevoNodo.getValue().getId()&&cabeza.getNext()==null){
            cabeza.setNext(nuevoNodo);
        } else{
            node <Persona> aux= cabeza;
            while(aux.getNext()!=null && aux.getNext().getValue().getId()<nuevoNodo.getValue().getId()){
                aux= aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }
        public void imprimirLista (){
            node <Persona> aux=cabeza;
            while(aux!=null){
                System.out.println(aux.getValue().toString());
                aux=aux.getNext();
            }
        }
        public void eliminar(){
            int idBuscado = 0;
        boolean SeEncontro = false;
        if(cabeza==null){
            System.out.println("No hay datos en la lista");
            
}else{
            node<Persona>aux=cabeza;
            while(aux.getNext()!=null){
              
                if (aux.getNext().getValue().getId()==idBuscado){
                    System.out.println("Datos eliminados"+aux.getNext().getValue().toString());
                    aux.setNext(aux.getNext().getNext());
                    SeEncontro= true;
                }else{
                    aux=aux.getNext();
                }
            }
            if(SeEncontro==false)
                System.out.println("No hay una persona con tal id");
        }
    }
}
    


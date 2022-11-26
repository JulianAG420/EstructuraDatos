/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoClase;

/**
 *
 * @author yulien
 */
public class ArbolBinario {
    
    
    private NodoArbol raiz;
    private int altura;
    
    
    public void inserta(int value){
        if (raiz == null){
            raiz = new NodoArbol(value);
        }else{
            insertar(raiz, value);
        }
    }
    
    
    public void insertar(NodoArbol nodo, int value){
        if (value <= nodo.getId()){
            if (nodo.getHijoIzq() == null){
                nodo.setHijoIzq(new NodoArbol(value));
            }else{
                insertar(nodo.getHijoIzq(), value);
            }
        }else {
            if (nodo.getHijoDer() == null){
                nodo.setHijoDer(new NodoArbol(value));
            } else {
                insertar(nodo.getHijoDer(), value);
            }
        }
    }
    
    public void inOrden(){
        if(raiz != null){
            inOrdenRecorrer(raiz);
        }else {
            System.out.println("El arbol esta vacio");
        }
    }
    
    private void inOrdenRecorrer(NodoArbol nodo){
        if (nodo != null){
            inOrdenRecorrer(nodo.getHijoIzq());
            System.out.println(nodo.getId() + " , ");
            inOrdenRecorrer(nodo.getHijoDer());
        }
    }
    
  
    private void retornarAltura(NodoArbol nodo, int nivel){
        if (nodo != null){
            retornarAltura(nodo.getHijoIzq(), nivel + 1);
            if (nivel > altura){
                altura = nivel;
            }
            System.out.println("En este momento, gire a la derecha " + nodo.getId());
            retornarAltura(nodo.getHijoDer(), nivel + 1);
        }
        
    }
    public int retornarAltura(){
        altura = 0; 
        retornarAltura(raiz, 1);
        System.out.println(altura);
        return altura;
    }
}

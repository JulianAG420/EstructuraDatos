/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrabajoClase;

import java.util.Scanner;

/**
 *
 * @author yulien
 */
public class clasemain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[] arr = {12, 34, 64, 2, 3,};
//        //System.out.println(recursion.factorial(3));
//        System.out.println(recursion.encontrarMax(arr, 1, arr[0]));
//    }
//      ------------------------ Pilas ----------------------------
//                      stack<Integer> Pila = new stack<Integer>();
//                      Pila.push(1);
//                      Pila.push(2);
//                      Pila.push(4);
//                      System.out.println(Pila.pop());
//                      System.out.println(Pila.pop());
//                      System.out.println(Pila.pop());
//                      System.out.println(Pila.pop());

//        -------------Colas----------------
//queue<Integer> Cola = new queue<Integer>();
//        Cola.enqueue(1);
//        Cola.enqueue(2);
//        Cola.enqueue(4);
//        System.out.println(Cola.dequeue());
//        System.out.println(Cola.dequeue().getValue());
        queue<Integer> prueba = new queue<Integer>();
        for (int i = 0; i < 101; i++) {
            prueba.enqueue(i);
        }
        int temp = prueba.findByIndex(23).getValue();
        queue<Integer> prueba2 = new queue<Integer>();
        for (int i = 0; i<100; i++){
            prueba2.enqueue(i);
        }
        
        
        
        
//           ------------ejercicio-----------
//Scanner sc = new Scanner(System.in);
//int buscar = Integer.parseInt(sc.nextLine());
//int popTemp;
//
//boolean encontrado=false;
//           stack<Integer> Pila1 = new stack<Integer>();
//           Pila1.push(17);
//           Pila1.push(20);
//           Pila1.push(3);
//           Pila1.push(4);
//           
//           while (encontrado){
//               popTemp=Pila1.pop();
//               if(buscar == popTemp){
//                   System.out.println("Encontrado: "+popTemp);
//                   encontrado=true;
//               }else {
//                   System.out.println("NO encontrado: "+popTemp);
//                   encontrado=false;
//                   Pila1.pop();
//               }
//           }
//    }
    }
}

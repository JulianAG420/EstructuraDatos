/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrabajoClase;

/**
 *
 * @author yulien
 */
public class recursion {
 static int arr []= {12, 34, 64, 2, 3, 90};
    
 
 
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else {
            System.out.println(n);
            return n * factorial(n-1);
            
        }   
    }
    // ejemplo encontrarMax(arr, 0,0)
    public static int encontrarMax(int[] numeros, int indice, int max){
        if (indice != numeros.length){
            
            if (numeros[indice] > max){
                System.out.println("\n");
                System.out.print(max);
                System.out.print("  ");
                System.out.print(numeros[indice]);
                max=encontrarMax(numeros, indice + 1, numeros[indice]);
            }
            else{
                System.out.println("\n");
                System.out.print(max);
                System.out.print("  ");
                System.out.print(numeros[indice]);
                max = encontrarMax(numeros, indice + 1, max);
                
            }
        }
        return max;
        
    }
    
}
    


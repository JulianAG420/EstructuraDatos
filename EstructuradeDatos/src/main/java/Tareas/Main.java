/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tareas;

import java.util.Scanner;

/**
 *
 * @author yulien
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //------------------------------Ejercicio 1 --------------------
        Integer num = 1662662;

        System.out.println("-".repeat(40) + "\n" + "Ejercicio 1" + "\n" + "Original: " + num);
        System.out.println("Invertido: " + EjerciciosTarea.ejercicio1(num));

        //------------------------------Ejercicio 2 --------------------
        String palabra = "Hola este es el ejercicio 2";

        System.out.println("-".repeat(40) + "\n" + "Ejercicio 2" + "\n" + "String: " + palabra);
        EjerciciosTarea.ejercicio2(palabra, 0);

        //------------------------------Ejercicio 3 --------------------
        System.out.println("-".repeat(40) + "\n" + "Ejercicio 3");

        int[] vector;    //Declaro el vector
        System.out.println("Ingrese la cantidad de números: ");
        int n = Integer.parseInt(sc.nextLine());
        vector = new int[n];  // Tanaño del vectror

        //LLeno el vector
        vector = EjerciciosTarea.ejercicio3P1(vector, 0);
        //Muestro el vector
        EjerciciosTarea.ejercicio3P2(vector, 0);
        //Busco el mayor
        System.out.println(EjerciciosTarea.ejercicio3P3(vector, 0, 0));

//        //------------------------------Ejercicio 4 --------------------
        System.out.println("-".repeat(40) + "\n" + "Ejercicio 4");
        Scanner teclado = new Scanner(System.in);
        int numero, suma;

        System.out.println("Escriba un numero");
        numero = teclado.nextInt();

        suma = EjerciciosTarea.sumarNumerosAnteriores(numero);
        System.out.println("El resultado del numero anterior es:" + suma);
//
//        //------------------------------Ejercicio 5 --------------------
        System.out.println("-".repeat(40) + "\n" + "Ejercicio 5");
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Introduzca la tabla que desea ver :");
        int tabla = teclado2.nextInt();
        System.out.println("Introduzca la cantidad de multiplicadores: ");
        int factor = teclado2.nextInt();
        teclado2.close();
        System.out.println("Tabla del " + tabla);
        System.out.println("////////////");
        EjerciciosTarea.multiplicacion(tabla, factor);

        //Variante del ejercicio 5
        System.out.println("-".repeat(40) + "\n" + "Ejercicio 5");
        EjerciciosTarea.ejercicio5_Ej2(0, 0);
    }

}

    
    


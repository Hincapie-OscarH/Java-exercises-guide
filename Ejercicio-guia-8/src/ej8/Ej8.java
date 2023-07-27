/*
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
   pedirá de nuevo hasta que la nota sea correcta.
 */
package ej8;

import java.util.Scanner;

public class Ej8 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numero;
        
        do{
            System.out.println("Digite un numero");
            numero = leer.nextInt();
        }while (numero < 0 || numero > 10);
        
        System.out.println("Nota correcta1");

    }
    
}
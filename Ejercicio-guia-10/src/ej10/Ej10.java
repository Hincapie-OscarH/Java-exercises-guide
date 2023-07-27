/*
    Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
    ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
    5 *****
    3 ***
    11 ***********
    2 **
 */
package ej10;

import java.util.Scanner;
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numero;
        int contador = 0;
        
        for (int i = 0; i < 4; i++) {
            do{
            System.out.println("Digite el número ");
            numero = leer.nextInt();

            }while (numero < 0 && numero > 21);
            System.out.print(numero);
            while(contador < numero){
                System.out.print(" * ");
                contador++;
            }
            System.out.println("");
            contador = 0;
        }   
    }  
}

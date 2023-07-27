/*
    Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
    bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
    el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
    Nota: recordar el uso de la sentencia break.
 */
package ej9;

import java.util.Scanner;

public class Ej9 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numero;
        int c = 0;
        int suma = 0;
        
        do{
            System.out.println("Digite el número ");
            numero = leer.nextInt();
            if(numero < 0){
                continue;
            }else{
                suma += numero;
            c++;
            }
        }while (c != 20 && numero != 0);
        
        if (numero == 0){
            System.out.println("Se capturó el numero cero");
        }
        
        System.out.println("La suma de los números leidos es: "+suma);
        
    }
    
}
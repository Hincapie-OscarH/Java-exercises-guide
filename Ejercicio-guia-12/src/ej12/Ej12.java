/*
 * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package ej12;

import java.util.Scanner; 

public class Ej12 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite el número 1");
        int a = leer.nextInt();
        System.out.println("Digite el número 2");
        int b = leer.nextInt();
        
        EsMultiplo(a, b);
        
    }
    
    public static void EsMultiplo(int a, int b) {
        if (a % b == 0){
            System.out.println("El número "+a+" es multiplo de "+b);
        }else{
            System.out.println("El número "+a+" no es multiplo de "+b);
        }
    
    }
    
}

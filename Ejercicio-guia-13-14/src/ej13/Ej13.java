/*
 EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.

EJERCICIO 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
package ej13;

import java.util.Scanner; 
public class Ej13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el tamaño del arreglo");
        int n = leer.nextInt();
        
        String[] equipo = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Escriba el nombre del compañero #"+i+1);
            equipo[i] = leer.next();
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(i+1+". "+equipo[i]);
        }
    }
    
}
//Escribir un programa que pida dos números enteros por teclado y calcule 
//la sumade los dos. 
//El programa deberá después mostrar el resultado de la suma

package ej1;
import java.util.Scanner;

public class Ej1 {

    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     System.out.println("Escribir 2 números enteros ");
     int num1;
    
     int num2;
    
     num1 = leer.nextInt();
     num2 = leer.nextInt();
     
     System.out.println("La suma de ambos números es " + (num1+num2));
     
        
   }
    
}
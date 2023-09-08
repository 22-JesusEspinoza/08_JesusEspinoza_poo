
package pkg22_jesusespinoza;

import java.util.Scanner;


public class calculadora {
    
//atributos
    int a;
    int b;
    int totalSU;
    int totalRE;
    int totalMUL;
//metodo multiplicar
   
public void multiplicar() {
    totalMUL = a*b;
    System.out.println("la multiplicacion sale: " + totalMUL);
}
public void sumar(){
    totalSU = a+b;
    System.out.println("la suma sale: " +  totalSU);
}
public void restar(){
    totalRE = a-b;
    System.out.println("la resta sale: " + totalRE);
}
public void ingresarA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        a = scanner.nextInt();
    }

    public void ingresarB() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el segundo número: ");
        b = scanner.nextInt();
    }
}


package pkg22_jesusespinoza;

import java.util.Scanner;


public class persona {
    
//atributos
    String nombre;
    int edad;
   
//metodos
   
public void hablar(){
 
    System.out.println( nombre + " te esta saludando");
   
}

public void orden() {
   
    System.out.println(nombre + " tiene " + edad + " años");
}
 public void ingresarNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la persona: ");
        nombre = scanner.nextLine();
    }

    public void ingresarEdad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la edad de la persona: ");
        edad = scanner.nextInt();
    }
}


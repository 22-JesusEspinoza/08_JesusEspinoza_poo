
package pkg22_jesusespinoza;

import javax.swing.JOptionPane;


public class animal {
    
//atributos
   
    String nombre;
    String especie;
    int edad;
   
//metodos
public void comer(){    
   System.out.println("el " + nombre + " esta comiendo ");
}

public void correr(){
    System.out.println("el " + especie + " corre");
}

public void dormir(){
   System.out.println("el " + nombre + " de " + edad + " años de edad come ");
}

public void preguntar(){
    nombre = JOptionPane.showInputDialog("Ingresa el nombre del animal: ");
    especie = JOptionPane.showInputDialog("Ingresa la especie del animal: ");
    String edadString = JOptionPane.showInputDialog("Ingresa la edad del animal: ");
    this.edad = Integer.parseInt(edadString);
}
}

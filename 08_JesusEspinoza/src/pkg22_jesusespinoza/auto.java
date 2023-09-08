
package pkg22_jesusespinoza;

import javax.swing.JOptionPane;


public class auto {
    
    //atributos
    String marca;
    String color;
    int km;
   
    //Metodos
   
public void acelerar(){
    System.out.println("el auto color " + color + " acelera");
}

public void frenar(){
    System.out.println("El auto " + marca + " frena");
}

public void sonido(){
    System.out.println("El auto de " + km + " de kilometraje tiene buen sonido");
}

public void preguntar(){
    marca = JOptionPane.showInputDialog("Ingresa la marca del auto: ");
    color = JOptionPane.showInputDialog("Ingresa el color del auto: ");
    String kilometrajeString = JOptionPane.showInputDialog("Ingresa el kilometraje del auto: ");
        this.km = Integer.parseInt(kilometrajeString);
}
}

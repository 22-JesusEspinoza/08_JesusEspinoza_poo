/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_08;

/**
 *
 * @author Zec
 */
public class Trabajador02_08 extends Persona_08 {
    
    // Atributos
    String profesion;
    double salario;
    boolean estaTrabajando;

    // Constructor
    public Trabajador02_08(String nombre, int edad, String profesion, double salario, boolean estaTrabajando) {
        super(nombre, edad);
        this.profesion = profesion;
        this.salario = salario;
        this.estaTrabajando = estaTrabajando;
    }

    // Métodos
    public void trabajar() {
        System.out.println(nombre + " está trabajando como " + profesion + ".");
    }
    public void calcularSalario() {
        System.out.println(nombre + " tiene un salario de S/" + salario + ".");
    }
}

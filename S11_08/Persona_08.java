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
public class Persona_08 {
    // Atributos
    String nombre;
    int edad;

    // Constructor 
    public Persona_08(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_08JesusEspinoza;

/**
 *
 * @author Zec
 */
public class Persona2 {
    
    String nombre;
    int edad;

    // Constructor
    public Persona2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre
    public String obtenerNombre() {
        return this.nombre;
    }

    // Método para obtener la edad
    public int obtenerEdad() {
        return this.edad;
    }
}

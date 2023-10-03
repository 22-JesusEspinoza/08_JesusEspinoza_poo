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
public class Persona1 {
    String nombre;
    int edad;

    
    public Persona1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public void cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    
    public void cambiarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }

    
    public String obtenerNombre() {
        return this.nombre;
    }

    
    public int obtenerEdad() {
        return this.edad;
    }
}


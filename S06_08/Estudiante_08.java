/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S06_00;

/**
 *
 * @author Zec
 */
public class Estudiante_08 {  
    // Atributos
    String nombre;
    int edad;
    
    // Métodos
    public void imprimirInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
    
    // Sobrecarga del constructor
    public Estudiante_08(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }
    public Estudiante_08(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobrecarga de métodos
    public void imprimirInformacion(String persona) {
        System.out.println(persona + " Nombre: " + this.nombre);
        System.out.println(persona + " Edad: " + this.edad);
    }

    // Método con valor de retorno
    public String obtenerNombre() {
        return this.nombre;
    }
}


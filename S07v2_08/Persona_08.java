/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07v2_08;

/**
 *
 * @author Zec
 */
public class Persona_08 {
    // Atributos
    String nombre;
    int edad;
    double altura;

    // Constructor por defecto
    public Persona_08() {
        this.nombre = "Sin Nombre";
        this.edad = 0;
        this.altura = 0.0;
    }

    // Constructor con parámetros
    public Persona_08(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Método sin parámetros y sin valor de retorno
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ".");
    }

    // Método con parámetros y valor de retorno
    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad + " años, Altura: " + altura + " metros.";
    }

    // Sobrecarga de método: otro método con el mismo nombre pero diferente tipo de parámetro
    public void cumplirAnios(int cantidad) {
        edad += cantidad;
        System.out.println("¡Feliz cumpleaños! Ahora tengo " + edad + " años.");
    }

    // Sobrecarga de método: otro método con el mismo nombre pero diferente tipo de parámetro
    public void cumplirAnios(double cantidad) {
        edad += (int) cantidad; // Convertir la cantidad a entero
        System.out.println("¡Feliz cumpleaños! Ahora tengo " + edad + " años.");
    }

    // Método con parámetros y sin valor de retorno
    public void crecer(int anios, double aumentoAltura) {
        edad += anios;
        altura += aumentoAltura;
        System.out.println("¡Crecí! Ahora tengo " + edad + " años y mido " + altura + " metros.");
    }
}

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
public class Estudiante01_08 extends Persona_08 {
    
    // Atributos
    String curso;
    int horasEstudio;
    boolean tieneLibros;

    // Constructor 
    public Estudiante01_08(String nombre, int edad, String curso, int horasEstudio, boolean tieneLibros) {
        super(nombre, edad);
        this.curso = curso;
        this.horasEstudio = horasEstudio;
        this.tieneLibros = tieneLibros;
    }

    // Métodos
    public void estudiar() {
        System.out.println(nombre + " está estudiando " + horasEstudio + " horas para el curso de " + curso + ".");
    }
    public void revisarLibros() {
        if (tieneLibros) {
            System.out.println(nombre + " tiene libros para estudiar.");
        } else {
            System.out.println(nombre + " no tiene libros para estudiar.");
        }
    }
}

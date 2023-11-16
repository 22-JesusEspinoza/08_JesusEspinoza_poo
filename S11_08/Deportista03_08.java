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
public class Deportista03_08 extends Persona_08{
    
    // Atributos
    String deporte;
    int horasEntrenamiento;
    boolean enForma;

    // Constructor
    public Deportista03_08(String nombre, int edad, String deporte, int horasEntrenamiento, boolean enForma) {
        super(nombre, edad);
        this.deporte = deporte;
        this.horasEntrenamiento = horasEntrenamiento;
        this.enForma = enForma;
    }

    // Métodos
    public void entrenar() {
        System.out.println(nombre + " está entrenando durante " + horasEntrenamiento + " horas para " + deporte + ".");
    }
    public void Forma() {
        if (enForma) {
            System.out.println(nombre + " está en buena forma física.");
        } else {
            System.out.println(nombre + " necesita trabajar en su forma física.");
        }
    }
}

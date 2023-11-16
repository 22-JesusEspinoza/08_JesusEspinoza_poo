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
public class MainS11_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona_08 persona = new Persona_08("Francis", 17);
        Estudiante01_08 estudiante = new Estudiante01_08("Jesus", 20, "Programacion Orientada a Objetos", 3, true);
        Trabajador02_08 trabajador = new Trabajador02_08("Michaell", 18, "Programador", 10000.0, true);
        Deportista03_08 deportista = new Deportista03_08("Azumi", 17, "Voley", 2, true);

        
        persona.saludar();
        persona.dormir();

        estudiante.saludar();
        estudiante.estudiar();
        estudiante.revisarLibros();

        trabajador.saludar();
        trabajador.trabajar();
        trabajador.calcularSalario();

        deportista.saludar();
        deportista.entrenar();
        deportista.Forma();
    }
    }
    


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
public class Main_S07v2_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear dos objetos de Persona_08
        Persona_08 persona1 = new Persona_08("Juan", 25, 1.75);
        Persona_08 persona2 = new Persona_08();

        
        persona1.saludar();
        System.out.println(persona1.obtenerInformacion());

        persona2.saludar();
        System.out.println(persona2.obtenerInformacion());

        
        persona1.cumplirAnios(1);
        persona2.cumplirAnios(0.5);

       
        persona1.crecer(2, 0.1);
        persona2.crecer(1, 0.05);
    }
}

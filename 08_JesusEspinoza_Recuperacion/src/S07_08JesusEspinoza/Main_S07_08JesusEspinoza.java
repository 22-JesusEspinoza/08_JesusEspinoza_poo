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
public class Main_S07_08JesusEspinoza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Persona1 persona01 = new Persona1("Juan", 25);
        System.out.println("Nombre: " + persona01.obtenerNombre());
        System.out.println("Edad: " + persona01.obtenerEdad());
        persona01.cambiarNombre("Carlos");
        persona01.cambiarEdad(30);
        System.out.println("Nombre: " + persona01.obtenerNombre());
        System.out.println("Edad: " + persona01.obtenerEdad());
        
        
        Persona2 persona02 = new Persona2("Maria", 28);
        System.out.println("Nombre: " + persona02.obtenerNombre());
        System.out.println("Edad: " + persona02.obtenerEdad());
    }
}
    

    
    


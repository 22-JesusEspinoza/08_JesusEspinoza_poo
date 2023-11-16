/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07v1_08;

/**
 *
 * @author Zec
 */
public class Main_S08v1_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona1_08 persona1 = new Persona1_08();
        Persona2_08 persona2 = new Persona2_08();
        
        persona1.realizarTarea("Programación", 5);
        persona1.calcularSueldo("Jesus", 10000);
        persona1.enviarCorreo("jesus.espinoza@vallegrande.edu.pe", "Falta de tarea", true);

        int suma = persona2.sumar(3, 7);
        System.out.println("La suma de 3 y 7 es: " + suma);
        int longitud = persona2.obtenerLongitud("El curso de Poo copletado");
        System.out.println("La longitud de ese texto es: " + longitud);
        double cuadrado = persona2.elevarCuadrado(4.5);
        System.out.println("El cuadrado de 4.5 es: " + cuadrado);
    }
    
}

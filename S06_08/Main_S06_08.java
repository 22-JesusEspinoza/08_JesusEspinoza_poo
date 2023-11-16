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
public class Main_S06_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 
        Estudiante_08 estudiante = new Estudiante_08("Juan", 20);

        estudiante.imprimirInformacion();

        estudiante.imprimirInformacion("Estudiante:");
        
        String nombre = estudiante.obtenerNombre();
        System.out.println("El nombre del estudiante es: " + nombre + " y tiene " + 20 + " años");
        

        Calculadora_08 calculadora = new Calculadora_08(10.0, 5.0);
  
        System.out.println("Suma: " + calculadora.sumar());
        System.out.println("Suma con número adicional: " + calculadora.sumar(2.0));
        System.out.println("Resta: " + calculadora.restar());
        System.out.println("Resta con número adicional: " + calculadora.restar(2.0));
 
        double numero1 = calculadora.obtenerNumero1();
        double numero2 = calculadora.obtenerNumero2();
        System.out.println("El primer número es: " + numero1);
        System.out.println("El segundo número es: " + numero2);
    }
}
    


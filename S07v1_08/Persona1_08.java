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
public class Persona1_08 {
    
    // Métodos con parametros
    public void realizarTarea(String tarea, int horas) {
        System.out.println("Realizando la tarea '" + tarea + "' durante " + horas + " horas.");
    }
    public void calcularSueldo(String nombre, double salarioBase) {
        double sueldoTotal = salarioBase * 1.1; // Aumento del 10%
        System.out.println(nombre + ", tu sueldo total es: S/" + sueldoTotal);
    }
    public void enviarCorreo(String destinatario, String asunto, boolean esUrgente) {
        String urgencia = esUrgente ? "urgente" : "no urgente";
        System.out.println("Enviando correo a '" + destinatario + "' con el asunto '" + asunto + "'. Estado: " + urgencia);
    }
}

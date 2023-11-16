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
public class Calculadora_08 {
    
    // Atributos
    double numero1;
    double numero2;
    
    // Métodos
    public double sumar() {
        return this.numero1 + this.numero2;
    }
    public double restar() {
        return this.numero1 - this.numero2;
    }   
    
    // Sobrecarga del constructor
    public Calculadora_08(double numero1) {
        this.numero1 = numero1;
        this.numero2 = 0.0;
    }
    public Calculadora_08(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    // Sobrecarga de metodos
    public double sumar(double numero3) {
        return this.numero1 + this.numero2 + numero3;
    }
    public double restar(double numero3) {
        return this.numero1 - this.numero2 - numero3;
    }   
    
    // Métodos con valor de retorno
    public double obtenerNumero1() {
        return this.numero1;
    }
    public double obtenerNumero2() {
        return this.numero2;
    }
}

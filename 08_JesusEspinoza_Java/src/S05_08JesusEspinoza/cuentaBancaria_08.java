/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_08JesusEspinoza;

/**
 *
 * @author Zec
 */
public class cuentaBancaria_08 {
    
    String titular;
    double saldo;

    public cuentaBancaria_08(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarDatos() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }

}

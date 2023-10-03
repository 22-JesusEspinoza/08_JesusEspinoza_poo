package S05_08JesusEspinoza;

import java.util.Scanner;

public class Main_S05_08JesusEspinoza {

    
    public static void main(String[] args) {
        
        
        estudiante_08 estudiante = new estudiante_08("Jesus", 17);
        estudiante.mostrarDatos();
        
        
        
        libro_08 libro = new libro_08("El Principito", "Antoine de Saint-Exupéri", 1946);
        libro.mostrarDatos();
        
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar el nombre del titular de la cuenta:");
        String titular = scanner.nextLine();
        System.out.println("Ingresar el saldo de la cuenta:");
        double saldo = scanner.nextDouble();
        cuentaBancaria_08 cuentaBancaria = new cuentaBancaria_08(titular, saldo);
        cuentaBancaria.mostrarDatos();
        scanner.close();
        
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar la marca del auto:");
        String marca = scanner.nextLine();
        System.out.println("Ingresar el modelo del auto:");
        String modelo = scanner.nextLine();
        System.out.println("Ingresar el año del auto:");
        int año = scanner.nextInt();
        auto_08 auto = new auto_08(marca, modelo, año);
        auto.mostrarDatos();
        scanner.close();
    }
    }
    
    



package S05_08JesusEspinoza;

import javax.swing.JOptionPane;


public class estudiante_08 {
    
    String nombre;
    int edad;

    public estudiante_08(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + getNombre() + "   Edad: " + getEdad());
    }
}

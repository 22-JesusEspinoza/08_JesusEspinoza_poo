/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_08JesusEspinoza;

import javax.swing.JOptionPane;

/**
 *
 * @author Zec
 */
public class libro_08 {
    
    String titulo;
    String autor;
    int añoPublicacion;

    public libro_08(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Título: " + getTitulo() + "  Autor: " + getAutor() + "  Año de Publicación: " + getAñoPublicacion());
    }
}


package semana2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos {
    
    private String identidad, nombre , apellido;
    private Integer edad;

    public void captura()
    {
        this.setIdentidad(JOptionPane.showInputDialog(null, "Ingrese su identidad: "));
        this.setNombre(JOptionPane.showInputDialog(null, "Ingrese su nombre: "));
        this.setApellido(JOptionPane.showInputDialog(null, "Ingrese su apellido: "));
        this.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad: "))) ;
        this.mostrar();
    }
    
    public void mostrar()
    {
        JOptionPane.showMessageDialog(null, "Identidad: " + this.getIdentidad() + "\nNombre: "+ this.getNombre() + "\nApellido: " +this.getApellido() +  "\nEdad: " +this.getEdad());
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getIdentidad() {
        return identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }
    
    
}

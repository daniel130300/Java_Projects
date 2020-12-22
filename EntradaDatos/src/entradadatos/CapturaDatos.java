
package entradadatos;

import java.util.Scanner;


public class CapturaDatos {

    String nombre, apellido;
    Integer edad;
    
    Scanner Scan = new Scanner(System.in);
    
    public void capturar()
    {
        System.out.print("Ingrese su nombre: ");
        this.nombre = Scan.nextLine();
        System.out.print("Ingrese su apellido: ");
        this.apellido = Scan.nextLine();
        System.out.print("Ingrese su edad: ");
        this.edad = Scan.nextInt();
        
        this.mostrar();
    }
    
    public void mostrar()
    {
        System.out.println("---------- MOSTRAR DATOS ----------");
        System.out.println("Su nombre es: "+ this.nombre + "\nSu apellido es: " + this.apellido + "\nSu edad es: " +this.edad);
    }
}

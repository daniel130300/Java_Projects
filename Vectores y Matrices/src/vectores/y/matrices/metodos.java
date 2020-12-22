
package vectores.y.matrices;

import java.util.Scanner;

public class metodos 
{
    Integer n = 1;
    private String [] vector  = new String[n];
    private Scanner scan = new Scanner(System.in);
    
    public void capturar()
    {
        String [] vector_esclavo = new String [n];
        System.out.println("Longitud: " + vector_esclavo.length);
        System.out.println("Ingrese un nombre: ");
        vector_esclavo[0] = this.scan.next();
        this.setVector(vector_esclavo);   
        this.n++;
        
        this.mostrar();
    }
    
    public void mostrar()
    {
        String [] vector_esclavo = new String[1];
        System.out.println("Longitud: " + vector_esclavo.length);
        vector_esclavo = this.getVector();
        System.out.println("El nombre es: " + vector_esclavo[0]);
    }

    private String[] getVector() {
        return vector;
    }

    private void setVector(String[] vector) {
        this.vector = vector;
    }
    
}

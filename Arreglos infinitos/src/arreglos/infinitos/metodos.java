
package arreglos.infinitos;

import java.util.Scanner;

public class metodos {
    
    Scanner scan = new Scanner(System.in);
    Integer n = 1; 

    
    public void capturar()
    {
        char resp = 'S';
    
        while (resp == 'S') 
        {
            String [] arreglo_original = new String [n];
            String [] arreglo_auxiliar = new String [n];
            
            
            for (int i=0; i<n; i++)
            {
                System.out.println("Ingrese un nombre: ");
                arreglo_auxiliar[n] = scan.nextLine();
                
                arreglo_original[n] = arreglo_auxiliar[n];
            }
            
            this.n++;
            System.out.println("Desea seguir agregando elementos al arreglo [S/N]: ");
            resp = scan.next().charAt(0);
        }
    }
    
    /*
    public String[] getArreglo_original() {
        return arreglo_original;
    }

    public void setArreglo_original(String[] arreglo_original) {
        this.arreglo_original = arreglo_original;
    }
*/

    
}

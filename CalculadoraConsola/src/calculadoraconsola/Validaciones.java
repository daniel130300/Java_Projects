
package calculadoraconsola;

import java.util.Scanner;

public class Validaciones 
{
    
    Scanner Scan = new Scanner(System.in);
    
    public char Validacion_Letras(char letra)
    { 
       while (Character.isDigit(letra))
       {
           System.out.println("\nError! El carácter ingresado no es válido");
           System.out.print("\nIngrese el carácter de nuevo: ");
           letra = Scan.next().toUpperCase().charAt(0);  
       }
       
       return letra;
    }
    
    public Double Validacion_Numeros(String numero)
    {
       while (Character.isAlphabetic(numero.charAt(0)))
       {
           System.out.println("\nError! El carácter ingresado no es válido");
           System.out.print("\nIngrese el carácter de nuevo: ");
           numero = Scan.next();
       }

       return Double.parseDouble(numero);
    }

}

package primera_app;

import java.util.Scanner;
        
public class Primera_App 
{

    public static void main(String[] args) 
    {
        
        /*
        DATOS PRIMITIVOS Y SU DATO ENVOLTORIO CORRESPONDIENTE
        -----------------------------------------------------
        
        Una de las ventajas de trabajar con los datos envoltorios es que 
        permiten convertir a otros valores o trabajar ciertas propiedades de 
        estas variables implicitamente.
        
        La desventaja de los datos envoltorios en comparacion a los primitivos 
        es que abarcan mas espacio en memoria.
        
        float Float
        int Integer
        double Double 
        short Short
        byte Byte
        char String
        boolen Boolean
        
        */
        final float pi = 3.1416f; //De esta forma se declaran constantes.
        
        String nombre;
        float flotante = 124.32f; //Float no acepta valores decimales por default, por esto es necesario convertir el valor.
        double doble = 124.32; //Double si acepta valores decimales por lo que no es necesario convertir el valor a asignarle.
        Byte mordida = (byte) 126.55; //Byte es un wrapper o un dato envoltorio.
        float envol = mordida.floatValue();
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = scan.nextLine().substring(0, 1); /*El substring se utiliza para 
        mostrar solo ciertos caracteres en una palabra, tambien se puede 
        realizar con charAt(index)*/
        System.out.println("Su nombre es: " +nombre);
        System.out.println(nombre + " se la come");
        System.out.println("Flotante: "+flotante);
        System.out.println("Doble: "+doble);
        System.out.println("Mordida: "+mordida);
        System.out.println("Envoltorio: "+envol);  
        System.out.println("Pi: "+pi);
    }
    
}

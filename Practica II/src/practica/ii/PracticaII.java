
package practica.ii;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PracticaII 
{

    public static void main(String[] args) 
    {
        String cadena;
        int entero;
        char caracter;
        double aleatorio;
        double numero, raiz;
        int numeros[] = new int[5];
        
        /*JOptionPane es el panel de Java para mostrar mensajes en pantalla, 
        parecido al MessageBox en C#
        */
        
        /*
        cadena = JOptionPane.showInputDialog("Ingrese una cadena: ");
        JOptionPane.showMessageDialog(null, "La cadena ingresada es: "+cadena);
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero: "));  
        JOptionPane.showMessageDialog(null, "El entero ingresado es: "+entero);
        caracter = JOptionPane.showInputDialog("Ingrese un caracter: ").charAt(0);
        JOptionPane.showMessageDialog(null, caracter);
        */
        
        //Libreria Math
        
        /*
        numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero: "));
        raiz = Math.sqrt(numero);
        JOptionPane.showMessageDialog(null, "La raiz del numero " +numero+ " es: " +raiz);
        *//*
        for (int i = 0; i<5; i++)
        {
            aleatorio =  Math.random();
            numeros[i] = (int) Math.round(aleatorio*100);
        }
        
        for (int i = 0; i<5; i++)
        {
            JOptionPane.showMessageDialog(null, "numeros aleatorios: " + numeros[i]);
        }*/
        
        System.out.println(18.0%1);

    }
    
}


package vectoraleatorio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class VectorAleatorio 
{
    public static void main(String[] args) 
    {
        Integer[] numeros_aleatorios = new Integer[94];
        int[] numeros = new int[numeros_aleatorios.length];
        char[] Caracteres_Ascii = new char [8];
        
        NumerosAleatorios(numeros_aleatorios, numeros);
        CaracteresAsciiAleatoriosPantalla(numeros, Caracteres_Ascii);
    }
    
    
    private static void NumerosAleatorios(Integer[]arreglo1, int[]arreglo2)
    {       
        for (int i = 0; i < arreglo1.length; i++) 
        {
           arreglo1[i] = i+33;
        }
        
        Collections.shuffle(Arrays.asList(arreglo1));
        //List<String> list1 = new ArrayList<>();
        //Collections.addAll(list1, Arrays.toString(arreglo));
        System.out.println(Arrays.toString(arreglo1));
        
        for (int i=0; i<arreglo2.length; i++)
        {
            arreglo2[i] = arreglo1[i];
        }

        /*
        int size = listResult.size();
        int[] result = new int[size];
        Integer[] temp = listResult.toArray(new Integer[size]);
        for (int n = 0; n < size; ++n) 
        {
            result[n] = temp[n];
        }
        */
    }

    private static void CaracteresAsciiAleatoriosPantalla(int[]arreglo1, char[]arreglo2) 
    {
        
        List<String> Ascii = new ArrayList<>();
        
        for (int i=0; i<arreglo2.length; i++)
        {
            arreglo2[i] = (char) arreglo1[i]; 
            System.out.print(arreglo2[i]+ " ");
            Ascii.add(String.valueOf(arreglo2[i]));
        }

        
        Collections.shuffle(Ascii);
        System.out.println("\n" +Ascii);
    }
    
}


package primerclase;


public class Primerclase 
{
    Integer Edad = 24; //NO PRIMITIVA
    
    public static void main(String[] args) 
    {
        Primerclase obj = new Primerclase(); /*Se tiene que instanciar la clase 
        para que el main acceda a la variable global*/
        
        System.out.println("Mi edad es: "+ (obj.Edad-1));
    }
    
}

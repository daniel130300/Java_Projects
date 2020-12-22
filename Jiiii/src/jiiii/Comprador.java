
package jiiii;

public class Comprador extends Personas
{
    public Comprador(String Id, String Nombre, String Apellido) 
    { 
        super(Id, Nombre, Apellido);
    }
    
    public void mostrardatos()
    {
        System.out.println("ID: " +getId()+ "\nNombre: "+getNombre()+"\nApellido: "+getApellido());
    }
}

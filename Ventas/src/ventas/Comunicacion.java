
package ventas;

public class Comunicacion 
{
    
    private static Integer id_producto;
    private static String nombre;
    private static String precio;

    public static Integer getId_producto() {
        return id_producto;
    }

    public static void setId_producto(Integer id_producto) {
        Comunicacion.id_producto = id_producto;
    }
  
    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Comunicacion.nombre = nombre;
    }

    public static String getPrecio() {
        return precio;
    }

    public static void setPrecio(String precio) {
        Comunicacion.precio = precio;
    } 
}

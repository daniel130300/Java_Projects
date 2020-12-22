
package examen;

public class Alumnos extends Personas
{
    private Integer Nota1, Nota2, Nota3;
    private Double Promedio;
    private String Maestro, Mensaje;
    
    public Alumnos(String identidad, String nombre, String apellido, Integer nota1, Integer nota2, Integer nota3, Double promedio, String mensaje, String maestro) 
    {
        super(identidad, nombre, apellido);
        this.Nota1 = nota1;
        this.Nota2 = nota2;
        this.Nota3 = nota3;
        this.Promedio = promedio;
        this.Mensaje = mensaje;
        this.Maestro = maestro;
    }
    
    
}

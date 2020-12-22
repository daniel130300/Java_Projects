
package ingreso.y.consulta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion 
{
    private static Connection con;
    private static Statement stm;
    private static ResultSet rss;
    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "Daniel100";
    private static final String url = "jdbc:mysql://localhost:3306/practica";
    
    public void conector() {

        con = null;
        String estado = "";
        
        try
        {
            Class.forName(driver);

            con = (Connection) DriverManager.getConnection(url, user, pass);

            if (con!=null){
                estado = "Conexion establecida";
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            estado = "Error de conexion: " + e;
        }
        
        JOptionPane.showMessageDialog(null, estado);
    }
    
    public void Ingresar(String Identidad, String Nombre, String Apellido, String Curso, String Seccion, Integer Nota1, Integer Nota2, Integer Nota3, Double Promedio){
        
        String estado = "";
        
        try
        {
            String query;
            Conexion.con = (Connection) DriverManager.getConnection(Conexion.url, Conexion.user, Conexion.pass);
            //Conexion.stm = con.createStatement();
            query = "insert into alumnos (IDENTIFICACION_ALUMNO, NOMBRE_ALUMNO, APELLIDO_ALUMNO, CURSO_ALUMNO, SECCION_ALUMNO, NOTA1, NOTA2, NOTA3) values (?, ?, ?, ?, ?, ?, ? ,?)";
            
            PreparedStatement stm = con.prepareStatement(query);
            
            stm.setString(1, Identidad);
            stm.setString(2, Nombre);
            stm.setString(3, Apellido);
            stm.setString(4, Curso);
            stm.setString(5, Seccion);
            stm.setInt(6, Nota1);
            stm.setInt(7, Nota2);
            stm.setInt(8, Nota3);
            
            stm.executeUpdate();

        } 
        catch (SQLException e){
            estado = "Error de Conexion: " + e.toString();
        }
        
        JOptionPane.showMessageDialog(null, estado);
    }
    
    public String[] Consultar()
    {
       String [] resultado = new String[9];
        
        String estado = "";
        
        try
        {
            Conexion.con = (com.mysql.jdbc.Connection) DriverManager.getConnection(Conexion.url, Conexion.user, Conexion.pass);
            Conexion.stm = con.createStatement();
            Conexion.rss = stm.executeQuery("select * from alumnos");
            while (rss.next())
            {
                String Identidad = rss.getString("IDENTIFICACION_ALUMNO"); //IDENTIFICACION_ALUMNO, NOMBRE_ALUMNO, APELLIDO_ALUMNO, CURSO_ALUMNO, SECCION_ALUMNO, NOTA1, NOTA2, NOTA3, PROMEDIO
                String Nombre = rss.getString("NOMBRE_ALUMNO");
                String Apellido = rss.getString("APELLIDO_ALUMNO");
                String Curso = rss.getString("CURSO_ALUMNO");
                String Seccion = rss.getString("SECCION_ALUMNO");
                Integer Nota1 = rss.getInt("NOTA1");
                Integer Nota2 = rss.getInt("NOTA2");
                Integer Nota3 = rss.getInt("NOTA3");
                Double Promedio = rss.getDouble("PROMEDIO");
                
                resultado[0] = Identidad;
                resultado[1] = Nombre;
                resultado[2] = Apellido;
                resultado[3] = Curso;
                resultado[4] = Seccion;
                resultado[5] = String.valueOf(Nota1);
                resultado[6] = String.valueOf(Nota2);
                resultado[7] = String.valueOf(Nota3);
                resultado[8] = String.valueOf(Promedio);

                estado = "Correcto";
                
            }
        }
        catch (SQLException e){
            estado = "Error de Conexion: " + e.toString();
        }
        
        JOptionPane.showMessageDialog(null, estado);
        
        return resultado;
    }
    
    private void ConsultarID()
    {
        
    }
    
}

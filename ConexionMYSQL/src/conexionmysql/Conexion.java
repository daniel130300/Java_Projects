
package conexionmysql;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    private static Connection con;
    private static Statement stm;
    private static ResultSet rss;
    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "Daniel100";
    private static final String url = "jdbc:mysql://localhost:3306/prueba";
    
    public String conector() {

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
        
        return estado;
    }
    
    public String[] datos(){
        
        String [] resultado = new String[2];
        
        String estado = "";
        
        try
        {
            Conexion.con = (Connection) DriverManager.getConnection(Conexion.url, Conexion.user, Conexion.pass);
            Conexion.stm = con.createStatement();
            Conexion.rss = stm.executeQuery("select * from alumnos");
            while (rss.next())
            {
                String ID_ALUMNO = rss.getString("ID_ALUMNO");
                String NOMBRE_ALUMNO = rss.getString("NOMBRE_ALUMNO");
                
                resultado[0] = ID_ALUMNO;
                resultado[1] = NOMBRE_ALUMNO;
                
                estado = "Correcto";
                
            }
        }
        catch (SQLException e){
            estado = "Error de Conexion: " + e.toString();
        }
        
        JOptionPane.showMessageDialog(null, estado);
        return resultado;
    }
  
}

                                     
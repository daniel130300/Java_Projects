package ventas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Conexion 
{
    
    private static Connection con;
    private static Statement stm;
    private static ResultSet rss;
    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "Daniel100";
    private static final String url = "jdbc:mysql://localhost:3306/ventas_bdd";
      
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
    
    public void IngresarProductos(String nombre, Integer precio, Integer stock){
        
        String estado = "";
        
        try
        {
            String query;
            Conexion.con = (Connection) DriverManager.getConnection(Conexion.url, Conexion.user, Conexion.pass);
            //Conexion.stm = con.createStatement();
            query = "insert into productos (Nombre, Precio, Stock) values (?, ?, ?)";
            
            PreparedStatement stm = con.prepareStatement(query);
            
            stm.setString(1, nombre);
            stm.setInt(2, precio);
            stm.setInt(3, stock);
            
            stm.executeUpdate();

        } 
        catch (SQLException e){
            estado = "Error de Conexion: " + e.toString();
            JOptionPane.showMessageDialog(null, estado);
        }
    }
    
    public void EditarProductos(Integer id, String nombre, Integer precio, Integer stock){
        
        String estado = "";
        
        try
        {
            String query;
            Conexion.con = (Connection) DriverManager.getConnection(Conexion.url, Conexion.user, Conexion.pass);
            //Conexion.stm = con.createStatement();
            query = "update productos set Nombre = ?, Precio = ?, Stock = ? where Id_producto = ?";
            
            PreparedStatement stm = con.prepareStatement(query);
            
            stm.setString(1, nombre);
            stm.setInt(2, precio);
            stm.setInt(3, stock);
            stm.setInt(4, id);
            
            stm.executeUpdate();

        } 
        catch (SQLException e){
            estado = "Error de Conexion: " + e.toString();
            JOptionPane.showMessageDialog(null, estado);
        }
    }
    
    public void EliminarProductos(Integer id)
    {    
        String estado = "";

        try
        {
            String query;
            Conexion.con = (Connection) DriverManager.getConnection(Conexion.url, Conexion.user, Conexion.pass);
            query = "delete from productos where Id_producto = ?";

            PreparedStatement stm = con.prepareStatement(query);

            stm.setInt(1, id);

            stm.executeUpdate();
        } 
            catch (SQLException e)
            {
                estado = "Error de Conexion: " + e.toString();
                JOptionPane.showMessageDialog(null, estado);
            }
    }
    
    public void ConsultarEmpleados(JTable tabla_productos)
    {
        String estado = "";
        
        try
        {
            Conexion.con = (com.mysql.jdbc.Connection) DriverManager.getConnection(Conexion.url, Conexion.user, Conexion.pass);
            Conexion.stm = con.createStatement();
            Conexion.rss = stm.executeQuery("Select a.id_empleado, a.identidad, a.nombre, a.apellido, a.fecha_nacimiento, a.telefono, a.correo_electronico, a.direccion, b.id_puesto, b.descripcion, c.id_estado, c.descripcion, a.salario, a.fecha_contratacion, a.fecha_despido from empleados a inner join puestos b on a.id_puesto = b.id_puesto inner join estado c on a.id_estado = c.id_estado");
            DefaultTableModel modelo = (DefaultTableModel) tabla_productos.getModel();
            
            
            while (rss.next())
            {
                Object [] fila = new Object[15];
                
                for (int i = 0; i<15; i++)
                {
                    fila[i] = rss.getObject(i+1);
                }

                modelo.addRow(fila);
                
            }
            
            tabla_productos.setModel(modelo);

            DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
            centrado.setHorizontalAlignment(JLabel.CENTER);
            
            for (int i = 0; i<4; i++)
            {
                tabla_productos.getColumnModel().getColumn(i).setCellRenderer(centrado);
            }

        }
        catch (SQLException e){
            estado = "Error de Conexion: " + e.toString();
            JOptionPane.showMessageDialog(null, estado);
        }
    } 
    
    public void MantenimientoProductos(String accion, Integer id_produc, String nombre_produc, Integer precio_produc, Integer stock_produc)
    {
        String estado = "";
        
        try
        {
            String query;
            Conexion.con = (Connection) DriverManager.getConnection(Conexion.url, Conexion.user, Conexion.pass);
            query = "{CALL Mantenimiento_productos(?, ?, ?, ?, ?)}";
            CallableStatement cs = con.prepareCall(query);
            cs.setString(1, accion);
            cs.setInt(2, id_produc);
            cs.setString(3, nombre_produc);
            cs.setInt(4, precio_produc);
            cs.setInt(5, stock_produc);
            cs.executeUpdate();
        }
        catch (SQLException e){
            estado = "Error de Conexion: " + e.toString();
            JOptionPane.showMessageDialog(null, estado);
        }
    }
    
    public void AgregarProductoVenta(JTable tabla_agregar, Integer id, Integer cantidad)
    {
        String estado = "";
        
        try
        {
            Conexion.con = (com.mysql.jdbc.Connection) DriverManager.getConnection(Conexion.url, Conexion.user, Conexion.pass);
            Conexion.stm = con.createStatement();
            Conexion.rss = stm.executeQuery("Select * from productos where Id_producto = " + id);
            DefaultTableModel modelo = (DefaultTableModel) tabla_agregar.getModel();
            
            while (rss.next())
            {

                Object [] fila = new Object[5];

                fila[0] = rss.getObject(1);
                fila[1] = rss.getObject(2);
                fila[2] = rss.getInt(3);
                fila[3] = cantidad;
                fila[4] = cantidad * rss.getInt(3);

                modelo.addRow(fila); 
            }
            
            tabla_agregar.setModel(modelo);

            DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
            centrado.setHorizontalAlignment(JLabel.CENTER);
            
            for (int i = 0; i<5; i++)
            {
                tabla_agregar.getColumnModel().getColumn(i).setCellRenderer(centrado);
            }

        }
        catch (SQLException e){
            estado = "Error de Conexion: " + e.toString();
            JOptionPane.showMessageDialog(null, estado);
        }  
    }
    
    public void EliminarProductoVenta(JTable tabla_agregar)
    {
        DefaultTableModel modelo = (DefaultTableModel) tabla_agregar.getModel();
        
        if (tabla_agregar.getSelectedRowCount() == 1)
        {
            modelo.removeRow(tabla_agregar.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Operacion realizada con éxito");
            
        }
        else if (tabla_agregar.getSelectedRowCount() == 0)
        {
             JOptionPane.showMessageDialog(null, "Error! No ha seleccionado ningun registro");
        }
    }
    
    public Integer SumarSubtotal(JTable tabla_agregar)
    {
        int subtotal = 0;
        for (int i = 0; i < tabla_agregar.getRowCount(); i++)
        {
            int amount = (int) (tabla_agregar.getValueAt(i, 4));
            subtotal += amount;
        }
        
        return subtotal;
    }
    
}

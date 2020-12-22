
package ventas;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validaciones 
{
    
    public Boolean ValidarAgregarProducto(JTextField txtNombre, JTextField txtPrecio, JTextField txtCantidad)
    {
        Boolean verificar = true;
        
        if (txtNombre.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtCantidad.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos necesarios para completar esta operación", "Error", JOptionPane.ERROR_MESSAGE);
            verificar = false;
        }

        return verificar;
    }
    
    public Boolean ValidarAgregarVenta(JTextField txtNombre, JTextField txtIdentidad, JTextField txtSubtotal, JTextField txtISV, JTextField txtTotal)
    {
        Boolean verificar = true;
        
        if (txtNombre.getText().isEmpty() || txtIdentidad.getText().isEmpty() || txtSubtotal.getText().isEmpty() || txtTotal.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos necesarios para completar esta operación", "Error", JOptionPane.ERROR_MESSAGE);
            verificar = false;
        }
        
        return verificar;
    }
}

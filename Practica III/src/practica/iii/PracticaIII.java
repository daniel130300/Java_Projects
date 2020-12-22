
package practica.iii;

import javax.swing.JOptionPane;

public class PracticaIII 
{

    public static void main(String[] args) 
    {
        int c;
        double suma = 0, total_redondeado, donacion;
        int dialog_result;
        
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de productos de la venta: "));
        double valores[] = new double[c];
        for (int i = 0; i<c; i++)
        {
            valores[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor del producto " + i + ": "));
            suma += valores[i]; 
        }
        
        JOptionPane.showMessageDialog(null, "El total a pagar es: " +suma);
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        
        dialog_result = JOptionPane.showConfirmDialog(null, "¿Desea redondear el total a pagar?", "Aviso", dialogButton);
        
        if (dialog_result == JOptionPane.YES_OPTION)
        {
            total_redondeado = Math.ceil(suma);
            JOptionPane.showMessageDialog(null, "El total pagado es: "+ total_redondeado);
            donacion = total_redondeado - suma;
            JOptionPane.showMessageDialog(null, "El total donado es: "+donacion);
        }
        else
            JOptionPane.showMessageDialog(null, "El total pagado es: "+ suma);
    }
    
}

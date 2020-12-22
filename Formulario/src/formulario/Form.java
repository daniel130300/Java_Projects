
package formulario;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Form extends JFrame
{
    public Form()
    {
        this.setSize(450, 450);
        this.setTitle("Ingreso de Datos");
        this.setLocationRelativeTo(this);
        this.ComponentesVentana();
    }
    
    public void ComponentesVentana()
    {
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
  
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        label1.setText("Primer Nombre: Hector");
        label1.setBounds(100, 50, 400, 100);
        label2.setText("Segundo Nombre: Daniel");
        label2.setBounds(100, 100, 400, 100);
        label3.setText("Primer Apellido: Lopez");
        label3.setBounds(100, 150, 400, 100);
        label4.setText("Segundo Apellido: Borjas");
        label4.setBounds(100, 200, 400, 100);
        label5.setText("Fecha de Nacimiento: 13/03/2000");
        label5.setBounds(100, 250, 400, 100);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
    }
    
}

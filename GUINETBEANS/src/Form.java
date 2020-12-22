

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Form extends JFrame 
{
    public Form()
    {
        this.setSize(400, 400);
        this.setTitle("Esto es uan ventana");
        this.setLocationRelativeTo(this);
        this.ComponentesVetana();
    }
    
    
    public void ComponentesVetana()
    {
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        label.setText("Hoal Mundo");
        label.setBounds(100, 100, 100, 100);
        panel.add(label);
    }
}

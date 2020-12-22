/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author danie
 */
public class Principal extends javax.swing.JFrame {

    Vectores vectores = new Vectores();
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRespuesta = new javax.swing.JTextField();
        btnRetornar = new javax.swing.JButton();
        txtSucesionCorrecta = new javax.swing.JPasswordField();
        txtCaracteresGenerados = new javax.swing.JTextField();
        lblInstrucciones = new javax.swing.JTextArea();
        btnIngresar = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblSucesionCorrecta = new javax.swing.JLabel();
        lblRespuesta = new javax.swing.JLabel();
        lblGenerados = new javax.swing.JLabel();
        imgBackground = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRespuesta.setBackground(new java.awt.Color(216, 234, 255));
        txtRespuesta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRespuesta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 210, -1));

        btnRetornar.setText("<-- Retornar");
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetornar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 110, 40));

        txtSucesionCorrecta.setEditable(false);
        txtSucesionCorrecta.setBackground(new java.awt.Color(216, 234, 255));
        txtSucesionCorrecta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtSucesionCorrecta.setText("jPas");
        txtSucesionCorrecta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtSucesionCorrecta.setOpaque(false);
        getContentPane().add(txtSucesionCorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 210, -1));

        txtCaracteresGenerados.setEditable(false);
        txtCaracteresGenerados.setBackground(new java.awt.Color(216, 234, 255));
        txtCaracteresGenerados.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCaracteresGenerados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCaracteresGenerados.setOpaque(false);
        getContentPane().add(txtCaracteresGenerados, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 210, -1));

        lblInstrucciones.setEditable(false);
        lblInstrucciones.setColumns(20);
        lblInstrucciones.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblInstrucciones.setRows(5);
        lblInstrucciones.setText("Instrucciones: La lista de carácteres generados mostrada es la que usted utilizara como guía \npara poder encontrar la sucesión de carácteres correcta oculta, la cual consta únicamente de\n4 carácteres.\n\nNota: Recuerde que cuenta con el panel de ayuda a su derecha para poder guiarse para \nencontrar los carácteres ocultos.");
        lblInstrucciones.setOpaque(false);
        getContentPane().add(lblInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 530, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 140, 40));

        lblTitle.setBackground(new java.awt.Color(255, 0, 0));
        lblTitle.setFont(new java.awt.Font("Bauhaus 93", 0, 30)); // NOI18N
        lblTitle.setText("GUESS THE ASCII ARRAY");
        lblTitle.setToolTipText("");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 310, 70));

        lblSucesionCorrecta.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblSucesionCorrecta.setText("Sucesión a Adivinar: ");
        getContentPane().add(lblSucesionCorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        lblRespuesta.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblRespuesta.setText("Respuesta:");
        getContentPane().add(lblRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        lblGenerados.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblGenerados.setText("Carácteres Generados:");
        getContentPane().add(lblGenerados, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        imgBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/imagenes/Upsize_background.png"))); // NOI18N
        getContentPane().add(imgBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.txtCaracteresGenerados.setText(String.valueOf(vectores.CaracteresAsciiAleatoriosPantalla()));
    }//GEN-LAST:event_formComponentShown

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        
        Inicio inicio = new Inicio();
        this.setVisible(false);
        inicio.setVisible(true);
    }//GEN-LAST:event_btnRetornarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JLabel imgBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGenerados;
    private javax.swing.JTextArea lblInstrucciones;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JLabel lblSucesionCorrecta;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCaracteresGenerados;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JPasswordField txtSucesionCorrecta;
    // End of variables declaration//GEN-END:variables
}
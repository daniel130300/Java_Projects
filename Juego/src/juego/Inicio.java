
package juego;

/**
 *
 * @author danie
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    Jugador jugador = new Jugador();
    Principal principal = new Principal();
    Efectos_Sonido efectos = new Efectos_Sonido();
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgUser = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnPlay = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(610, 420));
        setResizable(false);
        setSize(new java.awt.Dimension(610, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/imagenes/UserFinal.png"))); // NOI18N
        imgUser.setMaximumSize(new java.awt.Dimension(40, 40));
        imgUser.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(imgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 60, 60));

        txtUsername.setBackground(new java.awt.Color(216, 234, 255));
        txtUsername.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUsername.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtUsername.setOpaque(false);
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 210, -1));

        lblTitle.setBackground(new java.awt.Color(255, 0, 0));
        lblTitle.setFont(new java.awt.Font("Bauhaus 93", 0, 30)); // NOI18N
        lblTitle.setText("GUESS THE ASCII ARRAY");
        lblTitle.setToolTipText("");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 310, 70));

        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/imagenes/PLAYFINALFINAL.png"))); // NOI18N
        btnPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayMouseClicked(evt);
            }
        });
        getContentPane().add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 170, 60));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/imagenes/Colorful.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseClicked
        
        jugador.setUsername(this.txtUsername.getText());
        principal.setVisible(true);
        this.setVisible(false);
       
        efectos.CargarAudio("StartGame.wav");
        //efectos.Play();
    }//GEN-LAST:event_btnPlayMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnPlay;
    private javax.swing.JLabel imgUser;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

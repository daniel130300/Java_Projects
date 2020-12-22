/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danie
 */
public class Ventas extends javax.swing.JFrame {

    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void setTxtPrecio(String txtPrecio) {
        this.txtPrecio.setText(txtPrecio); 
    }

    public void setTxtProducto(String txtProducto) {
        this.txtProducto.setText(txtProducto);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdentidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNuevaVenta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtISV = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel1.setText("Identidad: ");
        pnlFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 81, -1, -1));

        txtIdentidad.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        pnlFondo.add(txtIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 78, 200, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setText("Nombre: ");
        pnlFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 122, -1, -1));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        pnlFondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 119, 200, -1));

        lblNuevaVenta.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblNuevaVenta.setText("NUEVA VENTA");
        pnlFondo.add(lblNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setText("Producto:");
        pnlFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 163, -1, -1));

        btnMostrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnMostrar.setText("...");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 162, 50, 20));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel5.setText("Cantidad: ");
        pnlFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 246, -1, -1));

        txtProducto.setEditable(false);
        txtProducto.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        pnlFondo.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 160, 200, -1));

        txtCantidad.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        pnlFondo.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 244, 50, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel6.setText("Precio:");
        pnlFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 206, -1, -1));

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        pnlFondo.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 203, 80, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel7.setText("ISV:");
        pnlFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel8.setText("Subtotal: ");
        pnlFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel9.setText("Total: ");
        pnlFondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));
        pnlFondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 481, -1, -1));

        txtISV.setEditable(false);
        txtISV.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        pnlFondo.add(txtISV, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 98, -1));

        txtSubtotal.setEditable(false);
        txtSubtotal.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        pnlFondo.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 98, -1));

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        pnlFondo.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 98, -1));

        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        btnIngresar.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 90, 30));

        btnRegresar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnRegresar.setText("Regresar al Menú");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnCargar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        tableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Producto", "Nombre", "Precio", "Cantidad", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVentas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableVentas);

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 550, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        MostrarProductos productos = new MostrarProductos();
        productos.setVisible(true); 
        this.txtProducto.setText(null);
        this.txtPrecio.setText(null);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        
        Comunicacion comunicacion = new Comunicacion();
        this.txtProducto.setText(Comunicacion.getNombre());
        this.txtPrecio.setText(Comunicacion.getPrecio());
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Validaciones validar = new Validaciones();
        
        if (validar.ValidarAgregarProducto(this.txtProducto, this.txtPrecio, this.txtCantidad) == true)
        {
            Conexion con = new Conexion();
            Comunicacion comunicacion = new Comunicacion();
            con.AgregarProductoVenta(tableVentas, Comunicacion.getId_producto(), Integer.parseInt(this.txtCantidad.getText()));
            this.txtSubtotal.setText(String.valueOf(con.SumarSubtotal(tableVentas)));  
            this.txtISV.setText(String.valueOf(Double.parseDouble(this.txtSubtotal.getText())* 0.15));
            this.txtTotal.setText(String.valueOf(Double.parseDouble(this.txtSubtotal.getText()) + Double.parseDouble(this.txtISV.getText())));
            this.txtProducto.setText(null);
            this.txtPrecio.setText(null);
            this.txtCantidad.setText(null);
        }
        else
        {
            this.txtProducto.setText(null);
            this.txtPrecio.setText(null);
            this.txtCantidad.setText(null);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Conexion con = new Conexion();
        con.EliminarProductoVenta(tableVentas);
        con.SumarSubtotal(tableVentas);
        this.txtSubtotal.setText(String.valueOf(con.SumarSubtotal(tableVentas)));
        this.txtISV.setText(String.valueOf(Double.parseDouble(this.txtSubtotal.getText())* 0.15));
        this.txtTotal.setText(String.valueOf(Double.parseDouble(this.txtSubtotal.getText()) + Double.parseDouble(this.txtISV.getText())));
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        Validaciones validar = new Validaciones();
        
        if (validar.ValidarAgregarVenta(this.txtNombre, this.txtIdentidad, this.txtSubtotal, this.txtISV, this.txtTotal) == true)
        {
            JOptionPane.showMessageDialog(null, "Operacion Realizada con éxito");
            this.txtNombre.setText(null);
            this.txtIdentidad.setText(null);
            this.txtSubtotal.setText(null);
            this.txtISV.setText(null);
            this.txtTotal.setText(null);
            DefaultTableModel model = (DefaultTableModel) this.tableVentas.getModel();
            model.setRowCount(0);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNuevaVenta;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTable tableVentas;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtISV;
    private javax.swing.JTextField txtIdentidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}

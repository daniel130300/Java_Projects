/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danie
 */
public class Productos extends javax.swing.JFrame {

    public Productos() {
        initComponents();
        this.setLocationRelativeTo(null);
        Conexion con = new Conexion();
        con.ConsultarProductos(this.tableProductos);
        TextboxesNoEditables();
        this.tableProductos.setRowSelectionAllowed(false);
    }
    
    boolean habilitar = false;
    
    private void LimpiarTextboxes()
    {
        this.txtNombre.setText(null);
        this.txtPrecio.setText(null);
        this.txtStock.setText(null);
    }
    
    private void TextboxesNoEditables()
    {
        this.txtNombre.setEditable(false);
        this.txtPrecio.setEditable(false);
        this.txtStock.setEditable(false);
    }
    
    private void TextboxesEditables()
    {
        this.txtNombre.setEditable(true);
        this.txtPrecio.setEditable(true);
        this.txtStock.setEditable(true);
    }
    
    private void RefrescarTable()
    {
        DefaultTableModel model = (DefaultTableModel) this.tableProductos.getModel();
        model.setRowCount(0);
        Conexion con = new Conexion();
        con.ConsultarProductos(this.tableProductos);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupMantenimiento = new javax.swing.ButtonGroup();
        pnlFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        pnlDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        pnlMantenimiento = new javax.swing.JPanel();
        rdbIngresar = new javax.swing.JRadioButton();
        rdbEditar = new javax.swing.JRadioButton();
        rdbEliminar = new javax.swing.JRadioButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Productos");
        pnlFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Producto", "Nombre", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProductos);

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 210));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setText("Nombre: ");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setText("Precio: ");

        txtPrecio.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setText("Stock:");

        txtStock.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setEnabled(false);
        btnIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnIngresar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(btnIngresar)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 460, 130));

        pnlMantenimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mantenimiento Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 13))); // NOI18N

        groupMantenimiento.add(rdbIngresar);
        rdbIngresar.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        rdbIngresar.setText("Ingresar");
        rdbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbIngresarActionPerformed(evt);
            }
        });

        groupMantenimiento.add(rdbEditar);
        rdbEditar.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        rdbEditar.setText("Editar");
        rdbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbEditarActionPerformed(evt);
            }
        });

        groupMantenimiento.add(rdbEliminar);
        rdbEliminar.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        rdbEliminar.setText("Eliminar");
        rdbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMantenimientoLayout = new javax.swing.GroupLayout(pnlMantenimiento);
        pnlMantenimiento.setLayout(pnlMantenimientoLayout);
        pnlMantenimientoLayout.setHorizontalGroup(
            pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMantenimientoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(rdbIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(rdbEditar)
                .addGap(69, 69, 69)
                .addComponent(rdbEliminar)
                .addGap(48, 48, 48))
        );
        pnlMantenimientoLayout.setVerticalGroup(
            pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMantenimientoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbIngresar)
                    .addComponent(rdbEditar)
                    .addComponent(rdbEliminar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 460, 80));

        btnRegresar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnRegresar.setText("Regresar al Menú");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void rdbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbIngresarActionPerformed
        if (this.rdbIngresar.isSelected())
        {
            this.btnIngresar.setEnabled(true);
            this.btnEditar.setEnabled(false);
            this.btnEliminar.setEnabled(false);
            this.tableProductos.setRowSelectionAllowed(false);
            this.tableProductos.clearSelection();
            TextboxesEditables();
            LimpiarTextboxes();
        }
    }//GEN-LAST:event_rdbIngresarActionPerformed

    private void rdbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbEditarActionPerformed
        if (this.rdbEditar.isSelected())
        {
            this.btnIngresar.setEnabled(false);
            this.btnEditar.setEnabled(true);
            this.btnEliminar.setEnabled(false);
            this.tableProductos.setRowSelectionAllowed(true);
            this.tableProductos.clearSelection();
            TextboxesEditables();
            LimpiarTextboxes();
            habilitar = true;
        }
    }//GEN-LAST:event_rdbEditarActionPerformed

    private void rdbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbEliminarActionPerformed
        if (this.rdbEliminar.isSelected())
        {
            this.btnIngresar.setEnabled(false);
            this.btnEditar.setEnabled(false);
            this.btnEliminar.setEnabled(true);
            this.tableProductos.setRowSelectionAllowed(true);
            this.tableProductos.clearSelection();
            TextboxesNoEditables();
            LimpiarTextboxes();
            habilitar = true;
        }
    }//GEN-LAST:event_rdbEliminarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        Conexion con = new Conexion();
        con.IngresarProductos(this.txtNombre.getText(), Integer.parseInt(this.txtPrecio.getText()), Integer.parseInt(this.txtStock.getText()));
        LimpiarTextboxes();
        RefrescarTable();
    }//GEN-LAST:event_btnIngresarActionPerformed

    
    private Integer Id_producto;
    
    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductosMouseClicked
         if (habilitar == true)
        {
            int seleccion = this.tableProductos.rowAtPoint(evt.getPoint()); // toma la posición
            Id_producto = Integer.parseInt(String.valueOf(tableProductos.getValueAt(seleccion, 0)));
            this.txtNombre.setText(String.valueOf(tableProductos.getValueAt(seleccion, 1)));
            this.txtPrecio.setText(String.valueOf(tableProductos.getValueAt(seleccion, 2)));
            this.txtStock.setText(String.valueOf(tableProductos.getValueAt(seleccion, 3)));
        }
    }//GEN-LAST:event_tableProductosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Conexion con = new Conexion();
        con.EditarProductos(Id_producto, this.txtNombre.getText(), Integer.parseInt(this.txtPrecio.getText()), Integer.parseInt(this.txtStock.getText()));
        LimpiarTextboxes();
        RefrescarTable();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Conexion con = new Conexion();
        con.EliminarProductos(Id_producto);
        LimpiarTextboxes();
        RefrescarTable();
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup groupMantenimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlMantenimiento;
    private javax.swing.JRadioButton rdbEditar;
    private javax.swing.JRadioButton rdbEliminar;
    private javax.swing.JRadioButton rdbIngresar;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}

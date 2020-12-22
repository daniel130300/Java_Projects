/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocasaempeños;

import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author danie
 */
public class FrmEmpleados extends javax.swing.JFrame {

    
    
    public FrmEmpleados() {
        initComponents();
        this.setLocationRelativeTo(null);
        Conexion con = new Conexion();
        con.LlenarComboboxPuestos(this.cmbPuesto);
        con.LlenarComboboxEstados(this.cmbEstado);
        con.ConsultarEmpleados(tableEmpleados);
        this.tableEmpleados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        con.AjustarAutomaticamenteAnchoColumna(tableEmpleados);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) this.fecha_nacimiento_datechooser.getDateEditor();
        editor.setEditable(false);
        this.DeshabilitarCopyPaste();
        
        this.OcultarColumnas();
    }
    
    int Id_empleado; 
    
    public void LimpiarTxtFields()
    {
        this.txtIdentidad.setText(null);
        this.txtNombre.setText(null);
        this.txtApellido.setText(null);
        this.fecha_nacimiento_datechooser.setCalendar(null);
        this.txtTelefono.setText(null);
        this.txtCorreo_electronico.setText(null);
        this.txtDireccion.setText(null);
        this.txtUsuario.setText(null);
        this.txtContraseña.setText(null);
        this.cmbPuesto.setSelectedIndex(0);
        this.cmbEstado.setSelectedIndex(0);
        this.txtSalario.setText(null);
    }
    
    private void DeshabilitarCopyPaste()
    {
        this.txtIdentidad.setTransferHandler(null);
        this.txtNombre.setTransferHandler(null);
        this.txtApellido.setTransferHandler(null);
        this.txtUsuario.setTransferHandler(null);
        this.txtContraseña.setTransferHandler(null);
        this.txtCorreo_electronico.setTransferHandler(null);
        this.txtDireccion.setTransferHandler(null);
        this.txtTelefono.setTransferHandler(null);
        this.txtSalario.setTransferHandler(null);
    }
    
    private void RefrescarTable()
    {
        DefaultTableModel model = (DefaultTableModel) this.tableEmpleados.getModel();
        model.setRowCount(0);
        Conexion con = new Conexion();
        con.ConsultarEmpleados(this.tableEmpleados);
    }
    
    private void OcultarColumnas()
    {
        TableColumnModel tcm = this.tableEmpleados.getColumnModel();
        tcm.removeColumn(tcm.getColumn(0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlInformacionPersonalEmpleado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtIdentidad = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo_electronico = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        fecha_nacimiento_datechooser = new com.toedter.calendar.JDateChooser();
        txtNombre = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableEmpleados = new javax.swing.JTable();
        pnlInformacionUsuarioEmpleado = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        cmbPuesto = new javax.swing.JComboBox<>();
        txtContraseña = new javax.swing.JPasswordField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Ingresar/Editar/Consultar Empleados");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pnlInformacionPersonalEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información personal del empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        pnlInformacionPersonalEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Identidad:");
        pnlInformacionPersonalEmpleado.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nombre: ");
        pnlInformacionPersonalEmpleado.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Apellido:");
        pnlInformacionPersonalEmpleado.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Fecha de nacimiento: ");
        pnlInformacionPersonalEmpleado.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Teléfono: ");
        pnlInformacionPersonalEmpleado.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Correo electrónico: ");
        pnlInformacionPersonalEmpleado.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Dirección: ");
        pnlInformacionPersonalEmpleado.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlInformacionPersonalEmpleado.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 150, -1));

        txtIdentidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlInformacionPersonalEmpleado.add(txtIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 170, -1));

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        pnlInformacionPersonalEmpleado.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 170, -1));

        txtCorreo_electronico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlInformacionPersonalEmpleado.add(txtCorreo_electronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 190, -1));

        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDireccion.setRows(5);
        jScrollPane1.setViewportView(txtDireccion);

        pnlInformacionPersonalEmpleado.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 240, 100));

        fecha_nacimiento_datechooser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fecha_nacimiento_datechooser.setMaxSelectableDate(new java.util.Date(1072940509000L));
        fecha_nacimiento_datechooser.setMinSelectableDate(new java.util.Date(-631123091000L));
        pnlInformacionPersonalEmpleado.add(fecha_nacimiento_datechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 170, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        pnlInformacionPersonalEmpleado.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 170, -1));

        jPanel1.add(pnlInformacionPersonalEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 520, 360));

        tableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Empleado", "Identidad", "Nombre", "Apellido", "Fecha de Nacimiento", "Teléfono", "Correo electrónico", "Dirección", "Puesto", "Estado", "Salario", "Fecha de Contratación", "Fecha de Despido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEmpleados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableEmpleados);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 1080, 220));

        pnlInformacionUsuarioEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de usuario para el empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        pnlInformacionUsuarioEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Usuario:");
        pnlInformacionUsuarioEmpleado.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Contraseña: ");
        pnlInformacionUsuarioEmpleado.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Puesto: ");
        pnlInformacionUsuarioEmpleado.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Salario: ");
        pnlInformacionUsuarioEmpleado.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlInformacionUsuarioEmpleado.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 148, -1));

        txtSalario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlInformacionUsuarioEmpleado.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 100, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Estado: ");
        pnlInformacionUsuarioEmpleado.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        cmbEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un estado" }));
        cmbEstado.setEnabled(false);
        pnlInformacionUsuarioEmpleado.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 116, 150, 20));

        cmbPuesto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un puesto" }));
        pnlInformacionUsuarioEmpleado.add(cmbPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 150, -1));
        pnlInformacionUsuarioEmpleado.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 150, -1));

        jPanel1.add(pnlInformacionUsuarioEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 520, 210));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        btnConsultar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, -1, -1));
        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        Conexion con = new Conexion();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        con.Mantenimiento_Empleados("insertar", 0, this.txtIdentidad.getText(), this.txtNombre.getText(), this.txtApellido.getText(), this.txtUsuario.getText(), this.txtContraseña.getText(), 
        Integer.parseInt(this.txtSalario.getText()), this.txtTelefono.getText(), this.txtCorreo_electronico.getText(), this.txtDireccion.getText(), Date.valueOf(df.format(this.fecha_nacimiento_datechooser.getDate())) , this.cmbPuesto.getSelectedIndex(), this.cmbEstado.getSelectedIndex()); 
        this.RefrescarTable();
        this.LimpiarTxtFields();
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tableEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEmpleadosMouseClicked
        this.btnEditar.setEnabled(true);
        this.btnAgregar.setEnabled(false);
        this.cmbEstado.setEnabled(true);
        this.txtUsuario.setEnabled(false);
        this.txtContraseña.setEnabled(false);
        int seleccion = this.tableEmpleados.rowAtPoint(evt.getPoint()); 
        this.Id_empleado = Integer.parseInt((String.valueOf(tableEmpleados.getModel().getValueAt(seleccion, 0)))); 
        this.txtIdentidad.setText(String.valueOf(tableEmpleados.getModel().getValueAt(seleccion, 1)));
        this.txtNombre.setText(String.valueOf(tableEmpleados.getModel().getValueAt(seleccion, 2)));
        this.txtApellido.setText(String.valueOf(tableEmpleados.getModel().getValueAt(seleccion, 3)));
        this.fecha_nacimiento_datechooser.setDate(Date.valueOf(String.valueOf(tableEmpleados.getModel().getValueAt(seleccion, 4))));
        this.txtTelefono.setText(String.valueOf(tableEmpleados.getModel().getValueAt(seleccion, 5)));
        this.txtCorreo_electronico.setText(String.valueOf(tableEmpleados.getModel().getValueAt(seleccion, 6)));
        this.txtDireccion.setText(String.valueOf(tableEmpleados.getModel().getValueAt(seleccion, 7)));
        this.cmbPuesto.setSelectedItem(String.valueOf(tableEmpleados.getModel().getValueAt(seleccion, 8)));
        this.cmbEstado.setSelectedItem(String.valueOf(tableEmpleados.getModel().getValueAt(seleccion,9)));
        this.txtSalario.setText(String.valueOf(tableEmpleados.getModel().getValueAt(seleccion, 10)));
        
    }//GEN-LAST:event_tableEmpleadosMouseClicked

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        FrmBusquedaEmpleados busquedaEmpleados = new FrmBusquedaEmpleados();
        busquedaEmpleados.setVisible(true);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.btnEditar.setEnabled(false);
        this.cmbEstado.setEnabled(false);
        this.txtUsuario.setEnabled(true);
        this.txtContraseña.setEnabled(true);
        this.LimpiarTxtFields();
        this.tableEmpleados.clearSelection();
        this.btnAgregar.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Conexion con = new Conexion();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        con.Mantenimiento_Empleados("editar", this.Id_empleado, this.txtIdentidad.getText(), this.txtNombre.getText(), this.txtApellido.getText(), null, null, Integer.parseInt(this.txtSalario.getText()), this.txtTelefono.getText(), this.txtCorreo_electronico.getText(), this.txtDireccion.getText(), Date.valueOf(df.format(this.fecha_nacimiento_datechooser.getDate())), this.cmbPuesto.getSelectedIndex(), this.cmbEstado.getSelectedIndex());
        this.RefrescarTable();
        this.LimpiarTxtFields();
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbPuesto;
    private com.toedter.calendar.JDateChooser fecha_nacimiento_datechooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlInformacionPersonalEmpleado;
    private javax.swing.JPanel pnlInformacionUsuarioEmpleado;
    private javax.swing.JTable tableEmpleados;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo_electronico;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtIdentidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

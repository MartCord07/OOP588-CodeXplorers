/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.vista.doctor.espe;

import proyecto.modelo.espe.Doctor;
import proyecto.servicio.espe.DoctorServicio;

/**
 *
 * @author Usuario
 */
public class ConsultaPaciente extends javax.swing.JFrame {
Doctor paciente = null;
String cedula = null;


    public ConsultaPaciente() {
        
        
        setLocationRelativeTo(null);
        setResizable(false);
        mostrarDatosPaciente();
    }
    
   private void mostrarDatosPaciente() {
        txtCedula.setText(paciente.getCedula());
        txtNombre.setText(paciente.getNombre());
        txtApellido.setText(paciente.getApellido());
       txtEdad.setText(paciente.getEdad());
       txtGenero.setText(paciente.getGenero());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNombreDoc = new javax.swing.JTextField();
        txtApellidoDoc = new javax.swing.JTextField();
        txtGeneroDoc = new javax.swing.JTextField();
        txtEdadDoc = new javax.swing.JTextField();
        cbxEspecialidad = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaDiagnostico = new javax.swing.JTextArea();
        btnMedicamentos = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtCedulaDoc = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Consulta Medica");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel2.setText("Nombre del paciente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel3.setText("Apellido del paciente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel4.setText("Cedula paciente");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel5.setText("Genero del paciente");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jLabel6.setText("Edad del paciente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Datos del paciente");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 130, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 130, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 130, -1));
        jPanel1.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 150, -1));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 150, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 700, 10));

        jLabel8.setText("Nombre del doctor");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel9.setText("Apellido del doctor");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel10.setText("Genero del doctor");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jLabel11.setText("Edad del doctor");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        jLabel12.setText("Especialidad");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Datos del doctor");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
        jPanel1.add(txtNombreDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 150, -1));
        jPanel1.add(txtApellidoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 150, -1));
        jPanel1.add(txtGeneroDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 140, -1));
        jPanel1.add(txtEdadDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 140, -1));

        cbxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Area Especializada", "Medico General", "Traumatologo", "Alergologo", "Dermatologo", "Otro" }));
        jPanel1.add(cbxEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 140, -1));

        jLabel14.setText("Diagnostico");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        AreaDiagnostico.setColumns(20);
        AreaDiagnostico.setRows(5);
        jScrollPane1.setViewportView(AreaDiagnostico);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 540, 100));

        btnMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_consultamedicina.png"))); // NOI18N
        btnMedicamentos.setText("Stock Mediciamentos");
        btnMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, -1, -1));

        btnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_historial.png"))); // NOI18N
        btnHistorial.setText("Generar Historial");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        jPanel1.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 180, -1));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_regresar.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 680, -1, -1));

        jLabel15.setText("Cedula del doctor");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        jPanel1.add(txtCedulaDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 150, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_consultamed.jpg"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        AtencionMedica atencion= new AtencionMedica();
        atencion.setVisible(true);
        atencion.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentosActionPerformed
        ConsultaMedicamentos medicamento = new ConsultaMedicamentos();
        medicamento.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMedicamentosActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        HistorialClinico historial = new HistorialClinico();
        historial.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnHistorialActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaDiagnostico;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnMedicamentos;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbxEspecialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoDoc;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedulaDoc;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdadDoc;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtGeneroDoc;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDoc;
    // End of variables declaration//GEN-END:variables
}

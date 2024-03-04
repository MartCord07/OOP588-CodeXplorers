/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.vista.doctor.espe;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JComboBox;
import proyecto.modelo.espe.Doctor;
import proyecto.servicio.espe.DoctorServicio;

/**
 *
 * @author Usuario
 */
public class ConsultaPaciente extends javax.swing.JFrame {

    String ci = null;
    List<Doctor> listadoctores = null;
    JComboBox<String> comboMedico;

    public ConsultaPaciente() {

        initComponents();

        cbxMedicoDisponible.setVisible(false);
        lblMedico.setVisible(false);
        AreaDiagnostico.setVisible(false);
        listadoctores = DoctorServicio.ListarDoctores();
        cargarComboEspecialidad(listadoctores);

        setLocationRelativeTo(null);
        setResizable(false);

    }

    public void cargarComboEspecialidad(List<Doctor> listarDoctores) {

        List<String> filtro = new ArrayList<>();
        for (Doctor doc : listarDoctores) {
            filtro.add(doc.getEspecialidad());
        }
        Set<String> conjunto = new HashSet<>(filtro);
        String[] nuevoArray = conjunto.toArray(new String[0]);

        for (String element : nuevoArray) {
            cbxEspecialidad.addItem(element);

        }
    }

    protected void asignarPaciente(String cedula) {
        ci = cedula;

        obtenerDatosPaciente(cedula);
    }

    private void obtenerDatosPaciente(String cedula) {
        Doctor paciente1 = DoctorServicio.BuscarCedulaPaciente(cedula);

        mostrarDatosPaciente(paciente1);
    }

    private void mostrarDatosPaciente(Doctor paciente) {
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNombreDoc = new javax.swing.JTextField();
        txtApellidoDoc = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        cbxEspecialidad = new javax.swing.JComboBox<>();
        lblDiagnostico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaDiagnostico = new javax.swing.JTextArea();
        btnMedicamentos = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblMedico = new javax.swing.JLabel();
        cbxMedicoDisponible = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
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

        txtCedula.setEditable(false);
        txtCedula.setEnabled(false);
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 130, -1));

        txtNombre.setEditable(false);
        txtNombre.setEnabled(false);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 130, -1));

        txtApellido.setEditable(false);
        txtApellido.setEnabled(false);
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 130, -1));

        txtGenero.setEditable(false);
        txtGenero.setEnabled(false);
        jPanel1.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 150, -1));

        txtEdad.setEditable(false);
        txtEdad.setEnabled(false);
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 150, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 700, 10));

        jLabel8.setText("Nombre del doctor");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel9.setText("Apellido del doctor");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        jLabel10.setText("IDE del doctor");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel12.setText("Especialidad");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Datos del doctor");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        txtNombreDoc.setEditable(false);
        txtNombreDoc.setEnabled(false);
        jPanel1.add(txtNombreDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 150, -1));

        txtApellidoDoc.setEditable(false);
        txtApellidoDoc.setEnabled(false);
        jPanel1.add(txtApellidoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 150, -1));

        txtID.setEditable(false);
        txtID.setEnabled(false);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 150, -1));

        cbxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Area Especializada", " " }));
        cbxEspecialidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxEspecialidadItemStateChanged(evt);
            }
        });
        jPanel1.add(cbxEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 150, -1));

        lblDiagnostico.setText("Diagnostico");
        jPanel1.add(lblDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        AreaDiagnostico.setColumns(20);
        AreaDiagnostico.setRows(5);
        jScrollPane1.setViewportView(AreaDiagnostico);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 440, 60));

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

        lblMedico.setText("Medicos Disponibles");
        jPanel1.add(lblMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        cbxMedicoDisponible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un medico", " " }));
        jPanel1.add(cbxMedicoDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 150, -1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 90, -1));

        jLabel16.setText("Cantidadad Medicamento");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

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
        AtencionMedica atencion = new AtencionMedica();
        atencion.setVisible(true);
        atencion.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentosActionPerformed
        ConsultaMedicamentos medicamento = new ConsultaMedicamentos();
        medicamento.setVisible(true);

    }//GEN-LAST:event_btnMedicamentosActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        HistorialClinico historial = new HistorialClinico();
        historial.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void cbxEspecialidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxEspecialidadItemStateChanged

        if (cbxEspecialidad.getSelectedItem().toString() != null || cbxEspecialidad.getSelectedItem().toString() != "") {

            String especialidad = cbxEspecialidad.getSelectedItem().toString();
            List<Doctor> doctor = DoctorServicio.BuscarDoctor(especialidad);
            if (!doctor.isEmpty()) {
                List<String> filtro = new ArrayList<>();
                for (Doctor doc : doctor) {
                    filtro.add(doc.getNombreDoc() + " - " + doc.getApellidoDoc() + " - " + doc.getiDdoctor());
                }

                Set<String> conjunto = new HashSet<>(filtro);
                String[] nuevoArray = conjunto.toArray(new String[0]);

                for (String element : nuevoArray) {
                    cbxMedicoDisponible.addItem(element);

                }
                cbxMedicoDisponible.addItemListener((ItemEvent evt1) -> {
                    if (evt1.getStateChange() == ItemEvent.SELECTED) {
                        String selectedItem = (String) evt1.getItem();
                        String[] parts = selectedItem.split(" - ");
                        String nombreDoc = parts[0];
                        String apellidoDoc = parts[1];
                        String idDoctor = parts[2];
                        txtNombreDoc.setText(nombreDoc);
                        txtApellidoDoc.setText(apellidoDoc);
                        txtID.setText(idDoctor);
                    }
                });

                cbxMedicoDisponible.setVisible(true);
                lblMedico.setVisible(true);
                AreaDiagnostico.setVisible(true);

            } else {
                doctor.clear();
                cbxMedicoDisponible.setVisible(false);
                lblMedico.setVisible(false);
                AreaDiagnostico.setVisible(false);
            }

        }

    }//GEN-LAST:event_cbxEspecialidadItemStateChanged

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
    private javax.swing.JComboBox<String> cbxMedicoDisponible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblDiagnostico;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoDoc;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDoc;
    // End of variables declaration//GEN-END:variables
}

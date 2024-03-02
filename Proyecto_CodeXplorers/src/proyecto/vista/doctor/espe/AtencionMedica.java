package proyecto.vista.doctor.espe;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import proyecto.modelo.espe.Doctor;
import proyecto.servicio.espe.DoctorServicio;

import proyecto.vista.perfil.espe.MenuPrincipal;

/**
 *
 * @author Usuario
 */
public final class AtencionMedica extends javax.swing.JFrame {
    
    private DefaultTableModel modeloTabla;
    List<Doctor> listaPacientes = null;
    public static String codCedula = "";
    
    public AtencionMedica() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        cargarPaciente();
    }
    
    public void cargarPaciente() {
        cbxCedula.setSelectedItem("Todos");
        listaPacientes = DoctorServicio.ListarPaciente();
        cargarTablaTodosPacientes(listaPacientes);
        cargarComboCedula(listaPacientes);
    }
    
    public void cargarComboCedula(List<Doctor> listarPacientes) {
        for (Doctor doc : listarPacientes) {
            cbxCedula.addItem(doc.getCedula() + " - " + doc.getApellido() + " " + doc.getNombre());
        }
    }
    
    public void limpiarTabla() {
        modeloTabla = (DefaultTableModel) tblPacientes.getModel();
        modeloTabla.setRowCount(0);
    }
    
    public void cargarTablaTodosPacientes(List<Doctor> listaPacientes) {
        limpiarTabla();
        for (Doctor doctor : listaPacientes) {
            modeloTabla.addRow(new Object[]{
                doctor.getCedula(),
                doctor.getNombre(),
                doctor.getApellido(),
                doctor.getEdad(),
                doctor.getGenero()
            });
        }
    }
    
    public void cargarTablaBusqueda(String cedula) {
        limpiarTabla();
        Doctor doctor = DoctorServicio.BuscarCedulaPaciente(cedula);
        modeloTabla.addRow(new Object[]{
            doctor.getCedula(),
            doctor.getNombre(),
            doctor.getApellido(),
            doctor.getEdad(),
            doctor.getGenero()
        
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        btnAtender = new javax.swing.JButton();
        lblCedula = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        cbxCedula = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Atencion Medica");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Edad", "Genero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPacientes);
        if (tblPacientes.getColumnModel().getColumnCount() > 0) {
            tblPacientes.getColumnModel().getColumn(0).setResizable(false);
            tblPacientes.getColumnModel().getColumn(1).setResizable(false);
            tblPacientes.getColumnModel().getColumn(2).setResizable(false);
            tblPacientes.getColumnModel().getColumn(3).setResizable(false);
            tblPacientes.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 530, 210));

        btnAtender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Atender_icono.png"))); // NOI18N
        btnAtender.setText("Atender");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        lblCedula.setText("Busqueda por cedula");
        jPanel1.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_volver48.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        cbxCedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione un registro--", " " }));
        jPanel1.add(cbxCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 180, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_atencionmed.jpg"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 552, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        ConsultaPaciente consulta = new ConsultaPaciente();
        consulta.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnAtenderActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        limpiarTabla();
        if (cbxCedula.getSelectedItem() == "Todos") {
            listaPacientes = DoctorServicio.ListarPaciente();
            cargarTablaTodosPacientes(listaPacientes);
        } else {
            String dato = cbxCedula.getSelectedItem().toString();
            String[] cedula = dato.split("-");
            cargarTablaBusqueda(cedula[0].trim());
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(AtencionMedica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtencionMedica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtencionMedica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtencionMedica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AtencionMedica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbxCedula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTable tblPacientes;
    // End of variables declaration//GEN-END:variables
}

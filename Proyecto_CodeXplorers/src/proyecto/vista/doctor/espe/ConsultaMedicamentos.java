package proyecto.vista.doctor.espe;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.modelo.espe.Doctor;
import proyecto.servicio.espe.DoctorServicio;

/**
 *
 * @author Usuario
 */
public class ConsultaMedicamentos extends javax.swing.JFrame {

    private DefaultTableModel modeloTabla;
    Doctor medicamento = new Doctor();

    public ConsultaMedicamentos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setResizable(false);
    }

    public void limpiarTabla() {
        modeloTabla = (DefaultTableModel) tblMedicamento.getModel();
        modeloTabla.setRowCount(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicamento = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtMedicamento = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Consulta Stock Medicina");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_volver64.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        tblMedicamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Disponible", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMedicamento);
        if (tblMedicamento.getColumnModel().getColumnCount() > 0) {
            tblMedicamento.getColumnModel().getColumn(0).setResizable(false);
            tblMedicamento.getColumnModel().getColumn(1).setResizable(false);
            tblMedicamento.getColumnModel().getColumn(2).setResizable(false);
            tblMedicamento.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 670, 220));

        jLabel1.setText("Nombre Medicamento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        txtMedicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMedicamentoKeyPressed(evt);
            }
        });
        jPanel1.add(txtMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 150, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_historial.jpg"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        ConsultaPaciente consulta = new ConsultaPaciente();
        consulta.setVisible(true);
        consulta.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtMedicamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedicamentoKeyPressed

    }//GEN-LAST:event_txtMedicamentoKeyPressed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (!txtMedicamento.getText().trim().equals("")) {
            limpiarTabla();
            medicamento = new DoctorServicio().BuscarNombreMedicina(txtMedicamento.getText());
            if (medicamento != null) {
                modeloTabla.addRow(new Object[]{
                    medicamento.getNombreMed(),
                    medicamento.getDescripcionMed(),
                    medicamento.getDisponibleMed(),
                    medicamento.getTipoMed(),});
            } else {
                JOptionPane.showMessageDialog(null, "No existe el medicamento");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del medicamento");
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTable tblMedicamento;
    private javax.swing.JTextField txtMedicamento;
    // End of variables declaration//GEN-END:variables
}

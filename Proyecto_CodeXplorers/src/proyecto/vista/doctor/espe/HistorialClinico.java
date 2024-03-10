package proyecto.vista.doctor.espe;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import proyecto.modelo.espe.Doctor;
import proyecto.servicio.espe.DoctorServicio;

/**
 *
 * @author Usuario
 */
public final class HistorialClinico extends javax.swing.JFrame {

    private DefaultTableModel modeloTabla;
    List<Doctor> listaHistoriales = null;

    public HistorialClinico() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        cargarHistoriales();
        ocultarUltimasColumnas();
        mostrarContenidoUltimaColumna();
        setDateChooserToCurrentDate();

        tblHistorial.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            if (!event.getValueIsAdjusting()) {
                mostrarContenidoUltimaColumna();
            }
        });
    }

    public void ocultarUltimasColumnas() {
        int lastColumnIndex = tblHistorial.getColumnCount() - 1;
        int lastButOneColumnIndex = tblHistorial.getColumnCount() - 2;
        int lastButTwoColumnIndex = tblHistorial.getColumnCount() - 3;

        TableColumnModel columnModel = tblHistorial.getColumnModel();
        TableColumn lastColumn = columnModel.getColumn(lastColumnIndex);
        TableColumn lastButOneColumn = columnModel.getColumn(lastButOneColumnIndex);
        TableColumn lastButTwoColumn = columnModel.getColumn(lastButTwoColumnIndex);

        columnModel.removeColumn(lastColumn);
        columnModel.removeColumn(lastButOneColumn);
        columnModel.removeColumn(lastButTwoColumn);
    }

    public void mostrarContenidoUltimaColumna() {
        int antepenultimaColumnIndex = modeloTabla.getColumnCount() - 3;
        int penultimaColumnIndex = modeloTabla.getColumnCount() - 2;
        int ultimaColumnIndex = modeloTabla.getColumnCount() - 1;

        int selectedRow = tblHistorial.getSelectedRow();

        if (selectedRow != -1) {
            Object contenidoAntepenultimaColumna = modeloTabla.getValueAt(selectedRow, antepenultimaColumnIndex);
            Object contenidoPenultimaColumna = modeloTabla.getValueAt(selectedRow, penultimaColumnIndex);
            Object contenidoUltimaColumna = modeloTabla.getValueAt(selectedRow, ultimaColumnIndex);

            String contenidoTotal = "Diagnostico: " + contenidoAntepenultimaColumna.toString() + System.lineSeparator()
                    + "Medicamento: " + contenidoPenultimaColumna.toString() + System.lineSeparator()
                    + "Cantidad del medicamento: " + contenidoUltimaColumna.toString();

            AreaDiagnostico.setText(contenidoTotal);
        } else {
            AreaDiagnostico.setText("");
        }
    }

    public void setDateChooserToCurrentDate() {

        LocalDate currentDate = LocalDate.now();

        Date date = Date.from(currentDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        fechaCreacion.setDate(date);
    }

    public void cargarHistoriales() {
        cbxHistoriales.setSelectedItem("Todos");
        listaHistoriales = DoctorServicio.ListarHistoriales();
        cargarTablaTodosHistoriales(listaHistoriales);
        cargarComboHistoriales(listaHistoriales);
    }

    public void cargarComboHistoriales(List<Doctor> listarHistoriales) {
        for (Doctor historial : listarHistoriales) {
            cbxHistoriales.addItem(historial.getCedula() + " - " + historial.getNombreDoc());
        }
    }

    public void limpiarTabla() {
        modeloTabla = (DefaultTableModel) tblHistorial.getModel();
        modeloTabla.setRowCount(0);
    }

    public void cargarTablaTodosHistoriales(List<Doctor> listaHistorial) {
        limpiarTabla();
        for (Doctor historial : listaHistorial) {

            modeloTabla.addRow(new Object[]{
                historial.getCedula(),
                historial.getNombre(),
                historial.getApellido(),
                historial.getEdad(),
                historial.getGenero(),
                historial.getNombreDoc(),
                historial.getApellidoDoc(),
                historial.getEspecialidad(),
                historial.getiDdoctor(),
                historial.getDiagnostico(),
                historial.getPastillaDoc(),
                historial.getCantidadMed()
            });

        }

    }

    public void cargarTablaBusqueda(String cedula) {
        limpiarTabla();
        Doctor historial = DoctorServicio.BuscarHistorial(cedula);
        System.out.println(historial);

        modeloTabla.addRow(new Object[]{
            historial.getCedula(),
            historial.getNombre(),
            historial.getApellido(),
            historial.getEdad(),
            historial.getGenero(),
            historial.getNombreDoc(),
            historial.getApellidoDoc(),
            historial.getEspecialidad(),
            historial.getiDdoctor(),
            historial.getDiagnostico(),
            historial.getPastillaDoc(),
            historial.getCantidadMed()
        });

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fechaCreacion = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaDiagnostico = new javax.swing.JTextArea();
        btnConsultar = new javax.swing.JButton();
        cbxHistoriales = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHistorial = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        jLabel2.setText("Historial Clinico");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Datos ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setText("Fecha de consulta");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jLabel4.setText("Observaciones y diagnostico");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Historial Clinico");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        fechaCreacion.setEnabled(false);
        jPanel2.add(fechaCreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 190, -1));

        AreaDiagnostico.setEditable(false);
        AreaDiagnostico.setColumns(20);
        AreaDiagnostico.setRows(5);
        AreaDiagnostico.setEnabled(false);
        jScrollPane1.setViewportView(AreaDiagnostico);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 710, 150));

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_consulta.png"))); // NOI18N
        btnConsultar.setText("Consultar historiales");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        cbxHistoriales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        jPanel2.add(cbxHistoriales, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 190, 20));

        tblHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula Paciente", "Nombre Paciente", "Apellido Paciente", "Edad Paciente", "Genero Paciente", "Nombre Doctor", "Apellido Doctor", "Especialidad", "ID Doctor", "Diagnostico", "Medicamento", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHistorial);
        if (tblHistorial.getColumnModel().getColumnCount() > 0) {
            tblHistorial.getColumnModel().getColumn(0).setResizable(false);
            tblHistorial.getColumnModel().getColumn(1).setResizable(false);
            tblHistorial.getColumnModel().getColumn(2).setResizable(false);
            tblHistorial.getColumnModel().getColumn(3).setResizable(false);
            tblHistorial.getColumnModel().getColumn(4).setResizable(false);
            tblHistorial.getColumnModel().getColumn(5).setResizable(false);
            tblHistorial.getColumnModel().getColumn(6).setResizable(false);
            tblHistorial.getColumnModel().getColumn(7).setResizable(false);
            tblHistorial.getColumnModel().getColumn(8).setResizable(false);
            tblHistorial.getColumnModel().getColumn(9).setResizable(false);
            tblHistorial.getColumnModel().getColumn(10).setResizable(false);
            tblHistorial.getColumnModel().getColumn(11).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 790, 200));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_regresar.png"))); // NOI18N
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_histMed.jpg"))); // NOI18N
        jPanel2.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        limpiarTabla();
        if (cbxHistoriales.getSelectedItem() == "Todos") {
            listaHistoriales = DoctorServicio.ListarHistoriales();
            cargarTablaTodosHistoriales(listaHistoriales);
        } else {
            String dato = cbxHistoriales.getSelectedItem().toString();
            String[] cedula = dato.split("-");
            cargarTablaBusqueda(cedula[0].trim());
            Doctor historialSeleccionado = DoctorServicio.BuscarHistorial(cedula[0].trim());

        }

    }//GEN-LAST:event_btnConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(HistorialClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HistorialClinico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaDiagnostico;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbxHistoriales;
    private com.toedter.calendar.JDateChooser fechaCreacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTable tblHistorial;
    // End of variables declaration//GEN-END:variables
}

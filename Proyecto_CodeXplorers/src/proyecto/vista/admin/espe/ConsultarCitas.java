/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.vista.admin.espe;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import proyecto.modelo.espe.Doctor;
import proyecto.modelo.espe.Paciente;
import proyecto.servicio.espe.CitaServicioAD;

/**
 *
 * @author Aliss
 */
public class ConsultarCitas extends javax.swing.JFrame {

    private DefaultTableModel modeloTabla;
    List<Paciente> listaPersonas = null;
    public static String codCedula = "";

    public ConsultarCitas() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        cargarRegistro();
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                abrirInicioAdmin();
            }
        });
        setLocationRelativeTo(null);
    }
    private void abrirInicioAdmin() {
        // Aquí, instancias y muestras tu frame ConsultarCitas
        inicioAdmin inicio = new inicioAdmin();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    }

    public void cargarRegistro() {
        Cmb_Citas.setSelectedItem("Todos");
        CitaServicioAD cita = new CitaServicioAD();
        listaPersonas = cita.ListaCitas();     
        cargarTablaTodasRegistro(listaPersonas);
        cargarComboCedula(listaPersonas);
        
    }

    public void limpiarTabla() {
        modeloTabla = (DefaultTableModel) tbl_ConsultaPersona.getModel();
        modeloTabla.setRowCount(0);
    }

    public void cargarComboCedula(List<Paciente> listarPersonas) {
        for (Paciente person : listarPersonas) {
            Cmb_Citas.addItem(person.getCedula() + " - " + person.getApellido());
        }
    }

    public void cargarTablaTodasRegistro(List<Paciente> listaPersonas) {
        limpiarTabla();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (Paciente persona : listaPersonas) {
            String fechaNacimientoStr = dateFormat.format(persona.getFechaNacimiento());
            int edad = calcularEdad(persona.getFechaNacimiento());
            modeloTabla.addRow(new Object[]{
                persona.getCedula(),
                persona.getApellido(),
                persona.getNombre(),
                fechaNacimientoStr,
                edad,
                persona.getTelefono(),
                persona.getDia(),
                persona.getHorario()
            });
        }
    }

    public void cargarTablaBusqueda(String cedula) {
        limpiarTabla();
        Paciente persona = new CitaServicioAD().BuscarIdCita(cedula);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fechaNacimientoStr = dateFormat.format(persona.getFechaNacimiento());
        int edad = calcularEdad(persona.getFechaNacimiento());
        modeloTabla.addRow(new Object[]{
            persona.getCedula(),
            persona.getApellido(),
            persona.getNombre(),
            fechaNacimientoStr,
            edad,
            persona.getTelefono(),
            persona.getDia(),
            persona.getHorario()
        });
    }



    private int calcularEdad(Date fechaNacimiento) {
        Calendar calNacimiento = Calendar.getInstance();
        calNacimiento.setTime(fechaNacimiento);
        int anioNacimiento = calNacimiento.get(Calendar.YEAR);

        Calendar calActual = Calendar.getInstance();
        int anioActual = calActual.get(Calendar.YEAR);

        return anioActual - anioNacimiento;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ConsultaPersona = new javax.swing.JTable();
        Cmb_Citas = new javax.swing.JComboBox<>();
        btn_Buscar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Actualizar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel2.setText("Registro de Citas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 260, 40));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("Busqueda:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        tbl_ConsultaPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Apellido", "Nombre", "Nacimiento", "Edad", "Telefono", "Dia", "Hora"
            }
        ));
        jScrollPane1.setViewportView(tbl_ConsultaPersona);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 830, 130));

        Cmb_Citas.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        Cmb_Citas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        getContentPane().add(Cmb_Citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 190, -1));

        btn_Buscar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_consulta.png"))); // NOI18N
        btn_Buscar.setText("Buscar");
        btn_Buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Buscar.setContentAreaFilled(false);
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 120, -1));

        Btn_Eliminar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        Btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Eliminar 48.png"))); // NOI18N
        Btn_Eliminar.setText("Eliminar ");
        Btn_Eliminar.setContentAreaFilled(false);
        Btn_Eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Eliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Eliminar 48.png"))); // NOI18N
        Btn_Eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Eliminar 72.png"))); // NOI18N
        Btn_Eliminar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Btn_Eliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 120, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_ConsultaCita.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 500));

        jMenu1.setText("Mas opciones");

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jMenu1.add(Actualizar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        int filaSeleccionada = tbl_ConsultaPersona.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int confirmar = JOptionPane.showConfirmDialog(null, "Seguro de eliminar el registro",
                    "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                codCedula = (String) modeloTabla.getValueAt(filaSeleccionada, 0);
                CitaServicioAD cita = new CitaServicioAD();

                if (cita.EliminarCita(codCedula)) {
                    modeloTabla.removeRow(filaSeleccionada);
                    JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                }
            } else {
                ListSelectionModel seleccionModel = tbl_ConsultaPersona.getSelectionModel();
                seleccionModel.clearSelection();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione el registro a eliminar");
        }
    }//GEN-LAST:event_Btn_EliminarActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        limpiarTabla();
        if (Cmb_Citas.getSelectedItem() == "Todos") {
            CitaServicioAD cita = new CitaServicioAD();
            listaPersonas = cita.ListaCitas();
            cargarTablaTodasRegistro(listaPersonas);
        } else {
            String dato = Cmb_Citas.getSelectedItem().toString();
            String[] cedula = dato.split("-");
            cargarTablaBusqueda(cedula[0].trim());
        }
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        int filaSeleccionada = tbl_ConsultaPersona.getSelectedRow();
        if (filaSeleccionada >= 0) {
            codCedula = (String) modeloTabla.getValueAt(filaSeleccionada, 0);
            ActualizarCitaAD modificar = new ActualizarCitaAD();
            modificar.setVisible(true);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione el registro a actualizar");
        }
    }//GEN-LAST:event_ActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Actualizar;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JComboBox<String> Cmb_Citas;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_ConsultaPersona;
    // End of variables declaration//GEN-END:variables
}

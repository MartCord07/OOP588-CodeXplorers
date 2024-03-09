/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.vista.admin.espe;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import proyecto.modelo.espe.Perfil;
import proyecto.servicio.espe.CitaServicioAD;

/**
 *
 * @author Aliss
 */
public class ConsultarUsuario extends javax.swing.JFrame {

    private DefaultTableModel modeloTabla;
    List<Perfil> listaPersonas = null;
    public static String codCedula = "";

    public ConsultarUsuario() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        cargarRegistro();
    }

    public void limpiarTabla() {
        modeloTabla = (DefaultTableModel) tbl_ConsultaPersona.getModel();
        modeloTabla.setRowCount(0);
    }

    public void cargarRegistro() {
        cmb_usuarios.setSelectedItem("Todos");
        CitaServicioAD cita = new CitaServicioAD();
        listaPersonas = cita.ListaLogin();
        cargarTablaTodasRegistro(listaPersonas);
        cargarComboCedula(listaPersonas);
    }

    public void cargarComboCedula(List<Perfil> listarPersonas) {
        for (Perfil person : listarPersonas) {
            cmb_usuarios.addItem(person.getCedulaPerfil()+ " - " + person.getTipoPerfil());
        }
    }

    public void cargarTablaTodasRegistro(List<Perfil> listaPersonas) {
        limpiarTabla();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (Perfil persona : listaPersonas) {
            modeloTabla.addRow(new Object[]{
                persona.getCedulaPerfil(),
                persona.getIdPerfil(),
                persona.getTipoPerfil(),});
        }
    }

    public void cargarTablaBusqueda(String cedula) {
        limpiarTabla();
        Perfil persona = new CitaServicioAD().buscarIdPerfil(cedula);
        modeloTabla.addRow(new Object[]{
            persona.getCedulaPerfil(),
            persona.getIdPerfil(),
            persona.getTipoPerfil(),});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ConsultaPersona = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cmb_usuarios = new javax.swing.JComboBox<>();
        btn_Buscar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Actualizar = new javax.swing.JMenu();
        ActualizarUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel2.setText("Registro de Usuarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 310, 40));

        tbl_ConsultaPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Usuario", "Id_Perfil", "Rol"
            }
        ));
        jScrollPane1.setViewportView(tbl_ConsultaPersona);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 440, 90));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("Busqueda:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        cmb_usuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        getContentPane().add(cmb_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 190, -1));

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
        getContentPane().add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 120, -1));

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
        getContentPane().add(Btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 120, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_ConsultaCita.png"))); // NOI18N
        jLabel1.setText("        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 430));

        Actualizar.setText("Mas opciones");

        ActualizarUsuario.setText("Actualizar");
        ActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarUsuarioActionPerformed(evt);
            }
        });
        Actualizar.add(ActualizarUsuario);

        jMenuBar1.add(Actualizar);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        limpiarTabla();
        if (cmb_usuarios.getSelectedItem() == "Todos") {
            CitaServicioAD cita = new CitaServicioAD();
            listaPersonas = cita.ListaLogin();
            cargarTablaTodasRegistro(listaPersonas);
        } else {
            String dato = cmb_usuarios.getSelectedItem().toString();
            String[] cedula = dato.split("-");
            cargarTablaBusqueda(cedula[0].trim());
        }
    }//GEN-LAST:event_btn_BuscarActionPerformed

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

    private void ActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarUsuarioActionPerformed
        int filaSeleccionada = tbl_ConsultaPersona.getSelectedRow();
        if (filaSeleccionada >= 0) {
            codCedula = (String) modeloTabla.getValueAt(filaSeleccionada, 0);
            ActualizarCitaAD modificar = new ActualizarCitaAD();
            modificar.setVisible(true);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione el registro a actualizar");
        }
    }//GEN-LAST:event_ActualizarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Actualizar;
    private javax.swing.JMenuItem ActualizarUsuario;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JComboBox<String> cmb_usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_ConsultaPersona;
    // End of variables declaration//GEN-END:variables
}

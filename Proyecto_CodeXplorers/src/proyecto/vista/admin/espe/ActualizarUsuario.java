/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.vista.admin.espe;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import proyecto.modelo.espe.CitaAD;
import proyecto.modelo.espe.Paciente;
import proyecto.modelo.espe.Perfil;
import proyecto.servicio.espe.CitaServicioAD;

/**
 *
 * @author Aliss
 */
public class ActualizarUsuario extends javax.swing.JFrame {

    CitaServicioAD perfilcita = new CitaServicioAD();
    String cedula = null;
    Perfil persona = null;
    int idPerfil = 0;
    private List<Perfil> listaPerfiles = perfilcita.ListaLogin();

    public ActualizarUsuario() {
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        initComponents();
        txt_Usuario.setEnabled(false);
        ConsultarUsuario dato = new ConsultarUsuario();
        cedula = dato.codCedula;
        cargarDatos();
        setLocationRelativeTo(null);
       
    }


    public void limpiarDatos() {
        txt_Usuario.setText("");
        cbm_perfil.setSelectedItem("Seleccione");
        
    }

    public void cargarComboPerfil(int idPerfil) {
        cbm_perfil.removeAllItems(); // Limpiar el combo antes de agregar elementos

        for (Perfil rol : listaPerfiles) {
            String item = rol.getIdPerfil() + "-" + rol.getTipoPerfil();
            cbm_perfil.addItem(item);

            // Seleccionar el perfil por defecto
            if (idPerfil == rol.getIdPerfil()) {
                cbm_perfil.setSelectedItem(item);
            }
        }
    }

    public void cargarDatos() {

        persona = perfilcita.buscarIdPerfil(cedula);
        txt_Usuario.setText(persona.getCedulaPerfil());
        cbm_perfil.addItem(persona.getIdPerfil() + " - " + persona.getTipoPerfil());
        cargarComboPerfil(persona.getIdPerfil());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        cbm_perfil = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        BtnModificra = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel2.setText("Actualizar Perfil");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 260, 40));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("Perfil:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txt_Usuario.setEditable(false);
        txt_Usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 170, 30));

        cbm_perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        getContentPane().add(cbm_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 140, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setText("Usuario:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        BtnModificra.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        BtnModificra.setText("Modificar");
        BtnModificra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificraActionPerformed(evt);
            }
        });
        getContentPane().add(BtnModificra, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        btnsalir.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_volver48.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.setContentAreaFilled(false);
        btnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 60, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_registro.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnModificraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificraActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(this, "Seguro de guardar datos", "Ingreso de Datos", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirmacion == JOptionPane.OK_OPTION) {
            String dato = cbm_perfil.getSelectedItem().toString();
            String[] perfil = dato.split("-");
            idPerfil = Integer.parseInt(perfil[0].trim());

            CitaAD persona = new CitaAD(idPerfil, txt_Usuario.getText());

            if (idPerfil == 2) {
                // Si el id_Perfil es 2, abrir el JFrame de ingreso de administrador
                IngresoAdmin ingresoAdmin = new IngresoAdmin();
                ingresoAdmin.setIdUsuarioActualizar(idPerfil);
                ingresoAdmin.setVisible(true);
                setVisible(false);
                JOptionPane.showMessageDialog(null, "Ingrese los datos del nuevo administrador");

            } else {
                // Para otros id_Perfil, continuar con la actualización sin abrir el JFrame de ingreso de administrador
                if (perfilcita.ActualizarUsuario(persona)) {
                    JOptionPane.showMessageDialog(null, "Registro actualizado correctamente");
                    limpiarDatos();

                } else {
                    JOptionPane.showMessageDialog(null, "No fue posible actualizar");
                }
            }
        }
    }//GEN-LAST:event_BtnModificraActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
        ConsultarUsuario menu = new ConsultarUsuario();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        setVisible(false);
    }//GEN-LAST:event_btnsalirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnModificra;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbm_perfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
